package com.example.recyclerview;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.widget.ImageView;

import java.util.ArrayList;

public class Keluarga_Abi {
    private String nama, nama_panggilan;
    private int gambar;

    public Keluarga_Abi(String nama, String nama_panggilan, Integer gambar) {
        this.nama = nama;
        this.nama_panggilan = nama_panggilan;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama_panggilan() {
        return nama_panggilan;
    }

    public void setNama_panggilan(String nama_panggilan) {
        this.nama_panggilan = nama_panggilan;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }
}
