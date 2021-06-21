package com.piombacciaio.news;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiinterface {
    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainnews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<mainnews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apiKey
    );
}
