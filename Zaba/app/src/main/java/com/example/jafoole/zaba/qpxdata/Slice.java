
package com.example.jafoole.zaba.qpxdata;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Slice {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("segment")
    @Expose
    private List<Segment> segment = new ArrayList<Segment>();

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
     *     The segment
     */
    public List<Segment> getSegment() {
        return segment;
    }

    /**
     * 
     * @param segment
     *     The segment
     */
    public void setSegment(List<Segment> segment) {
        this.segment = segment;
    }



}
