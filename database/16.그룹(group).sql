-- 그룹(Group)
-- 통계에서 많이 사용되는 기법
--OO별 이라는 단어가 들어가는 작업을 처리할 때 사용

-- (Q) 상품군별 가격 평균, 최대값, 최소값 출력
select type, 
    avg(price) 평균, 
    max(price),
    min(price) 
from product group by type;

-- 그룹의 성립 조건은 having 키워드를 뒤에 붙여서 설정한다.
-- (참고) where는 개별 데이터 필터링 조건이다.
select type, 
    avg(price) 평균, 
    max(price) 최대,
    min(price) 최소 
from product
group by type having min(price) >= 1000;






