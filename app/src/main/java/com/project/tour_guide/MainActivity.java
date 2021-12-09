package com.project.tour_guide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;

import com.project.tour_guide.fragments.PlacesFragment;
import com.project.tour_guide.fragments.TravelFragment;
import com.project.tour_guide.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Performs View Binding.
    private ActivityMainBinding mBinding;

    // Used for restoring title of the current selected category across orientation change.
    private static final String KEY_TITLE = "title";

    // Represents the current category of Places the user is viewing.
    private static String title = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Removing StatusBar when device is in landscape mode.
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        // Initializing LayoutInflater.
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        // Setting up View Binding.
        mBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(mBinding.getRoot());

        // Restoring Title.
        if (savedInstanceState != null && savedInstanceState.containsKey(KEY_TITLE)) {
            title = savedInstanceState.getString(KEY_TITLE, getString(R.string.category_visit));
            setTitle(title);
        }

        // Handles adding, removing, and replacing Fragments.
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Replacing default ActionBar with MaterialToolBar.
        setSupportActionBar(mBinding.toolbar);

        // Opens Navigation Drawer when user clicks the "Navigation" icon in the ToolBar.
        mBinding.toolbar.setNavigationOnClickListener(view ->
                mBinding.drawerLayout.openDrawer(GravityCompat.START));

        // Setting up NavigationView to open Fragments containing places.
        mBinding.navigationView.setNavigationItemSelectedListener(item -> {

            // Get clicked Item ID.
            int itemID = item.getItemId();

            // Checks if user clicked "Visit" MenuItem.
            if (itemID == R.id.item_drawer_visit) {
                fragmentManager.beginTransaction().replace(R.id.fragment_container_view,
                        new PlacesFragment(0)).commit();

                // Updating Title.
                title = getString(R.string.category_visit);
            }

            // Checks if user clicked "Eat" MenuItem.
            else if (itemID == R.id.item_drawer_eat) {
                fragmentManager.beginTransaction().replace(R.id.fragment_container_view,
                        new PlacesFragment(1)).commit();

                // Updating Title.
                title = getString(R.string.category_eat);
            }

            // Checks if user clicked "Night" MenuItem.
            else if (itemID == R.id.item_drawer_night_life) {
                fragmentManager.beginTransaction().replace(R.id.fragment_container_view,
                        new PlacesFragment(2)).commit();

                // Updating Title.
                title = getString(R.string.category_night_life);
            }

            // Checks if user clicked "Travel" MenuItem.
            else if (itemID == R.id.item_drawer_travel) {
                fragmentManager.beginTransaction().replace(R.id.fragment_container_view,
                        new TravelFragment()).commit();

                // Updating Title.
                title = getString(R.string.category_travel);
            }

            // Set Title.
            setTitle(title);

            // Closes the Navigation Drawer.
            mBinding.drawerLayout.closeDrawer(GravityCompat.START);

            return true;
        });

        // When user opens app for the first time.
        if (savedInstanceState == null) {
            // Checks "Visit" MenuItem in NavigationView.
            mBinding.navigationView.setCheckedItem(R.id.item_drawer_visit);

            // Setting title as "Places To Visit" by default.
            title = getString(R.string.category_visit);
            setTitle(title);

            // Show "Places To Visit" by default.
            fragmentManager.beginTransaction().replace(R.id.fragment_container_view,
                    new PlacesFragment(0)).commit();
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Backing up title.
        outState.putString(KEY_TITLE, title);
    }

    @Override
    public void onBackPressed() {
        /*
         * Prevents closing the app when user presses the "Back" navigation button while the
         * Navigation Drawer is already open.
         */
        if (mBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            // Closes the Navigation Drawer.
            mBinding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}