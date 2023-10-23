package com.posts.userPosts.service.serviceImpl;

import com.posts.userPosts.entity.Post;
import com.posts.userPosts.exception.ResourceNotFoundException;
import com.posts.userPosts.repo.PostRepo;
import com.posts.userPosts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;
    @Override
    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        return postRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post not found by ID"+id));
    }
}
