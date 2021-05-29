package com.example.humancast;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.humancast.openweather.calls.ApiClient;
import com.example.humancast.openweather.calls.ApiInterface;
import com.example.humancast.openweather.data.WeatherData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForecastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        ApiInterface wf = ApiClient.getClient().create(ApiInterface.class);
        Call<WeatherData> call = wf.getWeatherData(40.7586, -73.7654,  "3e55558471e164e0282b802586dfa639", null, "imperial");
        String url = call.request().url().toString();
        call.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                TextView txtView = (TextView)findViewById(R.id.forecast_text);
                String forecast = response.body().currentString();
                txtView.setText(forecast);
                System.out.println(forecast);
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                System.out.println("SHIT");
                System.out.println(t.toString());
            }
        });
    }
}
