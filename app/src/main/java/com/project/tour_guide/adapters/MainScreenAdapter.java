package com.project.tour_guide.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;

import com.project.tour_guide.CommonFunctionality;
import com.project.tour_guide.data.Place;
import com.project.tour_guide.R;

import java.util.ArrayList;

/**
 * Provides inflate View from {@link com.project.tour_guide.R.layout#layout_main_item} layout to a
 * ListView.
 */
public class MainScreenAdapter extends ArrayAdapter<Place> {

    public MainScreenAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Referencing the recycled view.
        View itemView = convertView;

        Context context = getContext();

        // Checks if "itemView" needs to be inflated.
        if (itemView == null) {
            itemView = CommonFunctionality.inflateView(context, parent, R.layout.layout_main_item);
        }

        // Get the required Place.
        Place place = getItem(position);

        // Set place values.
        if (place != null) {

            // Get Place Category.
            int category = place.getCategory();

            // Hide "layoutContainer" for categories "Places To Eat" and "Night Life".
            LinearLayout layoutContainer = itemView.findViewById(R.id.main_layout_container);

            if (category != 0) {
                layoutContainer.setVisibility(View.GONE);
            } else {
                // Set Timings.
                boolean timingsAvailable = CommonFunctionality.setText(context,
                        itemView.findViewById(R.id.item_main_timings),
                        itemView.findViewById(R.id.item_main_label_timings), place.getTimings());

                // Set Entry Fee.
                boolean textEntryAvailable = CommonFunctionality.setText(context,
                        itemView.findViewById(R.id.item_main_fee),
                        itemView.findViewById(R.id.item_main_label_entry_fee), place.getEntryFee());

                // Hide "layoutContainer" if "Timings" and "Entry Fee" for a Place is NA.
                if (timingsAvailable || textEntryAvailable) {
                    layoutContainer.setVisibility(View.VISIBLE);
                } else {
                    layoutContainer.setVisibility(View.GONE);
                }
            }

            // Set place image.
            ImageView imagePlace = itemView.findViewById(R.id.item_main_image);
            imagePlace.setImageDrawable(AppCompatResources.getDrawable(getContext(),
                    place.getImage()));

            // Set place title.
            TextView textTitle = itemView.findViewById(R.id.item_main_title);
            textTitle.setText(context.getString(place.getTitle()));

            // Set place detail.
            TextView textDetail = itemView.findViewById(R.id.item_main_detail);
            textDetail.setText(context.getString(place.getDetail()));
        }
        return itemView;
    }
}