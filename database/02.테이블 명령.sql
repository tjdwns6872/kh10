--포켓몬스터 테이블 생성
create table pocket_monster(
no number(3), --숫자 3(number - 자리)
name varchar2(21), --한글 7글자 (varchar - byte)
type varchar2(9) --한글 3글자 (varchar - byte)
);

--테이블 삭제
drop table pocket_monster;

--테이블 변경
alter table pocket_monster modify(type varchar2(12));

