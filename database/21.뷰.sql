-- 뷰(View
-- 가상 테이블 혹은 논리 테이블이라고 부름
-- 객체로 분류됨
-- 테이블을 원하는 형태로 바꿔서 보기 위해 사용
-- create view 권한이 필요하다(관리자)

-- 서술형 데이터만으로 무언가를 하고 싶다면 where를 계속 추가해야 한다.
create view essay as
select * from exam where type = '서술형';

create or replace view essay as
select * from exam where type = '서술형';

select * from essay where score < 60;

select * from exam;

-- (ex) 연도, 월, 일별 상품 제조 개수
create or replace view status as
    select 
        extract(year from made)연도, 
        extract(month from made) 월,
        count(*) 개수 
    from product 
    group by extract(year from made), extract(month from made)
    order by 연도 asc, 월 asc;

select 연도, 월, 개수 from status;










