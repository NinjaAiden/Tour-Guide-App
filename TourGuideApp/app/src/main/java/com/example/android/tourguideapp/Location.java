package com.example.android.tourguideapp;

/**
 * Created by Aiden on 21/04/2018.
 */

public class Location {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Location of item
     */
    private String mLocationName;

    /**
     * description of location
     */
    private String mDescription;

    /**
     * Create a new Word object.
     *
     * @param locationName, name of location
     * @param description,  description of location
     */
    public Location(String locationName, String description) {
        mLocationName = locationName;
        mDescription = description;
    }

    public Location(String locationName, String description, int ImageResourceId) {
        mLocationName = locationName;
        mDescription = description;
        mImageResourceId = ImageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the location name
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the description of location
     */
    public String getDescription() {
        return mDescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}