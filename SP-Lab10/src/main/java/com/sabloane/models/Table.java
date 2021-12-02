package com.sabloane.models;

import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

public class Table implements Element, Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public Table(Table table) {
        this.title = table.title;
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
