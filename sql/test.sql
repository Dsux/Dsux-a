select customers.cust_id, order_num
from customers left outer join orders
on customers.cust_id = orders.cust_id;