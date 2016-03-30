
package com.example.jafoole.zaba.qpxdata;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Segment {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("flight")
    @Expose
    private Flight flight;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("cabin")
    @Expose
    private String cabin;
    @SerializedName("bookingCode")
    @Expose
    private String bookingCode;
    @SerializedName("bookingCodeCount")
    @Expose
    private Integer bookingCodeCount;
    @SerializedName("marriedSegmentGroup")
    @Expose
    private String marriedSegmentGroup;
    @SerializedName("subjectToGovernmentApproval")
    @Expose
    private Boolean subjectToGovernmentApproval;
    @SerializedName("leg")
    @Expose
    private List<Leg> leg = new ArrayList<Leg>();
    @SerializedName("connectionDuration")
    @Expose
    private Integer connectionDuration;

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
     *     The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * 
     * @param flight
     *     The flight
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
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
     *     The cabin
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * 
     * @param cabin
     *     The cabin
     */
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    /**
     * 
     * @return
     *     The bookingCode
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * 
     * @param bookingCode
     *     The bookingCode
     */
    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    /**
     * 
     * @return
     *     The bookingCodeCount
     */
    public Integer getBookingCodeCount() {
        return bookingCodeCount;
    }

    /**
     * 
     * @param bookingCodeCount
     *     The bookingCodeCount
     */
    public void setBookingCodeCount(Integer bookingCodeCount) {
        this.bookingCodeCount = bookingCodeCount;
    }

    /**
     * 
     * @return
     *     The marriedSegmentGroup
     */
    public String getMarriedSegmentGroup() {
        return marriedSegmentGroup;
    }

    /**
     * 
     * @param marriedSegmentGroup
     *     The marriedSegmentGroup
     */
    public void setMarriedSegmentGroup(String marriedSegmentGroup) {
        this.marriedSegmentGroup = marriedSegmentGroup;
    }

    /**
     * 
     * @return
     *     The subjectToGovernmentApproval
     */
    public Boolean getSubjectToGovernmentApproval() {
        return subjectToGovernmentApproval;
    }

    /**
     * 
     * @param subjectToGovernmentApproval
     *     The subjectToGovernmentApproval
     */
    public void setSubjectToGovernmentApproval(Boolean subjectToGovernmentApproval) {
        this.subjectToGovernmentApproval = subjectToGovernmentApproval;
    }

    /**
     * 
     * @return
     *     The leg
     */
    public List<Leg> getLeg() {
        return leg;
    }

    /**
     * 
     * @param leg
     *     The leg
     */
    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

    /**
     * 
     * @return
     *     The connectionDuration
     */
    public Integer getConnectionDuration() {
        return connectionDuration;
    }

    /**
     * 
     * @param connectionDuration
     *     The connectionDuration
     */
    public void setConnectionDuration(Integer connectionDuration) {
        this.connectionDuration = connectionDuration;
    }



}
