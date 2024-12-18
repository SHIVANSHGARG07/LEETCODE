# Write your MySQL query statement below

-- use unique 
-- count

select  teacher_id  , COUNT(Distinct subject_id ) as cnt from  teacher group by teacher_id;