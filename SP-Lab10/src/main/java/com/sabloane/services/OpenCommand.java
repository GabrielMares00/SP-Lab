package com.sabloane.services;

import com.sabloane.models.*;

public class OpenCommand implements Command {
    private String bookTitle;

    public OpenCommand(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void execute() throws Exception {
        Book book = new Book(this.bookTitle);
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.addWithoutCopy(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        book.addContent(cap1);

        DocumentManager.getInstance().setBook(book);
    }
}
