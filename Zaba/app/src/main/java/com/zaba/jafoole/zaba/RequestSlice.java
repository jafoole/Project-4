
package com.zaba.jafoole.zaba;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RequestSlice {

    @SerializedName("passengers")
    @Expose
    private Passengers passengers;
    @SerializedName("slice")
    @Expose
    private List<Slice> slice = new ArrayList<Slice>();

    /**
     *
     * @return
     *     The passengers
     */
    public Passengers getPassengers() {
        return passengers;
    }

    /**
     *
     * @param passengers
     *     The passengers
     */
    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    /**
     *
     * @return
     *     The slice
     */
    public List<Slice> getSlice() {
        return slice;
    }

    /**
     *
     * @param slice
     *     The slice
     */
    public void setSlice(List<Slice> slice) {
        this.slice = slice;
    }

}

