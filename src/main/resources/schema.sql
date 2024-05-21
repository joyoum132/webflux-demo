create table if not exists person
(
    id   bigint auto_increment primary key,
    name varchar(100) null,
    age  int          null
);

create table if not exists user
(
    id         bigint auto_increment primary key,
    name       varchar(255) not null,
    age   int not null,
    created    datetime(6)  not null,
    updated    datetime(6)  not null
);

