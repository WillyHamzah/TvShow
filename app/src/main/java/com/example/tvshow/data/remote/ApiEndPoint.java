package com.example.tvshow.data.remote;

import com.example.tvshow.data.model.TvAiringToday;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndPoint {
    @GET("tv/airing_today")
    Call<TvAiringToday> tvAiringTodayCall(@Query("api_key") String apiKey);
}

