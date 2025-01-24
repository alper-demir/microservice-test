package com.microservice.post_service.controller;

import com.microservice.post_service.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final RestTemplate restTemplate;
    private final UserClient userClient;

    public PostController(RestTemplate restTemplate, UserClient userClient) {
        this.restTemplate = restTemplate;
        this.userClient = userClient;
    }

    @GetMapping
    public String getPost(){
        return "Post";
    }


//    @GetMapping("/user-info")
//    public String getUserFromUserService() {
//
//        String userResponse = restTemplate.getForObject("http://user-service/api/user", String.class);
//
//        return "User Service'den gelen cevap: " + userResponse;
//    }

    @GetMapping("/user-info")
    public String getUserFromUserService() {
        // Feign Client üzerinden User Service'e GET isteği yap
        String userResponse = userClient.getUser();
        return "User Service'den gelen cevap: " + userResponse;
    }

}
