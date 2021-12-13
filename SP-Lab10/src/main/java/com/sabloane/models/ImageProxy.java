package com.sabloane.models;

import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ImageProxy extends Element implements Picture, Visitee {
    private String url;

    @OneToOne
    private Dimension dim = new Dimension(300, 300);

    @OneToOne
    private Image img;

    @Id
    @GeneratedValue
    private Long id;

    public ImageProxy(String url) {
        this.url = url;
    }

    public ImageProxy(ImageProxy imageProxy) {
        this.url = imageProxy.url;
        this.dim = imageProxy.dim;
        this.img = imageProxy.img;
    }

    public ImageProxy() {
        this.url = "";
        this.dim = null;
        this.img = null;
    }

    public String getUrl() {
        return url;
    }

    public Dimension getDim() {
        return dim;
    }

    public Image loadImage() {
        if (this.img == null) {
            this.img = new Image(url);
        }

        return this.img;
    }

    @Override
    public void add(Element element) throws Exception {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public Element clone() {
        return new ImageProxy(this.url);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}