package com.example.BookService.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class List {

    private Long listId;
    private Long userId;
    private String name;
    private String description;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "List{" +
                "listId=" + listId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
