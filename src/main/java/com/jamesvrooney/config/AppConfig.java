package com.jamesvrooney.config;

import com.jamesvrooney.service.JsonPlaceholderClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AppConfig {

    @Value("${JsonPlaceholderClient.baseUrl}")
    private String JsonPlaceholderClientBaseUrl;

    @Bean
    JsonPlaceholderClient jsonPlaceholderClient() {
        final WebClient webClient = WebClient.builder().baseUrl(JsonPlaceholderClientBaseUrl).build();

        final HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient)).build();

        JsonPlaceholderClient jsonPlaceholderClient = factory.createClient(JsonPlaceholderClient.class);

        return jsonPlaceholderClient;
    }
}
