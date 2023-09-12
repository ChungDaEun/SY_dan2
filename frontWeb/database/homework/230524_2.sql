--1. 'MANAGER' 직책을 검색하되, 해당 직책이 포함된 사원의 이름, 직책, 검색 위치를 출력하세요.
SELECT ename, job, instr(job, 'MANAGER') "검색위치"
FROM emp
WHERE job = 'MANAGER';

--2. 'SALESMAN' 직책을 검색하되, 해당 직책이 포함된 사원의 이름, 직책, 검색 위치를 출력하세요.
SELECT ename, job, instr(job, 'SALESMAN') "검색위치"
FROM emp
WHERE job = 'SALESMAN';

--3. 사원명을 10자리로 맞추고, 왼쪽에 '#'를 추가하여 출력하세요.
SELECT ename, LPAD(ename,10,'#') "#추가" 
FROM emp;

--4. 직책을 10자리로 맞추고, 오른쪽에 '@'를 추가하여 출력하세요.
SELECT job, RPAD(job,10,'@')"@추가" 
FROM emp;

--5. ' Hello' 문자열에서 왼쪽에 있는 공백을 제거하여 출력하세요.
SELECT LTRIM(' Hello',' ') "삭제"
FROM dual;

--6. 'Java Programming ' 문자열에서 오른쪽에 있는 공백을 제거하여 출력하세요.
SELECT RTRIM('Java Programming ',' ') "삭제"
FROM dual;

--7. ' Hello World ' 문자열에서 양쪽에 있는 공백을 제거하여 출력하세요.
SELECT RTRIM(LTRIM(' Hello World ',' '),' ') "삭제"
FROM dual;

--8. 'SALESMAN' 직책에서 'ALE'을 추출하여 출력하세요.
/*
'SALESMAN' : instr(job, 'ALE') ALE의 시작 위치인 2가 나온다.
substr(job,instr(job,'ALE')+3)
	instr(job,'ALE')인 2부터 'ALE'의 문자의 갯수3이후의 문자만 나온다.
	
 */
SELECT ename, job, SUBSTR(job,2,3) "추출"
FROM emp
WHERE job = 'SALESMAN';
