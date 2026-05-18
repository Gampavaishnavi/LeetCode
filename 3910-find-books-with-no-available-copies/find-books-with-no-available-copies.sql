# Write your MySQL query statement below
select l.book_id, l.title, l.author, l.genre, l.publication_year, if(total_copies - count(case when b.return_date IS NULL then 1 end) = 0, count(case when b.return_date IS NULL then 1 end), Null) as current_borrowers
from library_books l 
join borrowing_records b
on l.book_id = b.book_id
group by book_id
having current_borrowers is Not Null
order by current_borrowers DESC, title