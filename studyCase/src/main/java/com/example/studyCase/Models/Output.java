package com.example.studyCase.Models;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Output {

    @JsonSetter("items")
    Artikel[] data;

    @JsonSetter("count")
    int total_data;


    public Artikel[] getData() {
        return data;
    }

    public void setData(Artikel[] data) {
        this.data = data;
    }

    public int getTotal_data() {
        return total_data;
    }

    public void setTotal_data(int total_data) {
        this.total_data = total_data;
    }
}
