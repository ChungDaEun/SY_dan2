/*
# check
1. 특정 컬럼에 조건이나 범위를 지정해서 해당 범위에 데이터만 입력되도록 처리하는 것을 말한다.
2. 형식
   컬럼명 데이테유형 constraint 제약명 check(조건데이터-where문 하위
   컬럼명 데이터유형 check(제약조건 내용)
   
*/
CREATE TABLE student06(
	gender varchar2(1) CONSTRAINT student05_gender_ck CHECK(gender IN('F','M'))
);

INSERT INTO student06 values('F');
INSERT INTO student06 values('M');
--INSERT INTO student06 values('남');
--INSERT INTO student06 values('여');
INSERT INTO student06 values('F');
INSERT INTO student06 values(null);
INSERT INTO student06 values('F');
SELECT * FROM student06;

-- student07 테이블을 생성해서
-- sno(프라이머리 키), 이름, 성별(남/여)
-- 국어(0~100),영어(0~100),수학(0~100)
-- 한글-3byte

CREATE TABLE student07(
	sno NUMBER PRIMARY KEY,
	name varchar2(30),
	gender char(3) CONSTRAINT student07_gender_ck CHECK(gender IN('남','여')),
	kor number(3) check(kor BETWEEN 1 AND 100),
	eng number(3) check(eng BETWEEN 1 AND 100),
	math number(3) check(math BETWEEN 1 AND 100)
);

INSERT INTO STUDENT07 values(1001, '홍길동','남',100,80,90);
INSERT INTO STUDENT07 values(1002, '김길동','여',80,90,100);
--INSERT INTO STUDENT07 values(1003, '마길동','MAN',90,80,100);
INSERT INTO STUDENT07 values(1004, '오길동',null,100,90,10);
INSERT INTO STUDENT07 values(1005, '하길동',null,90,80,90);
--INSERT INTO STUDENT07 values(1006, '하길동',null,120,90,90);
SELECT * FROM student07;

/*
# 외래키 설정 관계(foreign key)
1. 연관 관계 있는 두 테이블에 대해 한쪽 테이블에 있는 데이터 기준으로 다른 테이블의 데이터를 입력할 수 있게 하는 것을 말한다.
2. 기본형식
   컬럼명 데이터유형 constraint 테이블명_컬럼명_fk
   		references 대상테이블명(컬럼명)
*/