# Write your MySQL query statement below
select 'Low Salary' as category,
count(if(income<20000,1,null)) as accounts_count
from Accounts
UNION ALL 
select 'Average Salary',
count(if(income>=20000 and income<=50000,1,null)) 
from Accounts
UNION ALL
select 'High Salary' ,
count(if(income>50000,1,null)) 
from Accounts;
