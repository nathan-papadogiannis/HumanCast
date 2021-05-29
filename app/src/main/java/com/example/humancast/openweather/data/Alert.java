
package com.example.humancast.openweather.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Alert {

    @SerializedName("sender_name")
    @Expose
    private String senderName;
    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("start")
    @Expose
    private long start;
    @SerializedName("end")
    @Expose
    private long end;
    @SerializedName("description")
    @Expose
    private String description;

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
