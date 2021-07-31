create table member
(
    id varchar not null
        constraint member_pk
            primary key auto_increment,
    name varchar not null
);

create table attr
(
    attr_id varchar not null,
    attr_name varchar not null
);