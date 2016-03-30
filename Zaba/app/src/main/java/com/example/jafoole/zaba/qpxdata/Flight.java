
package com.example.jafoole.zaba.qpxdata;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Flight {

    @SerializedName("carrier")
    @Expose
    private String carrier;
    @SerializedName("number")
    @Expose
    private String number;

    /**
     * 
     * @return
     *     The carrier
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * 
     * @param carrier
     *     The carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * 
     * @return
     *     The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(String number) {
        this.number = number;
    }


}
