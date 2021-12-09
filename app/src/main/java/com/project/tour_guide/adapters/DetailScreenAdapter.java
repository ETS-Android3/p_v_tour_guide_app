package com.project.tour_guide.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.project.tour_guide.CommonFunctionality;
import com.project.tour_guide.data.Location;
import com.project.tour_guide.R;

import java.util.ArrayList;

/**
 * Provides inflated View from {@link R.layout#layout_detail_item} layout to a ListView.
 */
public class DetailScreenAdapter extends ArrayAdapter<Location> {

    public DetailScreenAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Referencing the recycled view.
        View itemView = convertView;

        Context context = getContext();

        // Checks if "itemView" needs to be inflated.
        if (itemView == null) {
            itemView = CommonFunctionality.inflateView(context, parent,
                    R.layout.layout_detail_item);
        }

        // Get the required Location.
        Location location = getItem(position);

        // Set location values.
        if (location != null) {
            // Set Location Title.
            TextView textTitle = itemView.findViewById(R.id.item_detail_title);
            textTitle.setText(context.getString(location.getTitle()));

            // Set Location Popular
            TextView textPopular = itemView.findViewById(R.id.item_detail_popular);
            TextView labelPopular = itemView.findViewById(R.id.label_item_detail_popular);
            CommonFunctionality.setText(context, textPopular, labelPopular, location.getInfo());

            // Set Location Average Cost
            TextView textCost = itemView.findViewById(R.id.item_detail_avg_cost);
            TextView labelCost = itemView.findViewById(R.id.label_item_detail_cost);
            CommonFunctionality.setText(context, textCost, labelCost, location.getAvgPrice());

            // Set Location Timings
            TextView textTimings = itemView.findViewById(R.id.item_detail_timing);
            TextView labelTimings = itemView.findViewById(R.id.label_item_detail_timing);
            CommonFunctionality.setText(context, textTimings, labelTimings, location.getTimings());
        }
        return itemView;
    }
}