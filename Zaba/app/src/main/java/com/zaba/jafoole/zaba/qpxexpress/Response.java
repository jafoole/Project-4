
package com.zaba.jafoole.zaba.qpxexpress;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Response implements Serializable{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("trips")
    @Expose
    private Trips trips;

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The trips
     */
    public Trips getTrips() {
        return trips;
    }

    /**
     * 
     * @param trips
     *     The trips
     */
    public void setTrips(Trips trips) {
        this.trips = trips;
    }


}
