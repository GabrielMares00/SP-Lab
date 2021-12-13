package com.sabloane.services;

import com.sabloane.models.Context;
import com.sabloane.models.Paragraph;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class AlignStrategy {
    private Long id;

    void render(Paragraph paragraph, Context context) {
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
