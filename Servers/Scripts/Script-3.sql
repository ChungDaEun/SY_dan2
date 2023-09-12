SELECT *
FROM emp02;
WHERE ename LIKE '%'||'B'||'%';
-- 1. 입력값에 따라서 검색되는 데이터가 다른 처리
-- 2. 매개변수 : 사원명(ename)

SELECT * FROM EMP02
WHERE ENAME LIKE '%'||'A'||'%';

SELECT * FROM DEPT01 d 
WHERE dname LIKE '%'||'S'||'%';

-- 입력값 1, 사용할 값이 1개
SELECT sal
FROM EMP02
WHERE empno = 7499;

-- 해당 부서의 사원수
SELECT count(*) cnt -- 그룹함수로 데이터의 건수
FROM EMP02
WHERE DEPTNO = 10;

SELECT *
FROM EMP02
WHERE empno = 7499;

SELECT *
FROM DEPT01
WHERE DEPTNO = 10;

SELECT *
FROM JOBS
WHERE JOB_ID = 'AD_PRES';

SELECT *
FROM LOCATIONS
WHERE STREET_ADDRESS LIKE '%'||'u'||'%'
AND CITY LIKE '%'||'o'||'%';

SELECT *
FROM EMPLOYEES 
WHERE FIRST_NAME || LAST_NAME LIKE '%'||'A'||'%'
AND SALARY BETWEEN 0 AND 12000;

SELECT *
FROM EMPLOYEES 
WHERE FIRST_NAME || LAST_NAME LIKE '%'||?||'%'
AND SALARY BETWEEN ? AND ?

--class Employee{
--	private int employee_id;
--	private String first_name;
--	private String last_name;
--	private String email;
--	private String phone_number;
--	private DATE hire_date;
--	private String job_id;
--	private double salary;
--	private double commission_pct;
--	private int manager_id;
--	private int department_id;
--}

-- sql을 map과 함께 처리해보세요
SELECT * FROM JOB_HISTORY 
WHERE JOB_ID LIKE '%'||'A'||'%'
AND DEPARTMENT_ID BETWEEN 10 AND 120;
/*
class Job_history{
	private int employee_id;
	private DATE start_date;
    private DATE end_date;
   	private String job_id;
    pirvate int department_id;
}*/

SELECT *
FROM JOBS
WHERE JOB_TITLE LIKE '%'||'A'||'%'
AND  MIN_SALARY BETWEEN 1000 AND 10000; 

SELECT * FROM emp02;    
-- sysdate : 현재 날짜/시간
-- 전체 컬럼 데이터 입력
INSERT INTO EMP02 values(1000,'홍길동','사원', 7902, sysdate, 4000,1000,10);
-- 특정 컬럼데이터 입력
-- 테이블명(입력할 컬럼 순서대로 나열)
-- 날짜로 변호('입력할 문자열','입력할 문자열의 형식')
SELECT TO_DATE('2020-01-01','YYYY-MM-DD') FROM dual; 

INSERT INTO emp02(empno, ename, hiredate, sal)
	values(1002,'마길동',to_date('2020-01-01','YYYY-MM-DD'),3500);

SELECT * FROM emp02 ORDER BY empno asc; 

-- ex1) 1003 사원번호로 전체 데이터 입력
INSERT INTO EMP02 VALUES(1003,'하기동','대리',7901,to_date('2023-05-01','YYYY-MM-DD'),4500,1000,20); 
-- ex2) 1004 2023-06-01, 오길동을 입력하세요.
INSERT INTO emp02(empno, HIREDATE, ENAME)
	values(1004,to_date('2023-06-01','YYYY-MM-DD'),'오길동');
SELECT * FROM EMP02;

/*
INSERT INTO EMP02 VALUES(1003,'하기동','대리',7901,to_date('2023-05-01','YYYY-MM-DD'),4500,1000,20); 

INSERT INTO EMP02 VALUES(?,?,?,?,to_date('?','YYYY-MM-DD'),?,?,?); 
입력 VO/Map/배열
Class Emp //입력할 VO
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredateS; // 추가 처리해서
	private double sal;
	private double comm;
	private int deptno;
*/

SELECT * FROM emp02 ORDER BY empno;  
SELECT * FROM DEPARTMENTS; 

CREATE TABLE DEPARTMENTS10
AS SELECT * FROM DEPARTMENTS;
SELECT * FROM DEPARTMENTS10;
-- DEPARTMENTS10를 입력처리하세요.
-- INSERT INTO DEPARTMENTS10 VALUES (1,"표지훈","31","1700")

/*
# 수정 처리 구문
*/
SELECT * FROM emp02;
UPDATE EMP02 
	SET ENAME = '마길동(upt)',
		job = '사원',
		sal = 4000,
		HIREDATE = TO_DATE('2023/05/01','YYYY/MM/DD') 
	WHERE empno = 7369; 
/*
수정할 생성자만 추가
UPDATE EMP02 
	SET ENAME = ?,
		job = ?,
		sal = ?,
		HIREDATE = TO_DATE(?,'YYYY/MM/DD') 
	WHERE empno = ?
 */

CREATE TABLE LOCATIONS10
AS SELECT * FROM LOCATIONS;

SELECT * FROM LOCATIONS10;
UPDATE LOCATIONS10
	SET street_address = '종로 1가',
		postal_code = '343122',
		city = '서울',
		state_province = '서울',
		country_id = 'SE'
	WHERE location_id = 1000;
-- ex) 항목 중에 INSERT 내용 복사해서 update 처리하세요.
INSERT INTO LOCATIONS10 VALUES(1010,'역삼','A056','서울','서울','SE'); 



/*
UPDATE LOCATIONS10
	SET street_address = ?,
		postal_code = ?,
		city = ?,
		state_province = ?,
		country_id = ?
	WHERE location_id = ?;
 */
	