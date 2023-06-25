SELECT MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d') as DATE_OF_BIRTH 
  from MEMBER_PROFILE 
  where TLNO is not null and GENDER = 'W' and month(DATE_OF_BIRTH) = 3;
