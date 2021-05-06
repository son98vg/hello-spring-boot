package com.example.demo.model.mapper;

import com.example.demo.entity.User;
import com.example.demo.model.DTO.userDTO;

public class UserMapper {
    public static userDTO toUserDTO(User user) {
        userDTO tmp = new userDTO();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone(user.getPhone());
        tmp.setAvatar(user.getAvatar());
        return tmp;
    }
}
