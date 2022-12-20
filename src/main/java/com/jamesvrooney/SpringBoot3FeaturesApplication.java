package com.jamesvrooney;

import com.jamesvrooney.model.Post;
import com.jamesvrooney.repository.PostRepository;
import com.jamesvrooney.service.JsonPlaceholderClient;
import com.jamesvrooney.service.PostService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class SpringBoot3FeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3FeaturesApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(JsonPlaceholderClient jsonPlaceholderClient, PostRepository postRepository) {
		return args -> {

			final List<Post> posts = jsonPlaceholderClient.getAllPosts();

			postRepository.saveAll(posts);
		};
	}
}
