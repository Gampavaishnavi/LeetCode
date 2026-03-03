# Write your MySQL query statement below
select d.name as Department,e1.name as Employee, e1.salary as Salary
from Employee e1 join Department d 
on e1.departmentId = d.id
where
(
    Select count(distinct salary)
    from Employee e2
    where e1.departmentId = e2.departmentId and e2.salary >= e1.salary
) <=3
order by Department, Salary desc;