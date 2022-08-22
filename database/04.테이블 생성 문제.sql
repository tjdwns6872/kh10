/*과거에 풀었던 객체지향 문제 중 FIFA 랭킹을 테이블로 구현*/
create table fifa(
no number(1),
country VARCHAR2(27),
score number(6, 2));

insert into fifa(no, country, score) values(1, '브라질', 1828.45);
insert into fifa(no, country, score) values(2, '벨기에', 1823.42);
insert into fifa(no, country, score) values(3, '프랑스', 1786.15);

commit;