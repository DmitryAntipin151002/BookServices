package com.example.BookService.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {

    private Long reviewId;
    private Long userId;
    private Long bookId;
    private int rating;
    private String comment;



    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}

