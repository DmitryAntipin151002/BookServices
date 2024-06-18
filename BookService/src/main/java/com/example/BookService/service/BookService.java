package com.example.BookService.service;



import com.example.BookService.entity.Book;
import com.example.BookService.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long bookId) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        return bookOptional.orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long bookId, Book book) {
        if (bookRepository.existsById(bookId)) {
            book.setBookId(bookId);
            return bookRepository.save(book);
        }
        return null; // Handle the case where book with given bookId does not exist
    }

    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}

