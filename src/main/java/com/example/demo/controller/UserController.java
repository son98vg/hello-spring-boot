package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.model.DTO.userDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        List<userDTO> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public userDTO getUserById(@PathVariable int id) {
        userDTO user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchUer(@RequestParam(name = "keyword") String name) {
        List<userDTO> users = userService.searchUser(name);
        return ResponseEntity.ok(users);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser() {
        return null;
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
