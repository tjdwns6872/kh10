/*통신사 요금제 정보를 테이블로 구현
 - (참고) 문자열은 char(고정) 와 varchar2(가변)가 존재한다. 
 - char는 무조건 지정된 크기를 꽉 채워서 저장 (속도)
 - varchar2는 최대 크기만 지키고 내부에서 자유롭게 사용 (효율)
 
 - 테이블에 들어갈 값의 형태를 check 조건을 설정하여 지정할 수 있다.
 - in 이라는 기호가 있으면 우측에 있는 값 중 하나에 해당된다는 뜻*/
create table plan(
telecom varchar2(2) check(telecom in( 'SK', 'KT', 'LG')),
name varchar2(21),
price number(6) check(price >= 0),
data number(3) check(data >= 0),
call number(4) check(call >= 0),
sms number(4) check(sms >= 0));

insert into plan(telecom, name, price, data, call, sms)
values('SK', '5G언택트 52', 52000, 200, 1000, 2000);

insert into plan(telecom, name, price, data, call, sms)
values('KT', '5G세이브', 45000, 100, 900, 1500);

insert into plan(telecom, name, price, data, call, sms)
values('LG', '5G시그니처', 130000, 500, 2000, 2500);

commit;