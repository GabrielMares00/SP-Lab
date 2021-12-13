package com.sabloane.models;

import com.sabloane.models.Author;
import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Visitee {
    private String title;

    @OneToMany (targetEntity = Element.class)
    private ArrayList<Element> elements;

    @OneToMany (targetEntity = Author.class)
    private ArrayList<Author> authors;

    @Id
    @GeneratedValue
    private Long id;

    public Book(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
        this.authors = new ArrayList<Author>();
    }

    public Book() {

    }

    public void addContent (Element element) {
        this.elements.add(element);
    }

    public void addAuthor (Author author) {
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}