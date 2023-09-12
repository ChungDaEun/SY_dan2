/*
# 테이블 구조 변경
1. 테이블을 사용하다보면 여러가지 상황에 의해 테이블의 구조를 변경하는 경우가 발생한다.
   테이블의 구조를 변경하는데 필요한 명령어를 파악하고
   테이블 구조 변경시 발생하는 데이터 처리에 대한 내용을 파알해보자
   - 컬럼명 변경, 컬러믜 추가, 컬럼의 삭제, 컬럼의 속성변경, 제약조건 추가/변경
2. 기본형식
   - 테이블의 구조 전체 삭제
     drop table 테이블명;
     ps) 대부분의 oracle의 내장객체는 drop 객체유형 객체명; 형태로 구조 자체를 데이터와 함계삭제 처리할 수 있다.
   - alter table 테이블명
     옵션1 컬럼명 데이터유형
*/
DROP TABLE student14;
DROP SEQUENCE seq01;
SELECT * FROM STUDENT01;
ALTER TABLE STUDENT01
ADD sno NUMBER;