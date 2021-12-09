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
import com.project.tour_guide.data.Travel;
import com.project.tour_guide.R;

import java.util.ArrayList;

public class TravelAdapter extends ArrayAdapter<Travel> {

    public TravelAdapter(Context context, ArrayList<Travel> transport) {
        super(context, 0, transport);
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
                    R.layout.layout_travel_item);
        }

        Travel travel = getItem(position);

        if (travel != null) {
            LinearLayout layoutContainer = itemView.findViewById(R.id.item_travel_container);
            layoutContainer.setBackground(AppCompatResources.getDrawable(context,
                    travel.getBackgroundResourceID()));

            TextView textTitle = itemView.findViewById(R.id.item_travel_title);
            textTitle.setText(context.getString(travel.getTitle()));

            TextView textAbout = itemView.findViewById(R.id.item_travel_about);
            textAbout.setText(context.getString(travel.getAbout()));

            ImageView imageTransport = itemView.findViewById(R.id.item_travel_image);
            imageTransport.setImageDrawable(AppCompatResources.getDrawable(context,
                    travel.getImageResourceID()));
        }

        return itemView;
    }
}
