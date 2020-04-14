package com.example.retrofitpagination;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TopRatedMovies {

    @SerializedName("data")
    @Expose
    private List<Result> results = new ArrayList<Result>();

    @SerializedName("page")
    @Expose
    private String page;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<Result> getResults() {
        return results;
    }


}
