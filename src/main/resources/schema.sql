create table postgres.customers(
  id bigserial primary key,
  name varchar(50) ,
  surname varchar(50) ,
  age integer check ( age > 0 ),
  phone_number varchar(10) unique
);

create table postgres.orders(
   id bigserial primary key,
   date timestamp default current_timestamp,
   customer_id bigint references customers(id),
   product_name varchar(50),
   amount integer check ( amount > 0 )
);