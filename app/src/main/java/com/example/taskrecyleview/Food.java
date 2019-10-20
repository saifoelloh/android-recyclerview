package com.example.taskrecyleview;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class Food {
    private String name;
    private String description;
    private int photo;
    private Integer price;

    public Food(String name, String description, int photo, Integer price) {
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
