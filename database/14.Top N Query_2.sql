-- 3000원 미만인 과자와 아이스크림 중에서 가격이 가장 저렴한 상품 2개만 조회


select * from(
    select TMP.*, rownum rn from(
       select * from product where price < 3000 
       order by price asc 
    )TMP
) where rn between 1 and 2;