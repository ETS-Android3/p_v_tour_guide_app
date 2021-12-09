package com.project.tour_guide;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Scanner;

/**
 * Contains methods that are used throughout the app.
 */
public class CommonFunctionality {

    // Setting default constructor to private.
    private CommonFunctionality() {
    }

    /**
     * Inflates a View from the provided layout resource.
     *
     * @param context          is used to initialize LayoutInflater.
     * @param parent           is the ViewGroup which will store the inflated View.
     * @param layoutResourceID is the layout resource xml that needs to be inflated.
     * @return a View inflated from a layout.
     */
    public static View inflateView(Context context, ViewGroup parent, int layoutResourceID) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        return inflater.inflate(layoutResourceID, parent, false);
    }

    /**
     * Inflates and returns the View from {@link R.layout#layout_space} layout.
     */
    public static View getSpaceView(Context context, ViewGroup parent) {
        return inflateView(context, parent, R.layout.layout_space);
    }

    /**
     * Sets text to a TextView. Changes its and a second TextView's visibility based on the
     * availability of data.
     *
     * @param setHere        is the TextView for which data needs to be set.
     * @param secondary      is the TextView whose visibility depends on the availability of data.
     * @param textResourceID is the resource ID pointing to a string or integer (data).
     * @return 'true' if data was available to set, otherwise 'false'.
     */
    public static boolean setText(Context context, TextView setHere, TextView secondary,
                                  int textResourceID) {
        // Checks if data is available.
        if (R.integer.data_not_available != textResourceID) {
            // Get data from resource.
            setHere.setText(context.getString(textResourceID));
            secondary.setVisibility(View.VISIBLE);
            setHere.setVisibility(View.VISIBLE);
            return true;
        } else {
            secondary.setVisibility(View.GONE);
            setHere.setVisibility(View.GONE);
            return false;
        }
    }

    /**
     * Parses and returns the location name to Uri.
     */
    public static Uri getData(Context context, Scanner scanner) {
        // Sets the delimiter pattern to a whitespace.
        scanner.useDelimiter(context.getString(R.string.delimiter));

        StringBuilder builder = new StringBuilder();

        // Adding Data URI Scheme for Maps.
        builder.append(context.getString(R.string.data_uri_scheme));

        // Replacing whitespace with a '+' sign.
        while (scanner.hasNext()) {
            String token = scanner.next();
            builder.append(token).append(context.getString(R.string.plus));
        }

        // Parses String to Uri.
        return Uri.parse(builder.toString());
    }
}