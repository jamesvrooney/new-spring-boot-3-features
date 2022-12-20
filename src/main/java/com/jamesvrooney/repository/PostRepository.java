package com.jamesvrooney.repository;

import com.jamesvrooney.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Long> {
}
