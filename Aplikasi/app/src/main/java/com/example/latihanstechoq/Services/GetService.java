package com.example.latihanstechoq.Services;

import com.example.latihanstechoq.Model.PhotoData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/photos")
    Call<List<PhotoData>> getAllPhotos();
}
