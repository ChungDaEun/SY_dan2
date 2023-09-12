SELECT * FROM member02;

CREATE TABLE MEMBER01(
	id varchar(50),
	pass varchar(50),
	name varchar(50),
	auth varchar(50),
	point number
);

INSERT INTO member01 values('himan','7777','홍길동','관리자',100);
INSERT INTO member01 values('higirl','8888','마길동','회원',200);
INSERT INTO member01 values('hello','9999','김길동','회원',300);
INSERT INTO member01 values('apple','0000','신길동','관리자',500);

SELECT * FROM member01;

SELECT * FROM emp;
SELECT * FROM emp
WHERE job IN ('SALESMAN','MANAGER');