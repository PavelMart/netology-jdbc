select product_name
from jdbc_test.orders
         join jdbc_test.customers on jdbc_test.orders.customer_id = jdbc_test.customers.id
where lower(jdbc_test.customers.name) = :name;