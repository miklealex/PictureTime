package com.example.kubik.picturetime.api;

import com.example.kubik.picturetime.models.AuthRequest;
import com.example.kubik.picturetime.models.AuthResponse;
import com.example.kubik.picturetime.models.photos.PhotoDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Kubik on 1/12/17.
 */

public interface ApiInterface {

    @GET("photos")
    Call<List<PhotoDetails>> getPhotosList(@Query("client_id") String appId,
                                           @Query("page") int page,
                                           @Query("order_by") String orderBy);

    @GET("photos/random")
    Call<PhotoDetails> getRandomPhoto(@Query("client_id") String appId);

    @POST("oauth/token")
    Call<String> authUser(@Body String request);
}
