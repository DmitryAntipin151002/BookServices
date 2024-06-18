package com.example.BookService.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ListItemDTO {

    private Long listItemId;
    private Long listId;
    private Long bookId;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "ListItemDTO{" +
                "listItemId=" + listItemId +
                ", listId=" + listId +
                ", bookId=" + bookId +
                '}';
    }
}

