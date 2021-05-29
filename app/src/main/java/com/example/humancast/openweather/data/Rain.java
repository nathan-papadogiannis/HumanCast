
package com.example.humancast.openweather.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Rain {

    @SerializedName("1h")
    @Expose
    private double _1h;

    public double get1h() {
        return _1h;
    }

    public void set1h(double _1h) {
        this._1h = _1h;
    }

}
