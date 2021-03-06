
package com.zaba.jafoole.zaba.qpxexpress;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class FreeBaggageOption implements Serializable, Parcelable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("bagDescriptor")
    @Expose
    private List<BagDescriptor> bagDescriptor = new ArrayList<BagDescriptor>();
    @SerializedName("kilos")
    @Expose
    private Integer kilos;
    @SerializedName("kilosPerPiece")
    @Expose
    private Integer kilosPerPiece;
    @SerializedName("pieces")
    @Expose
    private Integer pieces;
    @SerializedName("pounds")
    @Expose
    private Integer pounds;

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
     *     The bagDescriptor
     */
    public List<BagDescriptor> getBagDescriptor() {
        return bagDescriptor;
    }

    /**
     * 
     * @param bagDescriptor
     *     The bagDescriptor
     */
    public void setBagDescriptor(List<BagDescriptor> bagDescriptor) {
        this.bagDescriptor = bagDescriptor;
    }

    /**
     * 
     * @return
     *     The kilos
     */
    public Integer getKilos() {
        return kilos;
    }

    /**
     * 
     * @param kilos
     *     The kilos
     */
    public void setKilos(Integer kilos) {
        this.kilos = kilos;
    }

    /**
     * 
     * @return
     *     The kilosPerPiece
     */
    public Integer getKilosPerPiece() {
        return kilosPerPiece;
    }

    /**
     * 
     * @param kilosPerPiece
     *     The kilosPerPiece
     */
    public void setKilosPerPiece(Integer kilosPerPiece) {
        this.kilosPerPiece = kilosPerPiece;
    }

    /**
     * 
     * @return
     *     The pieces
     */
    public Integer getPieces() {
        return pieces;
    }

    /**
     * 
     * @param pieces
     *     The pieces
     */
    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    /**
     * 
     * @return
     *     The pounds
     */
    public Integer getPounds() {
        return pounds;
    }

    /**
     * 
     * @param pounds
     *     The pounds
     */
    public void setPounds(Integer pounds) {
        this.pounds = pounds;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
