
package com.zaba.jafoole.zaba.qpxexpress;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SegmentPricing {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("fareId")
    @Expose
    private String fareId;
    @SerializedName("segmentId")
    @Expose
    private String segmentId;
    @SerializedName("freeBaggageOption")
    @Expose
    private List<FreeBaggageOption> freeBaggageOption = new ArrayList<FreeBaggageOption>();

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
     *     The fareId
     */
    public String getFareId() {
        return fareId;
    }

    /**
     * 
     * @param fareId
     *     The fareId
     */
    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    /**
     * 
     * @return
     *     The segmentId
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * 
     * @param segmentId
     *     The segmentId
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * 
     * @return
     *     The freeBaggageOption
     */
    public List<FreeBaggageOption> getFreeBaggageOption() {
        return freeBaggageOption;
    }

    /**
     * 
     * @param freeBaggageOption
     *     The freeBaggageOption
     */
    public void setFreeBaggageOption(List<FreeBaggageOption> freeBaggageOption) {
        this.freeBaggageOption = freeBaggageOption;
    }



}
