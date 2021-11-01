package models;

import models.Element;
import services.Visitee;
import services.Visitor;

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
