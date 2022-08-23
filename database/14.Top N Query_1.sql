--2020년에 만든 상품(product) 중에서 가장 최근에 만든 상품 3개를 조회

--2020년도 부터 만들고

select * from(
    select TMP.*, rownum rn from(
       select * from product where extract (year from made) = 2020 order by made desc
    )TMP
) where rn between 1 and 3;