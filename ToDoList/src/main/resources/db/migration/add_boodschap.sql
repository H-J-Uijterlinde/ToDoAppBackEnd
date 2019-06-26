-- I used flyway to transform the manual SQL schema's I wrote into tables in my database. this isn't strictly
-- necessary but as applications get bigger, managing your database this way can prevent errors.

create table Boodschap
(
    id bigint not null
        constraint ToDo_pkey
            primary key,
    title varchar (1000),
    completed boolean not null
);

alter table Boodschap owner to postgres;
