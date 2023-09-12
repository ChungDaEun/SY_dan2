SELECT DISTINCT job FROM emp ORDER BY job;
SELECT DISTINCT m.empno, m.ename, m.job
FROM emp e, emp m
WHERE e.mgr = m.EMPNO
ORDER BY m.ename;
SELECT * FROM dept;