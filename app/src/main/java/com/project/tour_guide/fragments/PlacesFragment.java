package com.project.tour_guide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.tour_guide.adapters.MainScreenAdapter;
import com.project.tour_guide.CommonFunctionality;
import com.project.tour_guide.data.AppData;
import com.project.tour_guide.data.Place;
import com.project.tour_guide.DetailActivity;
import com.project.tour_guide.R;

import java.util.ArrayList;

/**
 * Fragment shows a list of {@link Place} to visit.
 */
public class PlacesFragment extends Fragment {

    /*
     * Represents the category in which this Place belongs:
     * 0 -> "Places To Visit"
     * 1 -> "Places To Eat"
     * 2 -> "Nightlife"
     */
    private int category;

    private static final String KEY_PLACES = "places";

    private ArrayList<Place> mPlaces;

    // Required Default Constructor.
    public PlacesFragment() {
    }

    /**
     * Initializes a Fragment showing a list of {@link com.project.tour_guide.data.Place}.
     *
     * @param category in which the places in this Fragment belongs to:
     *                 0 -> "Places To Visit"
     *                 1 -> "Places To Eat"
     *                 2 -> "Nightlife"
     */
    public PlacesFragment(int category) {
        this.category = category;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_places_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        if (savedInstanceState == null) {
            // Getting Places based on places category.
            mPlaces = AppData.getPlacesForMainScreen(category);
        } else {
            // Restoring Places.
            mPlaces = savedInstanceState.getParcelableArrayList(KEY_PLACES);
        }

        // Initialize ListView.
        ListView listView = view.findViewById(R.id.list_view);

        // Adding Header View to "ListView".
        listView.addHeaderView(CommonFunctionality.getSpaceView(view.getContext(), listView));

        // Linking MainScreenAdapter (ArrayAdapter) to "listView".
        listView.setAdapter(new MainScreenAdapter(getContext(), mPlaces));

        // Attaching a callback to open DetailActivity showing the clicked Place (item).
        listView.setOnItemClickListener(((parent, placeView, position, id) ->
                openDetailScreen((Place) parent.getItemAtPosition(position), position)));
    }

    /**
     * Opens up the {@link DetailActivity} which shows the clicked Place.
     *
     * @param clickedPlace is the clicked Place in the ListView.
     * @param position     is the position of the clicked Place in the ListView.
     */
    private void openDetailScreen(Place clickedPlace, int position) {
        if (position != 0) {
            Intent intent = new Intent(getContext(), DetailActivity.class);
            // Passing the clicked Place through "intent".
            intent.putExtra(DetailActivity.EXTRA_PLACE, clickedPlace);
            // Passing the position of the clicked Place in ListView.
            intent.putExtra(DetailActivity.EXTRA_INDEX, position);
            startActivity(intent);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Backing up list of places.
        outState.putParcelableArrayList(KEY_PLACES, mPlaces);
    }
}