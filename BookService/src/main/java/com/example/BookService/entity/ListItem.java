package com.example.BookService.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ListItem {

    private Long listItemId;
    private Long listId;
    private Long bookId;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "ListItem{" +
                "listItemId=" + listItemId +
                ", listId=" + listId +
                ", bookId=" + bookId +
                '}';
    }
}
