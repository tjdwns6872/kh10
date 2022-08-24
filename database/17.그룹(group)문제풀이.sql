create table exam(
exam_id number primary key,
student varchar2(21) not null,
subject varchar2(33) not null,
type varchar2(24) not null,
score number(3) default 0 not null check(score between 0 and 100)
);

create sequence exam_seq;

--피카츄
insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '피카츄', '프로그래밍언어', '서술형', 55);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '피카츄', '프로그래밍언어', '문제해결시나리오', 95);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '피카츄', '네트워크프로그래밍구현', '서술형', 60);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '피카츄', '네트워크프로그래밍구현', '평가자체크리스트', 51);

--라이츄
insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '라이츄', '프로그래밍언어', '서술형', 80);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '라이츄', '프로그래밍언어', '문제해결시나리오',52);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '라이츄', '네트워크프로그래밍구현', '서술형', 58);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '라이츄', '네트워크프로그래밍구현', '평가자체크리스트', 80);

--파이리
insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '파이리', '프로그래밍언어', '서술형', 54);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '파이리', '프로그래밍언어', '문제해결시나리오',81);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '파이리', '네트워크프로그래밍구현', '서술형', 44);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '파이리', '네트워크프로그래밍구현', '평가자체크리스트', 76);

--꼬부기
insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '꼬부기', '프로그래밍언어', '서술형', 100);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '꼬부기', '프로그래밍언어', '문제해결시나리오',60);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '꼬부기', '네트워크프로그래밍구현', '서술형', 51);

insert into exam (exam_id, student, subject, type, score)
values(exam_seq.nextval, '꼬부기', '네트워크프로그래밍구현', '평가자체크리스트', 72);

commit;

-- 학생별 평균 점수
select student, avg(score) "학생평균"
from exam group by student
order by 학생평균 asc;

--과목별 평균 점수
select subject, avg(score) "과목평균"
from exam group by subject
order by 과목평균 asc;

--평가유형별 평균 점수
select type, avg(score) "평가유형평균"
from exam group by type
order by 평가유형평균 asc;

--학생별 최고, 최저점
select student, 
    max(score) "최고점",
    min(score) "최소점"
from exam group by student order by student asc;

--과목별 최고, 최저점
select subject,
    max(score) "최고점",
    min(score) "최소점"
from exam group by subject order by subject asc;

--유형별 최고, 최저점
select type,
    max(score) "최고점",
    min(score) "최소점"
from exam group by type order by type asc;

--과목별 평균 60점 미만 학생의 수
select subject, count(*) 인원수 from (
    select * from exam where score < 60
)
group by subject;

-- 과목별 평균 90점 이상의 학생의 수
select subject, count(*) 인원수 from (
    select * from exam where score >= 90
)
group by subject;

--평균이 높은 학생을 3등까지만 출력
select * from(
    select TMP.*, rownum rn from(
       select student, avg(score) 평균 from exam
       group by student order by 평균 desc
    )TMP
) where rn between 1 and 3;

