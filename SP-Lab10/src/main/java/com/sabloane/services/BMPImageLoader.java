package com.sabloane.services;

public class BMPImageLoader implements ImageLoader {
    private String imageName;

    public BMPImageLoader(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load(String str) {
        System.out.println("Loaded BMP models.Image: " + imageName);
    }
}
