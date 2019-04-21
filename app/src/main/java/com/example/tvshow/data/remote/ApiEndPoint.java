package com.example.tvshow.data.remote;

import com.example.tvshow.data.model.ReviewResponse;
import com.example.tvshow.data.model.TrailerResponse;
import com.example.tvshow.data.model.TvResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndPoint {

    @GET("tv/airing_today")
    Call<TvResponse> tvAiringTodayCall(
            @Query("api_key") String apiKey
    );

    @GET("tv/{tv_id}/videos")
    Call<TrailerResponse> trailerAiringTodayCall(
            @Path("tv_id") int tvId,
            @Query("api_key") String apiKey
    );
    @GET("movie/{movie_id}/reviews")
    Call<ReviewResponse>reviewAiringTodayCall (
            @Path("movie_id") int id,
            @Query("api_key") String apiKEy,
            @Query("language") String language
    );

}

