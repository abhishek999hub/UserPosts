package com.posts.userPosts.repo;

import com.posts.userPosts.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface UserRepository extends JpaRepository<User, Long> {
    }

