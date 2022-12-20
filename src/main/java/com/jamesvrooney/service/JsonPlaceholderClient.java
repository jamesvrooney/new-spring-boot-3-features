package com.jamesvrooney.service;

import com.jamesvrooney.model.Post;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface JsonPlaceholderClient {

    @GetExchange("/posts")
    List<Post> getAllPosts();
}
