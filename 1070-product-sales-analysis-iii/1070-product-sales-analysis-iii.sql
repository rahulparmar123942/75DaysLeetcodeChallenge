# Write your MySQL query statement below
select 
s.product_id,
f.first_year,
s.quantity,
s.price
from Sales s
JOIN
(
    select product_id,MIN(year) as first_year
    from sales
    group by product_id
) f
on s.product_id = f.product_id
and s.year = f.first_year

