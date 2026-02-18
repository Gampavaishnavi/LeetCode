# Write your MySQL query statement below
select employee_id
from employees e
where manager_id != 'null' and salary<30000 and
manager_id not in(
    select employee_id
    from Employees e
)
order by employee_id;