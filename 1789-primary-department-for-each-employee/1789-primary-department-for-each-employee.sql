select 
distinct employee_id, department_id
from employee
where employee_id IN(
    select employee_id
    from employee
    group by employee_id
    having count(*)=1
) OR primary_flag = 'Y'
order by employee_id
