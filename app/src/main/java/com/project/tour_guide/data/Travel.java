package com.project.tour_guide.data;

import android.os.Parcel;
import android.os.Parcelable;

public class Travel implements Parcelable {
    private final int title;
    private final int about;
    private final int location;
    private final int imageResourceID;
    private final int backgroundResourceID;

    public Travel(int title, int about, int location, int imageResourceID, int backgroundResourceID) {
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

    public int getTitle() {
        return title;
    }

    public int getAbout() {
        return about;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public int getBackgroundResourceID() {
        return backgroundResourceID;
    }

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