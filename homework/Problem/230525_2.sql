--1. `EMP` 테이블에서 `SAL`이 2000 이상인 직원의 `ENAME`와 `SAL`을 출력하세요.
SELECT ename, sal FROM emp 
WHERE sal >= 2000;

--2. `EMP` 테이블에서 `HIREDATE`가 1981년에 해당하는 직원의 `ENAME`와 `HIREDATE`를 출력하세요.
SELECT ename, hiredate FROM emp
WHERE HIREDATE LIKE '%81%';

--3. 현재일짜 날짜로부터 100일 후의 날짜를 'YYYY-MM-DD' 형식으로 출력하세요.
SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD'), TO_CHAR(SYSDATE + 100,'YYYY-MM-DD') FROM dual;

--4. `EMP` 테이블에서 `ENAME`이 'SMITH'인 직원의 입사일(`HIREDATE`)을 'YYYY년 MM월 DD일' 형식으로 출력하세요.
SELECT ename, to_char(hiredate, 'YYYY"년 " MM"월 " DD"일"') "입사일" FROM EMP
WHERE ename ='SMITH';

--5. `EMP` 테이블에서 `SAL`이 3000 이상인 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'YYYY년 Q분기' 형식으로 출력하세요.
SELECT ename, sal, to_char(hiredate,'YYYY"년 " Q "분기"') "입사일" FROM emp 
WHERE sal >= 3000;

--6. `EMP` 테이블에서 모든 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'YY년 MM월 DD일에 Q/4분기' 형식으로 출력하세요.
SELECT ename, sal, TO_CHAR(hiredate,'YY"년 "MM"월 "DD"일에 "Q"/4분기"') "입사일" FROM emp; 

--7. `EMP` 테이블에서 `ENAME`이 'ALLEN'인 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'HH24시 MI분 SS초' 형식으로 출력하세요.
SELECT ename, sal, TO_CHAR(hiredate, 'HH24"시 "MI"분 "SS"초"') "입사일" FROM emp 
WHERE ename = 'ALLEN';

--8. `EMP` 테이블에서 `ENAME`이 'KING'인 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'DD일 DAY YYYY년 Q/4분기' 형식으로 출력하세요.
SELECT ename, sal, TO_CHAR(hiredate, 'DD"일 DAY "YYYY"년 "Q"/4분기"') "입사일" FROM EMP
WHERE ename = 'KING';

--9. 현재 시간을 'HH24시 MI분 SS초' 형식으로 출력하세요.
SELECT TO_CHAR(SYSDATE, 'HH24"시 "MI"분 "SS"초"') "현재시간" FROM dual; 

--10. `EMP` 테이블에서 모든 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'YYYY년 MM월 DD일 A.M./P.M.' 형식으로 출력하세요
SELECT ename, sal, TO_CHAR(hiredate, 'YYYY"년 "MM"월 "DD"일 "A.M./P.M.') "입사일" FROM emp;
