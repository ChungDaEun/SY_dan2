CREATE TABLE MEMBER02(
   id varchar2(50),
   pass varchar2(50),
   name varchar2(50),
   point NUMBER,
   auth varchar2(50),
   regdate date
);

INSERT INTO MEMBER02 values('himan','7777','홍길동',1000,'관리자',sysdate);

SELECT * FROM member02;

ALTER TABLE CODE
ADD val varchar2(100);

SELECT * FROM code;
INSERT INTO code values(code_seq.nextval,'부서','',0,1);
INSERT INTO code values(code_seq.nextval,'인사','1006',1,10);
INSERT INTO code values(code_seq.nextval,'재무','1006',2,20);
INSERT INTO code values(code_seq.nextval,'회계','1006',3,30);
INSERT INTO code values(code_seq.nextval,'IT산업','1006',4,40);

INSERT INTO code values(code_seq.nextval,'기획','1006',5,50)

SELECT * FROM emp;

SELECT * FROM dept;