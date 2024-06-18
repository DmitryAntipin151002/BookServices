package com.example.BookService.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private Long userId;
    private String username;
    private String email;
    private String password;
    private String avatarUrl;
    private String bio;


    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
