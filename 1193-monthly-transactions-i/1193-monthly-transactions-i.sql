# Write your MySQL query statement below
SELECT 
-- left(trans_date,7)AS country,2rty
date_format(trans_date,'%Y-%m') as month,
country,
COUNT(id) AS trans_count,
SUM(if(state='approved',1,0))AS approved_count,
SUM(amount) AS trans_total_amount,
SUM(if(state='approved',amount,0))AS approved_total_amount
 
FROM transactions
GROUP BY month,country
