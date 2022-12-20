package com.jamesvrooney.service;

import com.jamesvrooney.model.Post;
import com.jamesvrooney.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.net.URI;
import java.util.List;

@AllArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final JsonPlaceholderClient jsonPlaceholderClient;

    @Override
    public List<Post> getAll() {

        final List<Post> posts = jsonPlaceholderClient.getAllPosts();

        return posts;
    }
}
