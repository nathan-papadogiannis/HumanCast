package com.example.humancast.openweather.calls;

import com.example.humancast.openweather.data.WeatherData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("onecall?")
    Call<WeatherData> getWeatherData(
            @Query("lat") double latitude,
            @Query("lon") double longitude,
            @Query("appid") String appid,
            @Query("exclude") String exclude,
            @Query("units") String units
    );
}
