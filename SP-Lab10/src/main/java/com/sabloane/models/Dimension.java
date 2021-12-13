package com.sabloane.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dimension {
    private int height;
    private int width;

    @Id
    @GeneratedValue
    private Long id;

    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Dimension() {
        this.height = 0;
        this.width = 0;
    }

    public void print() {
        System.out.println("models.Dimension :" + height + "," + width);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}