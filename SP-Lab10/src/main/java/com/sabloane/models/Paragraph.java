package com.sabloane.models;

import com.sabloane.services.AlignStrategy;
import com.sabloane.services.Visitee;
import com.sabloane.services.Visitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paragraph extends Element implements Visitee {
    private String text;

    @ManyToOne
    private AlignStrategy alignStrategy;

    @Id
    @GeneratedValue
    private Long id;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public Paragraph() {
        this.text = "";
        this.alignStrategy = null;
    }

    public String getText() {
        return text;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    public void setAlign(AlignStrategy align) {
        this.alignStrategy = align;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
