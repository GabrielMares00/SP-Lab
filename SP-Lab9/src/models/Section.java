package models;

import services.Utils;
import services.Visitee;
import services.Visitor;

import java.util.ArrayList;
import java.util.Collections;

public class Section implements Element, Visitee {
    private String title;
    private ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    public Section(Section section) {
        this.title = section.title;
        this.elements = new ArrayList<>();
        Collections.copy(this.elements, section.elements);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    @Override
    public void add(Element elementToBeAdded) throws Exception {
        Element element = Utils.checkAndReturnCopy(elementToBeAdded);
        this.elements.add(element);
    }

    public void addWithoutCopy(Element elementToBeAdded) throws Exception {
        this.elements.add(elementToBeAdded);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
