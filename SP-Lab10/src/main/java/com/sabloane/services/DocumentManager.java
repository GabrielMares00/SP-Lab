package com.sabloane.services;

import com.sabloane.models.Book;

public class DocumentManager {
    private static DocumentManager instance;
    private Book book;

    private DocumentManager() {
        //
    }

    public static DocumentManager getInstance() {
        if (instance == null)
            instance = new DocumentManager();

        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
