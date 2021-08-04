package com.example.studyCase.Models;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Artikel {

    @JsonSetter("createdAt")
    String tanggal_buat;

    @JsonSetter("author")
    String nama_pembuat;

    @JsonSetter("avatar")
    String avatar;

    @JsonSetter("title")
    String judul;

    @JsonSetter("content")
    String Konten;

    @JsonSetter("id")
    String id;

    public String getTanggal_buat() {
        return tanggal_buat;
    }

    public void setTanggal_buat(String tanggal_buat) {
        this.tanggal_buat = tanggal_buat;
    }

    public String getNama_pembuat() {
        return nama_pembuat;
    }

    public void setNama_pembuat(String nama_pembuat) {
        this.nama_pembuat = nama_pembuat;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKonten() {
        return Konten;
    }

    public void setKonten(String konten) {
        Konten = konten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
