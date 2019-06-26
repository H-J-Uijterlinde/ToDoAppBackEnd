create table ToDo
(
    id bigint not null
        constraint ToDo_pkey
            primary key,
    title varchar (1000),
    completed boolean not null
);

alter table ToDo owner to postgres;
