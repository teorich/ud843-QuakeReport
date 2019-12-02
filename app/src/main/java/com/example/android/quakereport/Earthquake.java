package com.example.android.quakereport;

import android.net.Uri;

public class Earthquake {

    //magnitude
    private double mMagnitude;


    private  String mLocation;


    private  Long mTimeMilliseconds;

    private Uri mlink;




    public Earthquake(double mMagnitude, String mLocation, Long mDate, Uri link) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeMilliseconds = mDate;
        this.mlink = link;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getmTimeMilliseconds() {
        return mTimeMilliseconds;
    }

    public Uri getMlink() {
        return mlink;
    }
}
