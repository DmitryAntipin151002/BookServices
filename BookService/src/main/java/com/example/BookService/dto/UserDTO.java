package com.example.BookService.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class UserDTO {

    private Long userId;
    private String username;
    private String email;
    private String password;
    private String avatarUrl;
    private String bio;


    // toString() method (optional but recommended for debugging)
    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}

