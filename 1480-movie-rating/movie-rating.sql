# Write your MySQL query statement below
(select u.name as results
from Users u
join MovieRating m
where u.user_id = m.user_id
group by u.user_id, u.name
order by count(*) Desc, u.name Asc
limit 1
)
UNION ALL
(
select mv.title
from Movies mv
join MovieRating mr
on mv.movie_id = mr.movie_id
where mr.created_at between '2020-02-01' and '2020-02-29'
group by mv.movie_id, mv.title
order by avg(mr.rating) Desc, mv.title Asc
limit 1
);