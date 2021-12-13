package com.sabloane.services;

import com.sabloane.models.Book;
import com.sabloane.persitence.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(Math.toIntExact(id));

        if (optionalBook.isPresent())
            return optionalBook.get();
        //throw exception

        return null;
    }
}
