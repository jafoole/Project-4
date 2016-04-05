
package com.zaba.jafoole.zaba.qpxexpress;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.zaba.jafoole.zaba.Slice;


public class TripOption implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("saleTotal")
    @Expose
    private String saleTotal;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slice")
    @Expose
    private List<Slouse> slice = new ArrayList<Slouse>();
    @SerializedName("pricing")
    @Expose
    private List<Pricing> pricing = new ArrayList<Pricing>();

    private List<Trips> trips = new ArrayList<Trips>();

    @SerializedName("carrier")
    @Expose
    private List<Carrier> carrier = new ArrayList<Carrier>();

    private Carrier carrierCar = new Carrier();



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
     *     The saleTotal
     */
    public String getSaleTotal() {
        return saleTotal;
    }

    /**
     * 
     * @param saleTotal
     *     The saleTotal
     */
    public void setSaleTotal(String saleTotal) {
        this.saleTotal = saleTotal;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The slice
     */
    public List<Slouse> getSlice() {
        return slice;
    }

    /**
     * 
     * @param slice
     *     The slice
     */
    public void setSlice(List<Slouse> slice) {
        this.slice = slice;
    }

    /**
     * 
     * @return
     *     The pricing
     */
    public List<Pricing> getPricing() {
        return pricing;
    }

    /**
     * 
     * @param pricing
     *     The pricing
     */
    public void setPricing(List<Pricing> pricing) {
        this.pricing = pricing;
    }

    public Slouse getOutboundFlights(){
        return this.slice.get(0);
    }

    public Slouse getInboundFlights() {
        return this.slice.get(1);
    }

    public List<Trips> getTrips() {
        return trips;
    }

    public void setTrips(List<Trips> trips) {
        this.trips = trips;
    }

    public List<Carrier> getCarrier() {
        return carrier;
    }
    public String getCarrierName() {
       return carrierCar.getName();
    }

    public void setCarrier(List<Carrier> carrier) {
        this.carrier = carrier;
    }

}
