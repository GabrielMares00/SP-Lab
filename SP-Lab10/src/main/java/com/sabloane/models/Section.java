package com.sabloane.models;

import com.sabloane.services.Utils;
import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collections;

@Entity
public class Section extends Element implements Visitee {
    private String title;

    @OneToMany
    private ArrayList<Element> elements;

    @Id
    @GeneratedValue
    private Long id;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    public Section(Section section) {
        this.title = section.title;
        this.elements = new ArrayList<>();
        Collections.copy(this.elements, section.elements);
    }

    public Section() {
        this.title = "";
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
