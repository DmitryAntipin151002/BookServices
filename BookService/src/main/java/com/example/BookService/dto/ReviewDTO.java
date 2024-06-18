package com.example.BookService.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ReviewDTO {

    private Long reviewId;
    private Long userId;
    private Long bookId;
    private int rating;
    private String comment;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "ReviewDTO{" +
                "reviewId=" + reviewId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}


