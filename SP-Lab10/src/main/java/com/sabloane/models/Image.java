package com.sabloane.models;

import com.sabloane.services.ImageLoaderFactory;
import com.sabloane.services.ImageLoader;
import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture, Visitee {
    private String imageName;
    private Dimension dim = new Dimension(400,400);

    private ImageLoader lodaer;
    private ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();

    public Image(String imageName) {
        this.imageName = imageName;

        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch( InterruptedException e) { e.printStackTrace(); }
    }

    public Image(Image image) {
        this.imageName = image.imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void loadContent() throws Exception {
        lodaer = ImageLoaderFactory.create(imageName);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
