package com.ali.habibian.imweather.common;

import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "b953d464aa07cc857d18b722722d9332";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    // This function will create a functional link to the API path
    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    // This function to convert unix time stamp to Date type with format "HH:mm"
    public static String unixTimeStampToDataTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    // This function to get a link image from OpenWeatherMap
    @NonNull
    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    // This function to get Date with format "dd MMMMM yyyy HH:mm"
    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }


}
