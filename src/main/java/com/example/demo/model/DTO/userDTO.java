package com.example.demo.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class userDTO {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
}
