
package com.example.jafoole.zaba.qpxdata;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Fare {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("carrier")
    @Expose
    private String carrier;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("basisCode")
    @Expose
    private String basisCode;
    @SerializedName("private")
    @Expose
    private Boolean _private;

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
     *     The basisCode
     */
    public String getBasisCode() {
        return basisCode;
    }

    /**
     * 
     * @param basisCode
     *     The basisCode
     */
    public void setBasisCode(String basisCode) {
        this.basisCode = basisCode;
    }

    /**
     * 
     * @return
     *     The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }



}
