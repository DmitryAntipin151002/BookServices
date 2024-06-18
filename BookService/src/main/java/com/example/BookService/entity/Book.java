package com.example.BookService.entity;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    private Long bookId;
    private String title;
    private String author;
    private String description;
    private String coverUrl;
    private String genre;
    private LocalDate publicationDate;


    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", genre='" + genre + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
