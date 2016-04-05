
package com.zaba.jafoole.zaba.qpxexpress;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Data implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("airport")
    @Expose
    private List<Airport> airport = new ArrayList<Airport>();
    @SerializedName("city")
    @Expose
    private List<City> city = new ArrayList<City>();
    @SerializedName("aircraft")
    @Expose
    private List<Aircraft> aircraft = new ArrayList<Aircraft>();
    @SerializedName("tax")
    @Expose
    private List<Tax> tax = new ArrayList<Tax>();
    @SerializedName("carrier")
    @Expose
    private List<Carrier> carrier = new ArrayList<Carrier>();

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
     *     The airport
     */
    public List<Airport> getAirport() {
        return airport;
    }

    /**
     * 
     * @param airport
     *     The airport
     */
    public void setAirport(List<Airport> airport) {
        this.airport = airport;
    }

    /**
     * 
     * @return
     *     The city
     */
    public List<City> getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(List<City> city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The aircraft
     */
    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * 
     * @param aircraft
     *     The aircraft
     */
    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    /**
     * 
     * @return
     *     The tax
     */
    public List<Tax> getTax() {
        return tax;
    }

    /**
     * 
     * @param tax
     *     The tax
     */
    public void setTax(List<Tax> tax) {
        this.tax = tax;
    }

    /**
     * 
     * @return
     *     The carrier
     */
    public List<Carrier> getCarrier() {
        return carrier;
    }

    /**
     * 
     * @param carrier
     *     The carrier
     */
    public void setCarrier(List<Carrier> carrier) {
        this.carrier = carrier;
    }



}
