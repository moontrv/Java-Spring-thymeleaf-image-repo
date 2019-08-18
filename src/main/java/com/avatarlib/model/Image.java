package com.avatarlib.model;

import java.time.LocalDate;

public class Image {
    private String name;
    private int categoryId;
    private LocalDate upload_dt;
    private String username;
    private boolean favorite;

    public Image(String name, int categoryId, LocalDate upload_dt, String username, boolean favorite) {
        this.name = name;
        this.categoryId = categoryId;
        this.upload_dt = upload_dt;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getUpload_dt() {
        return upload_dt;
    }

    public void setUpload_dt(LocalDate upload_dt) {
        this.upload_dt = upload_dt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
