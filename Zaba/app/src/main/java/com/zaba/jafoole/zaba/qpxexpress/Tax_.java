
package com.zaba.jafoole.zaba.qpxexpress;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Tax_ {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("chargeType")
    @Expose
    private String chargeType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("salePrice")
    @Expose
    private String salePrice;

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
     *     The chargeType
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 
     * @param chargeType
     *     The chargeType
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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
     *     The salePrice
     */
    public String getSalePrice() {
        return salePrice;
    }

    /**
     * 
     * @param salePrice
     *     The salePrice
     */
    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }



}
