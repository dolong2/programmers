select car_id, round(avg(datediff(end_date, start_date)), 1) + 1 as average_duration
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id having average_duration >= 7
order by average_duration DESC, car_id DESC;
