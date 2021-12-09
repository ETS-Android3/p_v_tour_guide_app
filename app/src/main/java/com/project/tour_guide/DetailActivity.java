package com.project.tour_guide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.project.tour_guide.adapters.DetailScreenAdapter;
import com.project.tour_guide.data.AppData;
import com.project.tour_guide.data.Location;
import com.project.tour_guide.data.Place;
import com.project.tour_guide.databinding.ActivityDetailBinding;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Activity shows the user clicked {@link Place} in the
 * {@link com.project.tour_guide.fragments.PlacesFragment} Fragment.
 */
public class DetailActivity extends AppCompatActivity {

    // Used for adding extra Parcelable containing the clicked Place to Intent.
    public static final String EXTRA_PLACE = "com.project.tour_guide.Place";

    // Used for adding extra integer containing the index of the clicked Place in a list.
    public static final String EXTRA_INDEX = "com.project.tour_guide.Index";

    /**
     * Place clicked by the user in {@link com.project.tour_guide.fragments.PlacesFragment}
     * Fragment.
     */
    private Place mUserClickedPlace;

    /**
     * ArrayList contains {@link Location} that belongs to the clicked {@link Place} under
     * either "Places To Eat" or "Night Life" category.
     */
    private ArrayList<Location> mLocations;

    // Performs View Binding.
    private ActivityDetailBinding mBinding;

    // Used to restore the user clicked Place across orientation changes.
    private static final String KEY_PLACE = "place";

    // Used to restore the list of Location across orientation changes.
    private static final String KEY_LOCATIONS = "locations";

    // Shows messages to the user.
    private Toast mToast;

    // It is used to parse location for Map Intent.
    private Scanner mScanner;

    // OnClickListener is attached to all Chips.
    private final View.OnClickListener chipClickListener = view -> {
        int clickedChipID = view.getId();
        String location = "";

        if (clickedChipID == R.id.detail_item_chip_metro) {
            location = getString(mUserClickedPlace.getNearestMetro());
        } else if (clickedChipID == R.id.detail_item_chip_hospital) {
            location = getString(mUserClickedPlace.getNearestHospital());
        } else if (clickedChipID == R.id.detail_item_chip_station) {
            location = getString(mUserClickedPlace.getNearestPoliceStation());
        }

        // Show location on a maps app.
        openMaps(getData(location));
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Removing Status Bar.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Initializing LayoutInflater.
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        // Performs View Binding.
        mBinding = ActivityDetailBinding.inflate(layoutInflater);
        setContentView(mBinding.getRoot());

        // Replace ActionBar as ToolBar.
        setSupportActionBar(mBinding.detailVisitToolbar);

        // Represents the place category.
        int category = 0;

        // Represents the position of Place in ListView.
        int index = 0;

        if (savedInstanceState == null) {
            // Get the Intent that started this Activity.
            Intent intent = getIntent();
            if (intent == null) {
                return;
            }

            // Get the user clicked Place.
            if (intent.hasExtra(EXTRA_PLACE)) {
                mUserClickedPlace = intent.getParcelableExtra(EXTRA_PLACE);

                // Get Place category.
                category = mUserClickedPlace.getCategory();

                // Get locations under Place if it belongs under "Places To Eat" or "Night Life".
                if (category != 0) {

                    // Get the position of the clicked Place.
                    if (intent.hasExtra(EXTRA_INDEX)) {
                        index = intent.getIntExtra(EXTRA_INDEX, 0);
                    }

                    // Get locations under this Place.
                    mLocations = AppData.getLocationsUnderPlace(category, index);
                }
            }
        } else {
            // Restoring user clicked Place.
            mUserClickedPlace = savedInstanceState.getParcelable(KEY_PLACE);

            // Restoring place category.
            category = mUserClickedPlace.getCategory();

            // Restoring locations if Place belongs under "Places To Eat" or "Night Life".
            if (category != 0) {
                mLocations = savedInstanceState.getParcelableArrayList(KEY_LOCATIONS);
            }
        }

        // Checks if user clicked Place from the "Places To Visit" category.
        if (category == 0) {

            // Show "Places To Visit" Container.
            showPlacesToVisitContainer();

            // Sets places' title, image and detail.
            setCommonDetails(mBinding.detailItemImage, mBinding.detailItemDetail);

            /*
             * Attaching Listener to get callback when "Metro" Chip is clicked to show nearest
             * Metro Station on a Maps app.
             */
            mBinding.detailItemChipMetro.setOnClickListener(chipClickListener);

            /*
             * Attaching Listener to get callback when "Hospital" Chip is clicked to show nearest
             * Hospital on a Maps app.
             */
            mBinding.detailItemChipHospital.setOnClickListener(chipClickListener);

            /*
             * Attaching Listener to get callback when "Station" Chip is clicked to show nearest
             * Police Station on a Maps app.
             */
            mBinding.detailItemChipStation.setOnClickListener(chipClickListener);

            // Set timings.
            boolean timingsAvailable = CommonFunctionality.setText(this,
                    mBinding.detailTimings, mBinding.detailLabelTimings,
                    mUserClickedPlace.getTimings());

            // Set Entry Fee.
            boolean entryFeeAvailable = CommonFunctionality.setText(this,
                    mBinding.detailFee, mBinding.detailLabelEntryFee,
                    mUserClickedPlace.getEntryFee());

            // Hide Container if neither "Timings" or "Entry Fee" available.
            if (!(timingsAvailable || entryFeeAvailable)) {
                mBinding.detailLayoutContainer.setVisibility(View.GONE);
            }
        } else {
            // Clicked Place is under "Places To Eat" or "Night Life" category.

            // Show ListView.
            showListView();

            // Inflating Header View.
            View headerView = CommonFunctionality.inflateView(this, mBinding.detailListView,
                    R.layout.layout_detail_header);

            // Sets places' title, image and detail.
            setCommonDetails(headerView.findViewById(R.id.header_detail_item_image),
                    headerView.findViewById(R.id.header_detail_item_detail));

            // Adding Header View to ListView.
            mBinding.detailListView.addHeaderView(headerView);

            // Set ArrayAdapter to ListView.
            mBinding.detailListView.setAdapter(new DetailScreenAdapter(this,
                    mLocations));

            // Attaches a ItemClickListener to open Maps app showing the clicked Location.
            mBinding.detailListView.setOnItemClickListener(((parent, view, position, id) -> {
                if (position != 0) {
                    Location clickedLocation = (Location) parent.getItemAtPosition(position);
                    // Combines Title and Address.
                    String name = getString(clickedLocation.getTitle()) + " " +
                            getString(clickedLocation.getLocation());
                    // Pass this info. to locate clicked Location on maps.
                    openMaps(getData(name));
                }
            }));
        }
    }

