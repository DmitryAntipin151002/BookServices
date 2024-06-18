package com.example.BookService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long bookId;
    private String title;
    private String author;
    private String description;
    private String coverUrl;
    private String genre;
    private LocalDate publicationDate;

    @Override
    public String toString() {
        return "BookDTO{" +
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
