
package com.example.jafoole.zaba.qpxdata;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Passengers {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("adultCount")
    @Expose
    private Integer adultCount;
    @SerializedName("childCount")
    @Expose
    private Integer childCount;
    @SerializedName("infantInLapCount")
    @Expose
    private Integer infantInLapCount;
    @SerializedName("infantInSeatCount")
    @Expose
    private Integer infantInSeatCount;
    @SerializedName("seniorCount")
    @Expose
    private Integer seniorCount;

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
     *     The adultCount
     */
    public Integer getAdultCount() {
        return adultCount;
    }

    /**
     * 
     * @param adultCount
     *     The adultCount
     */
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

    /**
     * 
     * @return
     *     The childCount
     */
    public Integer getChildCount() {
        return childCount;
    }

    /**
     * 
     * @param childCount
     *     The childCount
     */
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    /**
     * 
     * @return
     *     The infantInLapCount
     */
    public Integer getInfantInLapCount() {
        return infantInLapCount;
    }

    /**
     * 
     * @param infantInLapCount
     *     The infantInLapCount
     */
    public void setInfantInLapCount(Integer infantInLapCount) {
        this.infantInLapCount = infantInLapCount;
    }

    /**
     * 
     * @return
     *     The infantInSeatCount
     */
    public Integer getInfantInSeatCount() {
        return infantInSeatCount;
    }

    /**
     * 
     * @param infantInSeatCount
     *     The infantInSeatCount
     */
    public void setInfantInSeatCount(Integer infantInSeatCount) {
        this.infantInSeatCount = infantInSeatCount;
    }

    /**
     * 
     * @return
     *     The seniorCount
     */
    public Integer getSeniorCount() {
        return seniorCount;
    }

    /**
     * 
     * @param seniorCount
     *     The seniorCount
     */
    public void setSeniorCount(Integer seniorCount) {
        this.seniorCount = seniorCount;
    }


}
