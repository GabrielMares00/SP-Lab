package services;

import models.*;

public class BookSaverVisitor implements Visitor {
    private String stringJSON;

    public BookSaverVisitor() {
        this.stringJSON = "{\n";
    }

    @Override
    public void visitBook(Book book) {
        this.stringJSON += "\t\"book\":\n\t\t{\n"
                        + "\t\t\"bookTitle\": " + "\"" + book.getTitle() + "\","
                        + "\n\t\t\"authors\": " + "\"" + book.getAuthors().toString() + "\","
                        + "\n\t\t\"bookElements\":";

        if (book.getElements() != null)
        {
            this.stringJSON += "\n\t\t{\n";
            for (Element i : book.getElements()) {
                Visitee castedI = (Visitee) i;
                castedI.accept(this);
                if (i != book.getElements().get(book.getElements().size() - 1))
                    this.stringJSON += ",\n";
            }
            this.stringJSON += "\n\t\t}";
        }
        else
            this.stringJSON += " null\n";

        this.stringJSON += "\n\t\t}";
    }

    @Override
    public void visitSection(Section section) {
        this.stringJSON += "\t\t\t\"section\":\n\t\t\t{\n"
                        + "\t\t\t\t\"sectionTitle\": " + "\"" + section.getTitle() + "\","
                        + "\n\t\t\t\t\"sectionElements\": ";

        if (section.getElements() != null) {
            this.stringJSON += "\n\t\t\t\t\t{\n";
            for (Element i : section.getElements()) {
                Visitee castedI = (Visitee) i;
                castedI.accept(this);
                if (i != section.getElements().get(section.getElements().size() - 1))
                    this.stringJSON += ",\n";
            }
            this.stringJSON += "\n\t\t\t\t\t}";
        }
        else
            this.stringJSON += "\n\t\t\t\t\t}\n";

        this.stringJSON += "\n\t\t\t}";
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        this.stringJSON += "\t\t\t\t\t\t\"Cuprins\": null";
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.stringJSON += "\t\t\t\t\t\t\"paragraph\": " + "\"" + paragraph.getText() + "\"";
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.stringJSON += "\t\t\t\t\t\t\"imageProxy\": " + "\"" + imageProxy.getUrl() + "\"";
    }

    @Override
    public void visitImage(Image image) {
        this.stringJSON += "\t\t\t\t\t\t\"image\": " + "\"" + image.getImageName() + "\"";
    }

    @Override
    public void visitTable(Table table) {
        this.stringJSON += "\t\t\t\t\t\t\"table\": " + "\"" + table.getTitle() + "\"";
    }

    public void endJsonString() {
        this.stringJSON = this.stringJSON + "\n}";
    }

    public void printJsonString() {
        System.out.println(this.stringJSON);
    }
}
