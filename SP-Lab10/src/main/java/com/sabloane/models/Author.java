package com.sabloane.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
    private String name;

    @Id
    @GeneratedValue
    private Long id;

    public Author(String name) {
        this.name = name;
    }

    public Author() {
        this.name = "";
    }

    public void print() {
        System.out.println(this.name);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
