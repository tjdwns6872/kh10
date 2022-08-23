-- 기본키(primary key)
-- 테이블을 대표하는 항목
-- not null + unique 항목 중에서만 설정 가능
-- 테이블 당 하나만 존재

create table player(
player_id varchar2(30) primary key,
player_job varchar2(12) not null,
player_level number default 1 not null check(player_level >= 0)
);

insert into player(player_id, player_job, player_level)
values(null, '엘프', 1);

insert into player(player_id, player_job, player_level)
values(1, '엘프', 1);

-- 학생 테이블
create table exam(
year number,
room number,
no number,
name varchar2(21) not null,
--year+room+no로 대표항목 설정
primary key(year, room, no) 
);

drop table exam;

insert into exam(year, room, no, name)
values(null,null,null,'테스트');

insert into exam(year, room, no, name)
values(1,1,1,'피카츄');

insert into exam(year, room, no, name)
values(1,1,2,'라이츄');

insert into exam(year, room, no, name)
values(1,1,1,'피카츄');
