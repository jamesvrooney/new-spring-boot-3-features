package com.jamesvrooney.controller;

import com.jamesvrooney.model.Post;
import com.jamesvrooney.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/posts")
public class PostController {

    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        var posts = postService.getAll();

        return posts;
    }
}
