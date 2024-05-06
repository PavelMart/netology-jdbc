create schema jdbc_test;

create table jdbc_test.customers(
   id bigserial primary key,
   name varchar(50) ,
   surname varchar(50) ,
   age integer check ( age > 0 ),
   phone_number varchar(10) unique
);

create table jdbc_test.orders(
    id bigserial primary key,
    date timestamp default current_timestamp,
    customer_id bigint references jdbc_test.customers(id),
    product_name varchar(50),
    amount integer check ( amount > 0 )
);

insert into jdbc_test.customers(name, surname, age, phone_number)
values ('pavel', 'martakov', 27, '9281112244'),
       ('Alexey', 'einstein', 75, '9992221122'),
       ('ALEXEY', 'trunov', 32, '9876543210'),
       ('alexey', 'nikitin', 20, '9281113322');

insert into jdbc_test.orders(customer_id, product_name, amount)
values (1, 'Молоко', 3),
       (1, 'Булка', 2),
       (2, 'Кофе', 1),
       (3, 'Чипсы', 5),
       (4, 'Майонез', 1),
       (4,'Крабовые палочки', 10);