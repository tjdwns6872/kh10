# 데이터베이스 예제 파일 모음
# 데이터베이스 수업

- 데이터베이스 - 정보가 저장되는 저장소
- DBMS - 데이터베이스에 계정, 객체, 보안 등 다양한 환경을 추가한 프로그램(ex : oracle)

# 개념 정리

DBMS는 SQL 명령을 이용하여 실행 지시를 내릴 수 있다.

## DBMS 객체

데이터 제어를 위해 DBMS에서 제공하는 도구

- 사용자(USER) - 데이터를 소유하는 소유자
- 테이블(TABLE) - 데이터가 실제로 저장되는 장소
- 시퀀스(SEQUENCE) - 번호를 생성하는 생성기
- 뷰(View)
- 인덱스(Index)

## DDL(Data Definition Language)

객체를 생성, 변경, 제거하기 위한 구문

DDL은 Commit과 Rollback의 영향을 받지 않는다

- CREATE - 생성
- ALTER - 변경
- DROP - 삭제
- TRUNCATE - 자르기 명령

## DML(Data Manipulation Language)

데이터를 조작하는 구문

Commit과 Rollback이 가능하다(트랜잭션 관리가 이루어진다)

- insert into - 추가
- select - 조회
- update - 수정
- delete - 삭제

## DCL(Data Control Language)

데이터를 통제하기 위한 구문

권한, 저장 키워드

- 사용자 관리
  - grant - 권한 부여
  - revoke - 권한 회수
- 트랜잭션 관리
  - commit - 트랜잭션 저장
  - rollback - 트랜잭션 무효화(취소)

# 테이블 제약조건

테이블에 원하는 데이터만 들어가도록 설정하는 조건

- primary key - 테이블을 대표하는 컬럼(not null + unique 포함)
- not null - 비어있는 값을 허용하지 않는 조건
- unique - 중복되는 값을 허용하지 않는 조건
- check - 원치 않는 값을 허용하지 않는 조건
- default - 미입력 항목에 대한 처리 조건
