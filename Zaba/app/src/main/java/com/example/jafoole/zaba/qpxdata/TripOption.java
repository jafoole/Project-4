
package com.example.jafoole.zaba.qpxdata;

import java.util.ArrayList;
import java.util.List;


import com.example.jafoole.zaba.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class TripOption {

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
    private List<com.example.jafoole.zaba.Slice> slice = new ArrayList<com.example.jafoole.zaba.Slice>();
    @SerializedName("pricing")
    @Expose
    private List<Pricing> pricing = new ArrayList<Pricing>();

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
    public List<com.example.jafoole.zaba.Slice> getSlice() {
        return slice;
    }

    /**
     * 
     * @param slice
     *     The slice
     */
    public void setSlice(List<com.example.jafoole.zaba.Slice> slice) {
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



}
