package com.microservice.post_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// Request mapping burada kullanılamıyor
@FeignClient(name = "user-service") // user-service ismi, Eureka üzerinde kayıtlı servis adıdır.
public interface UserClient {
    @GetMapping("/api/user")
    String getUser(); // User Service’ten dönecek yanıt
}
