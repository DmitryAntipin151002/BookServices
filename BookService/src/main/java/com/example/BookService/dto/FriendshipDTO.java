package com.example.BookService.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class FriendshipDTO {

    private Long friendshipId;
    private Long user1Id;
    private Long user2Id;
    private String status;

    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "FriendshipDTO{" +
                "friendshipId=" + friendshipId +
                ", user1Id=" + user1Id +
                ", user2Id=" + user2Id +
                ", status='" + status + '\'' +
                '}';
    }
}

