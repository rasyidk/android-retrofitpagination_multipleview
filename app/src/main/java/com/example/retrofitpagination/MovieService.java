package com.example.retrofitpagination;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Pagination
 * Created by Suleiman19 on 10/27/16.
 * Copyright (c) 2016. Suleiman Ali Shakir. All rights reserved.
 */

public interface MovieService {

    @GET("selectpage")
    Call<TopRatedMovies> getTopRatedMovies(
            @Query("page") int pageIndex
    );

}
