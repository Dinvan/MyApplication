package com.advanz101.myapplication;
import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by advanz101 on 17/5/17.
 */
public interface ApiInterface {
    


    @GET("users/masters")
    Call<JsonElement> getMasters(@Header("Token") String token);

    @GET("users/monthlist_tour")
    Call<JsonElement> getTourProgramMonths(@Header("Token") String token);

    /*------------------------------------Old API----------------------------------------------*/
}