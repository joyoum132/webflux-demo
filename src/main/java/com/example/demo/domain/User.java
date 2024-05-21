package com.example.demo.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table
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
}
