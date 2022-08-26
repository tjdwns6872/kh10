create table music(
    music_no number primary key,
    music_title varchar2(90) not null 
    check(regexp_like(music_title, '^[가-힣]{1,30}$')),
    music_artist varchar2(90) not null
    check(regexp_like(music_artist, '^[가-힣]{1,30}$')),
    music_album varchar2(90) not null
    check(regexp_like(music_album, '^[가-힣]{1,30}$')),
    music_play number default 0 not null check (music_play >= 0),
    release_time date not null
); 

create sequence music_seq;

데이터베이스 테이블 생성