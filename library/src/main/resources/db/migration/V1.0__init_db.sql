create table book (
    id serial primary key,
    title varchar(255) not null,
    author varchar(255) not null,
    published_date date not null,
    genre varchar(100) not null,
    rental_length integer not null,
);

create table reader (
    id serial primary key,
    name varchar(255) not null,
    email varchar(255) not null unique,
    phone varchar(20) not null,
    address varchar(255) not null
);

create table rental (
    id serial primary key,
    book_id integer references book(id),
    reader_id integer references reader(id),
    rental_date date not null,
    return_date date
);