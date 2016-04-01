
package com.zaba.jafoole.zaba;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Request {

    @SerializedName("request")
    @Expose
    private RequestSlice request;

    /**
     *
     * @return
     *     The request
     */
    public RequestSlice getRequest() {
        return request;
    }

    /**
     *
     * @param request
     *     The request
     */
    public void setRequest(RequestSlice request) {
        this.request = request;
    }

}