package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
    Flux<User> findAllByAge(int name);
    Mono<User> findByName(String name);
}
