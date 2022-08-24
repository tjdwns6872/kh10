-- 수정(update)
-- 기존에 등록한 데이터를 원하는 값으로 변경하는 구문(commit/rollback 필요)
-- 전체를 변경하는 경우보다 조건을 포함하여 원하는 항목만 변경하는 경우가 더 많다.

-- (Q) product 테이블의 상품 가격을 1200원으로 변경
update product set price=1200;

-- (Q) 1번 상품의 가격을 1500원으로 변경
update product set price = 1500 where no = 1;

-- (Q) 스크류바의 가격을 2000원으로 인상
update product set price = 2000 where name = '스크류바';

-- (Q) 멘토스의 가격을 1000원으로 인하, 분류를 과자로 변경
update product set price = 1000, type = '과자' where name = '멘토스'; 

-- (Q) 과자 가격 500원 할인
update product set price = price-500 where type = '과자';

-- (Q) 아이스크림 가격 10% 인상
update product set price = price*(1+10/100) where type = '아이스크림';


select * from product;
rollback;



