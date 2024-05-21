package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Flux<User> initUser() {
        List<User> users = new ArrayList<>();
        for(int i=0; i<50; i++) {
            users.add(
                    new User("name"+ i, i%7)
            );
        }

        return userRepository.saveAll(users);
    }

    public Flux<User> findAllByAge(int age) {
        return userRepository.findAllByAge(age);
    }

    public Mono<UserDto> findByName(String name) {
        return userRepository.findByName(name)
                .map(it-> UserDto.builder()
                        .id(it.getId())
                        .name(it.getName())
                        .created(it.getCreated())
                        .build());
    }

}
