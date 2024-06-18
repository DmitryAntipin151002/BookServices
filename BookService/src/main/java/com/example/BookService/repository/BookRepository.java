package com.example.BookService.repository;



import com.example.BookService.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Дополнительные методы для работы с книгами, если нужно
}


