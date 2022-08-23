 --게시판(board) 테이블에서 한 페이지당 5개씩 보여준다고 가정했을 때
 -- 1페이지와 2페이지를 조회하는 구문을 각각 작성
 
select * from(
    select TMP.*, rownum rn from(
       select * from board order by board_no asc
    )TMP
) where rn between 1 and 5;

select * from(
    select TMP.*, rownum rn from(
       select * from board order by board_no asc
    )TMP
) where rn between 6 and 10;
