SELECT car_type, count(*)
from car_rental_company_car
where options LIKE '%가죽시트%' OR options LIKE '%열선시트%' OR options LIKE '%통풍시트%'
group by car_type
order by car_type asc;
