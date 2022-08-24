-- 삭제(delete)
-- 기존에 등록한 데이터를 없애는 명령(commit/rollback 필요)
-- 대부분 PK를 이용한 단일 삭제로 처리한다.

-- delete [from] 테이블 [조건]
delete product;
delete product where no = 5;

-- (Q) 2020년 상반기에 제조된 상품 정보를 삭제

--(1)
delete product where extract(year from made)=2020 
    and extract(month from made) between 1 and 6;

--(2) 비추
delete product where regexp_like(to_char(made, 'yyyymm'), '20200[1-6]');

--(3)
delete product where made between 
    to_date('20200101000000','yyyymmddhh24miss') 
        and 
        to_date('20200630235959','yyyymmddhh24miss');

select * from product;

rollback;