    /**
     * Starts an Implicit Intent to show clicked Location in a Maps app.
     *
     * @param geoLocation contains location data to be sent.
     */
    private void openMaps(Uri geoLocation) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(geoLocation);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            // No Maps app found. Notifying user via Toast.
            showAppNotAvailableToast();
            closeScanner();
        }
    }

    /**
     * Clears Scanner memory resources.
     */
    private void closeScanner() {
        if (mScanner != null) {
            mScanner.close();
            mScanner = null;
        }
    }

    /**
     * Shows a Toast informing user that there are no maps app present in their device.
     */
    private void showAppNotAvailableToast() {
        // Clears any previous Toast, if showing.
        if (mToast != null) {
            mToast.cancel();
        }

        mToast = Toast.makeText(this, R.string.toast_app_not_available, Toast.LENGTH_SHORT);
        mToast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Releases Scanner memory resources.
        closeScanner();
    }

    /**
     * Parses location to Uri.
     */
    private Uri getData(String location) {
        mScanner = new Scanner(location);
        return CommonFunctionality.getData(this, mScanner);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Backing up the user clicked Place.
        outState.putParcelable(KEY_PLACE, mUserClickedPlace);

        // Backing up Locations under clicked Place if category is not "Places To Visit".
        if (mUserClickedPlace.getCategory() != 0) {
            outState.putParcelableArrayList(KEY_LOCATIONS, mLocations);
        }
    }

    /**
     * Shows ListView containing list of {@link Location}.
     */
    private void showListView() {
        // Hide the Visit Container.
        mBinding.detailVisitContainer.setVisibility(View.GONE);

        // Show the ListView.
        mBinding.detailListView.setVisibility(View.VISIBLE);
    }

    /**
     * Shows ScrollView containing Place under "Places To Visit" category.
     */
    private void showPlacesToVisitContainer() {
        // Hide the ListView.
        mBinding.detailListView.setVisibility(View.GONE);

        // Show the Visit Container.
        mBinding.detailVisitContainer.setVisibility(View.VISIBLE);
    }

    /**
     * Sets the name, image, and detail of the clicked {@link Place}.
     *
     * @param image   is the ImageView that will show the image of the place.
     * @param details is the TextView which shows the detail info. of the place.
     */
    private void setCommonDetails(ImageView image, TextView details) {
        // Set Title.
        setTitle(getString(mUserClickedPlace.getTitle()));

        // Set image.
        image.setImageDrawable(AppCompatResources.getDrawable(this,
                mUserClickedPlace.getImage()));

        // Set details.
        details.setText(getString(mUserClickedPlace.getDetail()));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Checks if user clicked the "Up" Navigation Button.
        if (item.getItemId() == android.R.id.home) {
            // Making "Up" Button behave like Back Button.
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}