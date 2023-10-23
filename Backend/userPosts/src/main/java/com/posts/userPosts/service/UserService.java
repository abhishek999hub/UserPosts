package com.posts.userPosts.service;

import com.posts.userPosts.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);

    //get all user
    List<User> getAllUser();

    //get one user by Id
    User getUserById(Long id);
}
