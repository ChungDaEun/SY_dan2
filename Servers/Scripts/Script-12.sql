/*

*/
-- ex) 조인 구문을 이요하여 부서명, 사원명, 부서위치, 급여를 출력하세요.
SELECT dname, ename, loc, sal
FROM emp e, dept d
WHERE e.DEPTNO = d.DEPTNO;

-- ex1) 조언을 이용하여 부서위치와 사원명을 검색하세요.