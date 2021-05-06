package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.DTO.userDTO;
import com.example.demo.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements  UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Nguyễn Thị Mộng Mơ", "mongmo@gmail.com","0987654321","avatar.img","123"));
        users.add(new User(2, "Bùi Như Lạc", "laclac@gmail.com","0123456789","avatar1.img","123"));
        users.add(new User(3, "Phan Thị Lỏng Lẻo", "longleo@gmail.com","0987564664","avatar3.img","123"));
        users.add(new User(4, "Bành Thị Tèo", "teo@gmail.com","0874845455","avatar9.img","123"));
    }

    @Override
    public List<userDTO> getListUser() {
        List<userDTO> result = new ArrayList<userDTO>();
        for (User user: users) {
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }



    @Override
    public userDTO getUserById(int id) {
        for(User user: users) {
            if (user.getId() == id) {
                return UserMapper.toUserDTO(user);
            }
        }
        return null;
    }

    @Override
    public List<userDTO> searchUser(String keyword) {
        List<userDTO> result = new ArrayList<userDTO>();
        for (User user: users) {
            if (user.getName().contains(keyword)) {
                result.add(UserMapper.toUserDTO(user));
            }
        }
        return  result;
    }
}
