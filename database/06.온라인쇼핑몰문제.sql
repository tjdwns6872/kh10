/*온라인 쇼핑몰 상품 정보 테이블로 구현하세요*/

create table shop(
name varchar2(20) UNIQUE not null,
type varchar2(6) check(type in('주류', '과자')) not null,
price number check(price >= 0) not null,
shipping char(1) check (upper(shipping) = 'Y'),
event char(1) check (upper(event) = 'Y')
);

insert into shop(name, type, price, shipping, event) 
values('참이슬후레쉬', '주류', 1200, 'Y', 'Y');

insert into shop(name, type, price, event)
values('클라우드맥주', '주류', 3000, 'Y');

insert into shop(name, type, price, event)
values('바나나킥', '과자', 1500, 'Y');

insert into shop(name, type, price, shipping)
values('허니버터칩', '과자', 2000, 'y');

commit;

SELECT * from shop;