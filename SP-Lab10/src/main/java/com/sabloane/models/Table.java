package com.sabloane.models;

import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Table extends Element implements Visitee {
    private String title;

    @Id
    @GeneratedValue
    private Long id;

    public Table(String title) {
        this.title = title;
    }

    public Table(Table table) {
        this.title = table.title;
    }

    public Table() {
        this.title = "";
    }

    public String getTitle() {
        return title;
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
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
