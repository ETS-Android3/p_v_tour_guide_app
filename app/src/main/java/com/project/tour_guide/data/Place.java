package com.project.tour_guide.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Defines a Place.
 */
public class Place implements Parcelable {

    /*
     * Represents the category in which this Place belongs:
     * 0 -> "Places To Visit"
     * 1 -> "Places To Eat"
     * 2 -> "Nightlife"
     */
    private final int category;

    // Stores the String resource ID containing the name info. for this Place.
    private final int title;

    // Stores the String resource ID containing detail info. for this Place.
    private final int detail;

    /*
     * Stores the String resource ID containing timings info. about when this Place is open and
     * closed.
     */
    private int timings;

    // Stores the String resource ID containing entry fee required to visit this Place.
    private int entryFee;

    // Stores the drawable resource ID containing an image for this Place.
    private final int image;

    private int nearestMetro;
    private int nearestHospital;
    private int nearestPoliceStation;

    /**
     * Initializes a Place object for "Places To Eat" and "Night Life" location category.
     *
     * @param category is the category in which this Place belongs.
     * @param title    is the name of the Place.
     * @param detail   provides more info. about this Place.
     * @param image    is the image resource ID containing image of this Place.
     */
    public Place(int category, int title, int detail, int image) {
        this.category = category;
        this.title = title;
        this.detail = detail;
        this.image = image;
    }

    /**
     * Initializes a Place object for "Places To Visit" location category.
     *
     * @param timings  is duration at which the place is open to visit.
     * @param entryFee is required fee to enter premises.
     */
    public Place(int category, int title, int detail, int timings, int entryFee, int image,
                 int nearestMetro, int nearestHospital, int nearestPoliceStation) {
        this(category, title, detail, image);
        this.timings = timings;
        this.entryFee = entryFee;
        this.nearestMetro = nearestMetro;
        this.nearestHospital = nearestHospital;
        this.nearestPoliceStation = nearestPoliceStation;
    }


    protected Place(Parcel in) {
        category = in.readInt();
        title = in.readInt();
        detail = in.readInt();
        timings = in.readInt();
        entryFee = in.readInt();
        image = in.readInt();
        nearestMetro = in.readInt();
        nearestHospital = in.readInt();
        nearestPoliceStation = in.readInt();
    }

    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    /**
     * @return The category in which this Place belongs.
     */
    public int getCategory() {
        return category;
    }

    /**
     * @return String resource ID containing name info. about the Place.
     */
    public int getTitle() {
        return title;
    }

    /**
     * @return String resource ID containing detail info. about the Place.
     */
    public int getDetail() {
        return detail;
    }

    /**
     * @return String resource ID containing timings info. about when this Place is open and
     * closed.
     */
    public int getTimings() {
        return timings;
    }

    /**
     * @return String resource ID containing entry fee required to visit this Place.
     */
    public int getEntryFee() {
        return entryFee;
    }

    public int getNearestMetro() {
        return nearestMetro;
    }

    public int getNearestHospital() {
        return nearestHospital;
    }

    public int getNearestPoliceStation() {
        return nearestPoliceStation;
    }

    /**
     * @return Drawable resource ID containing an image about the Place.
     */
    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(category);
        dest.writeInt(title);
        dest.writeInt(detail);
        dest.writeInt(timings);
        dest.writeInt(entryFee);
        dest.writeInt(image);
        dest.writeInt(nearestMetro);
        dest.writeInt(nearestHospital);
        dest.writeInt(nearestPoliceStation);
    }
}