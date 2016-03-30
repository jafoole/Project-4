
package com.example.jafoole.zaba.qpxdata;

import java.util.ArrayList;
import java.util.List;


import com.example.jafoole.zaba.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Pricing {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("fare")
    @Expose
    private List<Fare> fare = new ArrayList<Fare>();
    @SerializedName("segmentPricing")
    @Expose
    private List<SegmentPricing> segmentPricing = new ArrayList<SegmentPricing>();
    @SerializedName("baseFareTotal")
    @Expose
    private String baseFareTotal;
    @SerializedName("saleFareTotal")
    @Expose
    private String saleFareTotal;
    @SerializedName("saleTaxTotal")
    @Expose
    private String saleTaxTotal;
    @SerializedName("saleTotal")
    @Expose
    private String saleTotal;
    @SerializedName("passengers")
    @Expose
    private com.example.jafoole.zaba.Passengers passengers;
    @SerializedName("tax")
    @Expose
    private List<Tax_> tax = new ArrayList<Tax_>();
    @SerializedName("fareCalculation")
    @Expose
    private String fareCalculation;
    @SerializedName("latestTicketingTime")
    @Expose
    private String latestTicketingTime;
    @SerializedName("ptc")
    @Expose
    private String ptc;
    @SerializedName("refundable")
    @Expose
    private Boolean refundable;

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
     *     The fare
     */
    public List<Fare> getFare() {
        return fare;
    }

    /**
     * 
     * @param fare
     *     The fare
     */
    public void setFare(List<Fare> fare) {
        this.fare = fare;
    }

    /**
     * 
     * @return
     *     The segmentPricing
     */
    public List<SegmentPricing> getSegmentPricing() {
        return segmentPricing;
    }

    /**
     * 
     * @param segmentPricing
     *     The segmentPricing
     */
    public void setSegmentPricing(List<SegmentPricing> segmentPricing) {
        this.segmentPricing = segmentPricing;
    }

    /**
     * 
     * @return
     *     The baseFareTotal
     */
    public String getBaseFareTotal() {
        return baseFareTotal;
    }

    /**
     * 
     * @param baseFareTotal
     *     The baseFareTotal
     */
    public void setBaseFareTotal(String baseFareTotal) {
        this.baseFareTotal = baseFareTotal;
    }

    /**
     * 
     * @return
     *     The saleFareTotal
     */
    public String getSaleFareTotal() {
        return saleFareTotal;
    }

    /**
     * 
     * @param saleFareTotal
     *     The saleFareTotal
     */
    public void setSaleFareTotal(String saleFareTotal) {
        this.saleFareTotal = saleFareTotal;
    }

    /**
     * 
     * @return
     *     The saleTaxTotal
     */
    public String getSaleTaxTotal() {
        return saleTaxTotal;
    }

    /**
     * 
     * @param saleTaxTotal
     *     The saleTaxTotal
     */
    public void setSaleTaxTotal(String saleTaxTotal) {
        this.saleTaxTotal = saleTaxTotal;
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
     *     The passengers
     */
    public com.example.jafoole.zaba.Passengers getPassengers() {
        return passengers;
    }

    /**
     * 
     * @param passengers
     *     The passengers
     */
    public void setPassengers(com.example.jafoole.zaba.Passengers passengers) {
        this.passengers = passengers;
    }

    /**
     * 
     * @return
     *     The tax
     */
    public List<Tax_> getTax() {
        return tax;
    }

    /**
     * 
     * @param tax
     *     The tax
     */
    public void setTax(List<Tax_> tax) {
        this.tax = tax;
    }

    /**
     * 
     * @return
     *     The fareCalculation
     */
    public String getFareCalculation() {
        return fareCalculation;
    }

    /**
     * 
     * @param fareCalculation
     *     The fareCalculation
     */
    public void setFareCalculation(String fareCalculation) {
        this.fareCalculation = fareCalculation;
    }

    /**
     * 
     * @return
     *     The latestTicketingTime
     */
    public String getLatestTicketingTime() {
        return latestTicketingTime;
    }

    /**
     * 
     * @param latestTicketingTime
     *     The latestTicketingTime
     */
    public void setLatestTicketingTime(String latestTicketingTime) {
        this.latestTicketingTime = latestTicketingTime;
    }

    /**
     * 
     * @return
     *     The ptc
     */
    public String getPtc() {
        return ptc;
    }

    /**
     * 
     * @param ptc
     *     The ptc
     */
    public void setPtc(String ptc) {
        this.ptc = ptc;
    }

    /**
     * 
     * @return
     *     The refundable
     */
    public Boolean getRefundable() {
        return refundable;
    }

    /**
     * 
     * @param refundable
     *     The refundable
     */
    public void setRefundable(Boolean refundable) {
        this.refundable = refundable;
    }



}
