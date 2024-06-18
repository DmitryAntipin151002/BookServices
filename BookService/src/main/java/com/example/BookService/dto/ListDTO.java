package com.example.BookService.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ListDTO {

    private Long listId;
    private Long userId;
    private String name;
    private String description;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "ListDTO{" +
                "listId=" + listId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

