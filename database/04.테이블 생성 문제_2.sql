/*성적 정보를 테이블로 구현하세요
 (참고)
 - 오라클은 &&대신 and, || 대신 or 을 사용한다.
 - 구간을 처리할 수 있는 between연산을 따로 지원한다.
 - unique 키워드를 추가하면 중복 데이터의 추가가 불가능하다.
 */

create table human(
name varchar(21) unique check(regexp_like(name, '^[가-힣]{2,7}$')),
korean number(3) check(korean >= 0 and korean <= 100),
--korean number(3) check(korean between 0 and 100),
english number(3) check(english >= 0 and english <= 100),
math number(3) check(math >= 0 and math <= 100));

insert into human(name, korean, english, math)
values('피카츄', 90, 90, 85);

insert into human(name, korean, english, math)
values('라이츄', 80, 90, 85);

insert into human(name, korean, english, math)
values('꼬부기', 100, 90, 90);

SELECT * from human;