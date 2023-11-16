package com.example.retrofitgetdemo;

import com.example.retrofitgetdemo.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("api/users?page=1")
    Call<Model> getAllData();
}