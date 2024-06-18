package com.example.BookService.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Friendship {

    private Long friendshipId;
    private Long user1Id;
    private Long user2Id;
    private String status;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "Friendship{" +
                "friendshipId=" + friendshipId +
                ", user1Id=" + user1Id +
                ", user2Id=" + user2Id +
                ", status='" + status + '\'' +
                '}';
    }
}
