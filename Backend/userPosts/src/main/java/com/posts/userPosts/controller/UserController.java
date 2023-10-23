package com.posts.userPosts.controller;

import com.posts.userPosts.entity.User;
import com.posts.userPosts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> getApiService(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    //for getting one user
    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id)
    {
        User user = userService.getUserById(id);
        // return ResponseEntity.ok().body(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> Alluser = userService.getAllUser();
        return ResponseEntity.ok(Alluser);
    }
}
