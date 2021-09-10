package com.deepesh.userservice.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
