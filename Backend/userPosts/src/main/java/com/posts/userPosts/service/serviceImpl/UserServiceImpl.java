package com.posts.userPosts.service.serviceImpl;


import com.posts.userPosts.entity.User;
import com.posts.userPosts.exception.ResourceNotFoundException;
import com.posts.userPosts.repo.UserRepository;
import com.posts.userPosts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found by ID"+id));
    }
}
