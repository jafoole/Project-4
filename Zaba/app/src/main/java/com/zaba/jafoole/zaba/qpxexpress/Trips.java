
package com.zaba.jafoole.zaba.qpxexpress;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Trips {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("tripOption")
    @Expose
    private List<TripOption> tripOption = new ArrayList<TripOption>();

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
     *     The requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The tripOption
     */
    public List<TripOption> getTripOption() {
        return tripOption;
    }

    /**
     * 
     * @param tripOption
     *     The tripOption
     */
    public void setTripOption(List<TripOption> tripOption) {
        this.tripOption = tripOption;
    }


}
