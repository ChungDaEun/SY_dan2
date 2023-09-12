SELECT e.*, dname, loc 
FROM EMP e, DEPT d
WHERE e.deptno = d.DEPTNO
AND ENAME LIKE '%'||'S'||'%'
AND DNAME LIKE '%'||'SAL'||'%';

SELECT e.*, job_title, min_salary, max_salary
FROM EMPLOYEES e, JOBS j
WHERE e.JOB_ID = j.JOB_ID
AND first_name LIKE '%'||''||'%'
AND job_title LIKE '%'||''||'%';

SELECT count(*)
FROM EMP
WHERE sal BETWEEN 1000 AND 4000;


SELECT * FROM emp
WHERE 1=1
AND ENAME LIKE 'ALLEN';

			
SELECT * FROM EMP
WHERE empno IN 7654;