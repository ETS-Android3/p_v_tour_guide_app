package com.project.tour_guide.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Defines a location of eating joints, movie theatres, gaming centres etc.
 */
public class Location implements Parcelable {

    // Stores a String resource ID containing the name info. for this Place.
    private final int title;

    // Stores a String resource ID containing all options for "label".
    private final int info;

    // Stores a String resource ID containing average price to enter/eat at this Place.
    private final int avgPrice;

    // Stores a String resource ID containing the address info. for this Place.
    private final int location;

    /*
     * Stores a String resource ID containing timings info. about when this Place is open and
     * closed.
     */
    private final int timings;

    // Initialize a Location.
    public Location(int title, int info, int avgPrice, int location, int timings) {
        this.title = title;
        this.info = info;
        this.avgPrice = avgPrice;
        this.location = location;
        this.timings = timings;
    }

    protected Location(Parcel in) {
        title = in.readInt();
        info = in.readInt();
        avgPrice = in.readInt();
        location = in.readInt();
        timings = in.readInt();
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    /**
     * @return The name of the Location.
     */
    public int getTitle() {
        return title;
    }

    /**
     * @return Options in Location's strength.
     */
    public int getInfo() {
        return info;
    }

    /**
     * @return The average cost of meal per two people.
     */
    public int getAvgPrice() {
        return avgPrice;
    }

    /**
     * @return The address of the Location.
     */
    public int getLocation() {
        return location;
    }

    /**
     * @return String resource ID containing timings info. about when this Place is open and
     * closed.
     */
    public int getTimings() {
        return timings;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(title);
        dest.writeInt(info);
        dest.writeInt(avgPrice);
        dest.writeInt(location);
        dest.writeInt(timings);
    }
}