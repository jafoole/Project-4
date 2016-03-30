
package com.example.jafoole.zaba.qpxdata;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class City {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("name")
    @Expose
    private String name;

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
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }


}