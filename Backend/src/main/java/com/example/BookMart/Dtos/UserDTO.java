package com.example.BookMart.Dtos;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UserDTO {
    private int id;
    private String username;
    private String email;
    private String password;
    private String userType;

//    @Override
//    public String toString() {
//        return "UserDTO{" +
//                "id=" + id + '\'' +
//                "username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", userType='" + userType + '\'' +
//                '}';
//    }
}

