# Write your MySQL query statement below
select customer_id 
from Customer
group by customer_id
having count(distinct product_key) = (select count(product_key) from Product)
#there are two products so it will count the distinct products keys from the productkey table and checks if both the counts are equal