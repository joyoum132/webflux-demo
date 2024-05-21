package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public Flux<User> createUser() {
        return userService.initUser();
    }

    @GetMapping("/age/{age}")
    public Flux<User> getUsersByAge(@PathVariable int age) {
        return userService.findAllByAge(age);
    }

    @GetMapping("/name/{name}/single")
    public Mono<UserDto> getUserByName(@PathVariable String name) {
        return userService.findByName(name);
    }

}
