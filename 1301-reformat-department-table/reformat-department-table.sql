# Write your MySQL query statement below
select id, 
sum(case when month = 'Jan' then revenue else null end) as Jan_Revenue,
sum(case when month = 'Feb' then revenue else null end) as Feb_Revenue,
SUM(CASE WHEN month = 'Mar' THEN revenue ELSE NULL END) AS Mar_Revenue,
    SUM(CASE WHEN month = 'Apr' THEN revenue ELSE NULL END) AS Apr_Revenue,
    SUM(CASE WHEN month = 'May' THEN revenue ELSE NULL END) AS May_Revenue,
    Max(CASE WHEN month = 'Jun' THEN revenue ELSE NULL END) AS Jun_Revenue,
    max(CASE WHEN month = 'Jul' THEN revenue ELSE NULL END) AS Jul_Revenue,
    max(CASE WHEN month = 'Aug' THEN revenue ELSE NULL END) AS Aug_Revenue,
    SUM(CASE WHEN month = 'Sep' THEN revenue ELSE NULL END) AS Sep_Revenue,
    SUM(CASE WHEN month = 'Oct' THEN revenue ELSE NULL END) AS Oct_Revenue,
    Max(CASE WHEN month = 'Nov' THEN revenue ELSE NULL END) AS Nov_Revenue,
    SUM(CASE WHEN month = 'Dec' THEN revenue ELSE NULL END) AS Dec_Revenue
from Department
group by id;