package com.posts.userPosts.controller;

import com.posts.userPosts.entity.Post;
import com.posts.userPosts.entity.User;
import com.posts.userPosts.service.PostService;
import com.posts.userPosts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public ResponseEntity<Post> getApiService(@RequestBody Post post) {

        Post post1 = postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post1);
    }
    //for getting one user
    @GetMapping("{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id)
    {
        Post post = postService.getPostById(id);
        return ResponseEntity.ok(post);
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts()
    {
        List<Post> AllPosts = postService.getAllPosts();
        return ResponseEntity.ok(AllPosts);
    }
}
