package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table
@ToString
@Setter
@Getter
public class User {
    @Id
    @Column("id")
    private Long id;

    @Column("name")
    private String name;

    @Column("age")
    private int age;

    @Column("created")
    @CreatedDate
    private LocalDateTime created;

    @Column("updated")
    @LastModifiedDate
    private LocalDateTime updated;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
