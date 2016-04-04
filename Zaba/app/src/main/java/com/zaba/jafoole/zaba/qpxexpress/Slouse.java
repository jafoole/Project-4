
package com.zaba.jafoole.zaba.qpxexpress;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Slouse implements Serializable, Parcelable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("segment")
    @Expose
    private List<Segment> segment = new ArrayList<Segment>();
    private int destination;

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


    public String getDepartureTime() {
        return segment.get(0).getLeg().get(0).getDepartureTime();

    }

    public String getArrivalTime() {
        int segPosition = segment.size();

        Segment segmentType = segment.get(segPosition - 1);

        int lastLegPostion = segmentType.getLeg().size();

        return segmentType.getLeg().get(lastLegPostion - 1).getArrivalTime();

    };



//    public Integer getDuration(){
//        Integer segmentAdded = 0;
//      for (Segment currentSegment : segment){
//          segmentAdded += currentSegment.getDuration();
//      }
//        return segmentAdded;
//    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public String getOrigin() {
        return segment.get(0).getLeg().get(0).getOrigin();
    }

    public String getDestination() {

        int segPosition = segment.size();

        Segment segmentType = segment.get(segPosition - 1);
        int lastLegPosition = segmentType.getLeg().size();

        return segmentType.getLeg().get(lastLegPosition -1).getDestination();
    }

}
