
package com.zaba.jafoole.zaba;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Slice {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("date")
    @Expose
    private String date;

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
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

}
