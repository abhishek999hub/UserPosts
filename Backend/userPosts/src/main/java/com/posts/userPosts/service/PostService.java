package com.posts.userPosts.service;

import com.posts.userPosts.entity.Post;
import com.posts.userPosts.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();

    //get one user by Id
    Post getPostById(Long id);
}
