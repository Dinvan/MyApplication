package com.advanz101.myapplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by advanz101 on 17/5/17.
 */

public class ApiClient {

    public static final String BASE_URL ="test";
    public static final String CURRENT_SERVER="test";
    public static final String GOOGLE_BASE_URL="http://maps.googleapis.com/maps/api/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient(String baseURL) {
        Gson gson = new GsonBuilder()
                .setLenient()

                .create();
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)

                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getGoogleAPIClient(String baseURL) {
        Retrofit retrofit=null;
        Gson gson = new GsonBuilder().create();
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
