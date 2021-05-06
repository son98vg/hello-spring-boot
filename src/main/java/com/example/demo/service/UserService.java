package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.DTO.userDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<userDTO> getListUser();

    userDTO getUserById(int id);

    public List<userDTO> searchUser(String keyword);
}
