
package com.zaba.jafoole.zaba;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passengers {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("adultCount")
    @Expose
    private Integer adultCount;

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

}
