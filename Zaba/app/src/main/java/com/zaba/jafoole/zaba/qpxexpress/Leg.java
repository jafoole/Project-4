
package com.zaba.jafoole.zaba.qpxexpress;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Leg {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("aircraft")
    @Expose
    private String aircraft;
    @SerializedName("arrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("departureTime")
    @Expose
    private String departureTime;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("originTerminal")
    @Expose
    private String originTerminal;
    @SerializedName("destinationTerminal")
    @Expose
    private String destinationTerminal;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("operatingDisclosure")
    @Expose
    private String operatingDisclosure;
    @SerializedName("onTimePerformance")
    @Expose
    private Integer onTimePerformance;
    @SerializedName("mileage")
    @Expose
    private Integer mileage;
    @SerializedName("meal")
    @Expose
    private String meal;
    @SerializedName("secure")
    @Expose
    private Boolean secure;
    @SerializedName("connectionDuration")
    @Expose
    private String connectionDuration;
    @SerializedName("changePlane")
    @Expose
    private Boolean changePlane;

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
     *     The aircraft
     */
    public String getAircraft() {
        return aircraft;
    }

    /**
     * 
     * @param aircraft
     *     The aircraft
     */
    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     * @return
     *     The departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 
     * @param origin
     *     The origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 
     * @return
     *     The destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The originTerminal
     */
    public String getOriginTerminal() {
        return originTerminal;
    }

    /**
     * 
     * @param originTerminal
     *     The originTerminal
     */
    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    /**
     * 
     * @return
     *     The destinationTerminal
     */
    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    /**
     * 
     * @param destinationTerminal
     *     The destinationTerminal
     */
    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
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
     *     The operatingDisclosure
     */
    public String getOperatingDisclosure() {
        return operatingDisclosure;
    }

    /**
     * 
     * @param operatingDisclosure
     *     The operatingDisclosure
     */
    public void setOperatingDisclosure(String operatingDisclosure) {
        this.operatingDisclosure = operatingDisclosure;
    }

    /**
     * 
     * @return
     *     The onTimePerformance
     */
    public Integer getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * 
     * @param onTimePerformance
     *     The onTimePerformance
     */
    public void setOnTimePerformance(Integer onTimePerformance) {
        this.onTimePerformance = onTimePerformance;
    }

    /**
     * 
     * @return
     *     The mileage
     */
    public Integer getMileage() {
        return mileage;
    }

    /**
     * 
     * @param mileage
     *     The mileage
     */
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    /**
     * 
     * @return
     *     The meal
     */
    public String getMeal() {
        return meal;
    }

    /**
     * 
     * @param meal
     *     The meal
     */
    public void setMeal(String meal) {
        this.meal = meal;
    }

    /**
     * 
     * @return
     *     The secure
     */
    public Boolean getSecure() {
        return secure;
    }

    /**
     * 
     * @param secure
     *     The secure
     */
    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    /**
     * 
     * @return
     *     The connectionDuration
     */
    public String getConnectionDuration() {
        return connectionDuration;
    }

    /**
     * 
     * @param connectionDuration
     *     The connectionDuration
     */
    public void setConnectionDuration(String connectionDuration) {
        this.connectionDuration = connectionDuration;
    }

    /**
     * 
     * @return
     *     The changePlane
     */
    public Boolean getChangePlane() {
        return changePlane;
    }

    /**
     * 
     * @param changePlane
     *     The changePlane
     */
    public void setChangePlane(Boolean changePlane) {
        this.changePlane = changePlane;
    }



}
