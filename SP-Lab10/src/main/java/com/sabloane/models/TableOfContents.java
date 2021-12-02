package com.sabloane.models;

import com.sabloane.models.Element;
import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

public class TableOfContents implements Element, Visitee {
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
        visitor.visitTableOfContents(this);
    }
}
