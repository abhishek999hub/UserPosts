package com.posts.userPosts.repo;
import com.posts.userPosts.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepo extends JpaRepository<Post, Long> {
    }


