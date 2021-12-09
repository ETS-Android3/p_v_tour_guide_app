package com.project.tour_guide.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.tour_guide.adapters.TravelAdapter;
import com.project.tour_guide.CommonFunctionality;
import com.project.tour_guide.data.AppData;
import com.project.tour_guide.data.Travel;
import com.project.tour_guide.R;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Fragment shows a list of {@link Travel} to visit.
 */
public class TravelFragment extends Fragment {

    // Used to restore transport spots across orientation changes.
    private static final String KEY_TRANSPORT = "transport";

    // Stores all transport spots.
    private ArrayList<Travel> mTravels;

    // It is used to parse location for Map Intent.
    private Scanner mScanner;

    // Shows messages to the user.
    private Toast mToast;

    // Required Constructor.
    public TravelFragment() {
        super(R.layout.layout_places_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        if (savedInstanceState == null) {
            // Get all transport spots.
            mTravels = AppData.getTransports();
        } else {
            // Restore all transport spots.
            mTravels = savedInstanceState.getParcelableArrayList(KEY_TRANSPORT);
        }

        ListView listView = view.findViewById(R.id.list_view);

        // Adding Header View to "ListView".
        listView.addHeaderView(CommonFunctionality.getSpaceView(view.getContext(), listView));

        // Linking a TravelAdapter (ArrayAdapter) to the "listView".
        listView.setAdapter(new TravelAdapter(view.getContext(), mTravels));

        // Attaches a ItemClickListener to open Maps app showing the clicked Travel spot.
        listView.setOnItemClickListener(((parent, itemView, position, id) -> {
            if (position != 0) {
                Travel clickedTransport = (Travel) parent.getItemAtPosition(position);
                openMaps(getData(getString(clickedTransport.getLocation()), itemView));
            }
        }));
    }

    /**
     * Parses location to Uri.
     */
    private Uri getData(String location, View view) {
        mScanner = new Scanner(location);
        return CommonFunctionality.getData(view.getContext(), mScanner);
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

        mToast = Toast.makeText(getContext(), R.string.toast_app_not_available, Toast.LENGTH_SHORT);
        mToast.show();
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

    @Override
    public void onStop() {
        super.onStop();

        // Releases Scanner memory resources.
        closeScanner();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Backing up all transport spots.
        outState.putParcelableArrayList(KEY_TRANSPORT, mTravels);
    }
}