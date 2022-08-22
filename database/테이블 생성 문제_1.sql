/*통신사 요금제 정보를 테이블로 구현*/
create table telecom(
comm varchar2(4),
name varchar2(21),
price number(6),
data number(3),
call number(4),
sms number(4));

insert into telecom(comm, name, price, data, call, sms)
values('SK', '5G언택트 52', 52000, 200, 1000, 2000);

insert into telecom(comm, name, price, data, call, sms)
values('KT', '5G세이브', 45000, 100, 900, 1500);

insert into telecom(comm, name, price, data, call, sms)
values('LG', '5G시그니처', 130000, 500, 2000, 2500);

commit;