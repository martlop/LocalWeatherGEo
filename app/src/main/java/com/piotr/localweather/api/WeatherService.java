package com.piotr.localweather.api;

/**
 * @author android
 */

import com.piotr.localweather.api.model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/forecast")
    Call<WeatherData> getForecast(@Query("q") String q,
                                  @Query("mode") String mode,
                                  @Query("units") String units,
                                  @Query("type") String type,
                                  @Query("lang") String lang,
                                  @Query("APPID") String appiId);
}