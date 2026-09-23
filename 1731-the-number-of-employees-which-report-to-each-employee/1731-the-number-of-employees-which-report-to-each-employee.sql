# Write your MySQL query statement below
# manager = >1 has reporting to them 
# name = manager_name
# employee_id = reports_to hua to count increase karenge 
select 
m.employee_id,
m.name,
count(e.employee_id) as reports_count,
round(AVG(e.age),0) as average_age
from Employees m
join Employees e
on m.employee_id = e.reports_to
group by  m.employee_id, m.name
order by employee_id Asc;
