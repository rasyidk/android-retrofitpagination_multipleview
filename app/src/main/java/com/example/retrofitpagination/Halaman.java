package com.example.retrofitpagination;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Halaman {

    @SerializedName("halaman")
    @Expose
    private String halaman;

    public String getHalaman() {
        return halaman;
    }

    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }
}
