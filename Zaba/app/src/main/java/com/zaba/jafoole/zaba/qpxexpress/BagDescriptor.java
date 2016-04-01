
package com.zaba.jafoole.zaba.qpxexpress;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BagDescriptor {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("commercialName")
    @Expose
    private String commercialName;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("description")
    @Expose
    private List<String> description = new ArrayList<String>();
    @SerializedName("subcode")
    @Expose
    private String subcode;

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
     *     The commercialName
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * 
     * @param commercialName
     *     The commercialName
     */
    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The description
     */
    public List<String> getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(List<String> description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The subcode
     */
    public String getSubcode() {
        return subcode;
    }

    /**
     * 
     * @param subcode
     *     The subcode
     */
    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }


}
