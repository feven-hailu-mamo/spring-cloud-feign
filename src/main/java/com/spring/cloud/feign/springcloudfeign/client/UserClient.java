package com.spring.cloud.feign.springcloudfeign.client;

import com.spring.cloud.feign.springcloudfeign.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {
    @GetMapping("/users")
    List<UserResponse> getUsers();
}
