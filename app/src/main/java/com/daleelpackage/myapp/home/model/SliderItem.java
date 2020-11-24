package com.daleelpackage.myapp.home.model;

public class SliderItem {
    private String description;
    private String imageUrl;
private  int imgid;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public void setImage(int imageUrl) {
        this.imgid = imageUrl;
    }
    public int getImage() {
        return imgid;
    }
}
