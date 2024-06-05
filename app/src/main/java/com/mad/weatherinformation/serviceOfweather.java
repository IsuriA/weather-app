package com.mad.weatherinformation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface serviceOfweather {
    @GET("weather")
    Call<response_weather> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String apiKey);
}
