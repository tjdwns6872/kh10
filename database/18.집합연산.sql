--집합 연산
-- 결과 집합 간의 계산
-- 자바에서 Set으로 집합연산을 했었다.
-- 오라클에서는 결과 집합(Result Set)으로 한다.

-- (참고) select distinct는 중복을 제거하고 조회한다.
-- 차이를 만들기 위한 insert 구문 추가
insert into exam values(17, '피카츄', '데이터베이스구현', '서술형', 85);
insert into exam values(18, '라이츄', 'SQL활용', '서술형', 76);
commit;

-- 피카츄가 응시한 과목
select subject from exam where student = '피카츄';

-- 라이츄가 응시한 과목
select subject from exam where student = '라이츄';

-- 합집합 : A + B
select distinct subject from exam where student = '피카츄'
union
select distinct subject from exam where student = '라이츄';

-- 교집합 : A n B
select distinct subject from exam where student = '피카츄'
intersect
select distinct subject from exam where student = '라이츄';

-- 차집합 : A - B or B - A
select distinct subject from exam where student = '피카츄'
minus
select distinct subject from exam where student = '라이츄';

select distinct subject from exam where student = '라이츄'
minus
select distinct subject from exam where student = '피카츄';



