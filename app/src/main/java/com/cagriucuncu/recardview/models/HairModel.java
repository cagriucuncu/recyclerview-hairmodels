package com.cagriucuncu.recardview.models;

public class HairModel {
    String title, url;
    int color;

    public HairModel(String title, String url, int color) {
        this.title = title;
        this.url = url;
        this.color = color;
    }

    public String getTitle() {        return title;    }

    public String getUrl() {        return url;    }

    public int getColor() {        return color;    }
}
