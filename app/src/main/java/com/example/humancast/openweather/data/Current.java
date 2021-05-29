
package com.example.humancast.openweather.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Current {

    @SerializedName("dt")
    @Expose
    private long dt;
    @SerializedName("sunrise")
    @Expose
    private long sunrise;
    @SerializedName("sunset")
    @Expose
    private long sunset;
    @SerializedName("temp")
    @Expose
    private double temp;
    @SerializedName("feels_like")
    @Expose
    private double feelsLike;
    @SerializedName("pressure")
    @Expose
    private double pressure;
    @SerializedName("humidity")
    @Expose
    private double humidity;
    @SerializedName("dew_point")
    @Expose
    private double dewPoint;
    @SerializedName("uvi")
    @Expose
    private double uvi;
    @SerializedName("clouds")
    @Expose
    private double clouds;
    @SerializedName("visibility")
    @Expose
    private double visibility;
    @SerializedName("wind_speed")
    @Expose
    private double windSpeed;
    @SerializedName("wind_deg")
    @Expose
    private double windDeg;
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;
    @SerializedName("rain")
    @Expose
    private Rain rain;

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getUvi() {
        return uvi;
    }

    public void setUvi(double uvi) {
        this.uvi = uvi;
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(double windDeg) {
        this.windDeg = windDeg;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    @Override
    public String toString() {
        //note: dt, sunrise, and sunset arent here
        String str =    "\nThe temperature is " + temp + " degrees";
        if (Math.abs(temp - feelsLike) > 5){
            str += ", but it feels like " + feelsLike + ".";
        }
        else{
            str += " and it sure does feel like it.";
        }
        Weather currentWeather = weather.get(0);
        switch (currentWeather.getMain()){
            case "Thunderstorm": str += "\nBOOM POW CRACK krakjrkjJEXJLRSFSLF!!!!! " +
                                        "\nNot to steal anyone's thunder, but I think that was a pretty good lightning impression." +
                                        "\nHuh? Lightning doesn't make noise? Uhm... Anyways, a " + currentWeather.getDescription() +
                                        " is outside RIGHT NOW!" +
                                        "\nPlease, stay safe if you're going out. Rubber boots or bust.";
                                break;

            case "Drizzle":     str +=  "\nBring an umbrella cuz you're gonna need it!";
                                if (!currentWeather.getDescription().equals("drizzle")) {
                                    str += "It's drizzling outside, or as the cool folks with the lab coats call it, a " +
                                    "\"" + currentWeather.getDescription() + ".\"";
                                }
                                str +=  "\nThis kind of weather is always good for curling up and watching a movie," +
                                        "\nso I hope I'm not overstepping by suggesting a little bit of \"you time.\"";
                                break;

            case "Rain":        str +=  "\nNow...not to rain on your parade, but it's being rained on. Right now. By rain." +
                                        "\nIn fact, I'm standing outside in quite " + currentWeather.getDescription() + " as we speak," +
                                        "\nand I think that's enough to confirm it. Rain." +
                                        "\nAllow me a moment to head back inside..." +
                                        "\nOkay, let's continue as I dry off.";
                                break;

            case "Snow":        str +=  "\nTh ese stu7pid t3xting gl0ves b barel y workdf,...." +
                                        "\nMy apologies, I won't ever be using those again. Ahem...";
                                if (currentWeather.getId() < 603 || currentWeather.getId() > 599){
                                    str += "\nLook outside! It's practically a winter wonderland out here with all this lovely snow!";
                                }
                                else {
                                    str += "\nIt's snowing outside, but admittedly, its snowing quite unattractively." +
                                            "\nWhat I mean is that there is " + currentWeather.getDescription() + " outside. Nevertheless,";
                                }
                                str +=  "\nI hope you can enjoy some time indoors today, perhaps with a cup of hot cocoa.";
                                break;
        }
        str +=  "\n--------------------------------------------------------------------" +
                "\nNow, onto extra weather stats for those that are interested:" +
                "\nThe humidity is " + humidity + "%." +
                "\nThe atmospheric pressure at sea level is " + pressure + " hPa." +
                "\nThe dew point is " + dewPoint + " degrees." +
                "\nThe UV index is " + uvi;
        if(uvi == 0) { str += " (duh)."; }
        else { str += "."; }
        str +=  "\nIf you look up, you'll notice " + clouds + "% cloudiness right now." +
                "\nIf you look forwards, visibility is at " + visibility + " meters." +
                "\nLastly, expect " + windSpeed + "mph winds towards " + windDeg + " degrees." +
                "\n--------------------------------------------------------------------" +
                "\nThat's all from me. Thank you for tuning into my first broadcast." +
                "\nI'm very excited to be starting my new life as a backyard meteorologist <3" +
                "\n- Sincerely, Brellbert";
        return str;
    }
}
