package com.sabloane.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Element {
    @Id
    @GeneratedValue
    private Long id;

    void add(Element element) throws Exception {
        // pass
    }

    void remove(Element element) {
        // pass
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
