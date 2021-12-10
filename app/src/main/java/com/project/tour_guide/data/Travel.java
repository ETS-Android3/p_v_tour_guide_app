package com.project.tour_guide.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Defines the mode of transportation one can use to travel domestic or international from Delhi.
 */
public class Travel implements Parcelable {
    // Stores a String resource ID containing the title of either an airport or a railway station.
    private final int title;

    // Stores a String resource ID containing some additional info. about the mode of transportation.
    private final int about;

    // Stores a String resource ID containing the address of this place.
    private final int location;

    // Stores a drawable resource ID containing the image based on the mode of transportation.
    private final int imageResourceID;

    // Stores a drawable resource ID containing the ripple background for this place.
    private final int backgroundResourceID;

    /**
     * Initializes a Travel object containing basic information about how to travel international
     * or domestic from Delhi.
     *
     * @param title                is the name of the mode of transportation - Airports,
     *                             Railway Stations etc.
     * @param about                is some additional info. regarding mode of transportation.
     * @param location             is the address where one can go to travel beyond Delhi.
     * @param imageResourceID      is an image resource ID showing a logo based on the mode of
     *                             transportation.
     * @param backgroundResourceID is a drawable resource ID that will contain contents of this
     *                             object.
     */
    public Travel(int title, int about, int location, int imageResourceID,
                  int backgroundResourceID) {
        this.title = title;
        this.about = about;
        this.location = location;
        this.imageResourceID = imageResourceID;
        this.backgroundResourceID = backgroundResourceID;
    }

    protected Travel(Parcel in) {
        title = in.readInt();
        about = in.readInt();
        location = in.readInt();
        imageResourceID = in.readInt();
        backgroundResourceID = in.readInt();
    }

    public static final Creator<Travel> CREATOR = new Creator<Travel>() {
        @Override
        public Travel createFromParcel(Parcel in) {
            return new Travel(in);
        }

        @Override
        public Travel[] newArray(int size) {
            return new Travel[size];
        }
    };

    /**
     * @return String resource ID containing name info. about the transportation mode.
     */
    public int getTitle() {
        return title;
    }

    /**
     * @return String resource ID containing additional info. about the place.
     */
    public int getAbout() {
        return about;
    }

    /**
     * @return Drawable resource ID representing the mode of transportation.
     */
    public int getImageResourceID() {
        return imageResourceID;
    }

    /**
     * @return Drawable resource ID used to set as background to View that places all contents
     * of Travel object.
     */
    public int getBackgroundResourceID() {
        return backgroundResourceID;
    }

    /**
     * @return The location where one can go to travel beyond Delhi.
     */
    public int getLocation() {
        return location;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(title);
        dest.writeInt(about);
        dest.writeInt(location);
        dest.writeInt(imageResourceID);
        dest.writeInt(backgroundResourceID);
    }
}