select product_name
from orders
         join customers on orders.customer_id = customers.id
where LOWER(customers.name) = :name;