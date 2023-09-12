/* 
code(키, 값, 상위키, 정렬순위)
1000  과일   0
1001  사과   1000   1
1002  바나나  1000   2
1003  딸기   1000   3
1004  오렌지  1000   4
select *
from code
where 상위키 = 1000;
order 정렬순위
*/
CREATE TABLE code(
	NO NUMBER(4) PRIMARY KEY,
	title varchar2(100),
	refno number(4),
	ordno NUMBER(2)
);
SELECT * FROM code;
INSERT INTO code VALUES (code_seq.nextval, '과일',0,1);
INSERT INTO code VALUES (code_seq.nextval, '사과',1001,1);
INSERT INTO code VALUES (code_seq.nextval, '바나나',1001,2);
INSERT INTO code VALUES (code_seq.nextval, '딸기',1001,3);
INSERT INTO code VALUES (code_seq.nextval, '오렌지',1001,4);
CREATE SEQUENCE code_seq START WITH 1000;
SELECT code_seq.nextval FROM dual;

INSERT INTO code VALUES (1013, '총무',1006,6,70);

SELECT NO, title, refno, ordno
FROM CODE
WHERE title LIKE '%%'
ORDER BY refno, ordno;

SELECT * FROM code 
WHERE title LIKE '%%'
START WITH refno = 0
CONNECT BY PRIOR NO = refno;
/*
SELECT * FROM code 
WHERE title LIKE ?
START WITH refno = ?
CONNECT BY PRIOR NO = refno
*/

/*
private int no;
private String title;
private int refno;
private int ordno;
*/