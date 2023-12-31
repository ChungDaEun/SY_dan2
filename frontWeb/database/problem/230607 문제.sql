/*
문제:

1. `nvl` 함수는 어떤 데이터 처리에 효과적으로 사용될 수 있습니까?
    a) Null값일 때의 에러 처리#
    b) String 데이터의 변환
    c) 데이터의 정렬
    d) 데이터베이스 연결 관리
    DB에서 null을 처리해주지 않으면, 실제 화면에서도
    null이라고 문자열의 경우 표시된다.
    null ==> "", null ==> 0 default 처리.
    nvl(컬럼,null일때)
    

2. `nvl2` 함수는 어떤 경우에 유용하게 사용될 수 있습니까?
    a) Null값이 아닐 때와 Null일 때를 구분하여 처리할 경우#
    b) 데이터 정렬에 필요한 경우
    c) 데이터 타입을 변환할 경우
    d) 데이터를 저장할 경우
    nvl2(컬럼,null이 아닐때, null일때)

3. `nullif` 함수는 무엇을 반환하나요?
    a) 두 데이터가 동일하면 첫 번째 데이터를 반환
    b) 두 데이터가 동일하면 null을 반환 #
    c) 두 데이터가 동일하지 않으면 null을 반환
    d) 두 데이터가 동일하지 않으면 첫 번째 데이터를 반환 #
    nullif(데이터1,데이터2)
    동일할 때는 null
    동일하지 않을 때는 데이터1

4. `decode` 함수는 어떤 언어의 어떤 기능과 비슷한가요?
    a) Python의 for loop
    b) Java의 switch-case 문 #
    c) JavaScript의 forEach 함수
    d) C++의 while loop
    decode(컬럼/데이터, case1, case1경우데이터
                     case2, case2경우데이터
                     case3, case3경우데이터
                     그외 경우 )
5. `case` 함수는 무엇을 확장한 형태인가요?
    a) nvl 함수
    b) nullif 함수
    c) decode 함수#
    d) extract 함수
    case1
       case 
           when 조건1 then 처리데이터
           when 조건2 then 처리데이터
           when 조건3 then 처리데이터
           else 조건이외 처리데이터
    case2
       case 컬럼|데이터
           when 케이스1 then 처리데이터
           when 케이스2 then 처리데이터
           when 케이스3 then 처리데이터
           else 위 케이스 이외 처리데이터

6. `sign` 함수는 어떤 값을 반환하나요?
    a) 양수인 경우 1, 음수인 경우 -1, 0인 경우 0 #
    b) 양수인 경우 1, 음수인 경우 0
    c) 양수인 경우 0, 음수인 경우 -1
    d) 양수인 경우 0, 음수인 경우 1
    sign은 decode함수와 함께 중첩함수로 case에서
    범위를 지정하지 못하는 부분에 대하여 보완을 할 때
    사용된다. 
    소숫점 이하가 나오더라도 양수인 경우 1
    소숫점 이하가 나오더라도 음수인 경우 -1
    0인경우 0
    

7. `extract` 함수는 어떤 데이터로부터 무엇을 추출하나요?
    a) 날짜 데이터로부터 연도, 월, 일을 추출 #
    b) 문자열 데이터로부터 특정 문자를 추출
    c) 숫자 데이터로부터 소수점을 추출
    d) 배열 데이터로부터 특정 요소를 추출
    tochar(날짜,'형식') : 문자열 데이터 연산처리가 
    	필요할 때는 형변환이나 자동변환을 활용
    extract(형식 from 컬럼명) : 숫자형 데이터 처리
    	YYYY, MONTH, DAY	
    

8. `decode` 함수와 `sign` 함수를 함께 사용하면 어떤 효과가 있나요?
    a) 데이터 정렬에 유용하다
    b) 여러 조건에 따라 데이터를 다르게 처리할 수 있다 #
    c) 데이터 타입을 변환할 수 있다
    d) 데이터베이스 연결을 관리할 수 있다   
    decode의 한계점이 정확한 case에 대한 처리는,
    boolean형식으로 범위를 지정해서 처리할 때, 
    sign() 중첩하면 효과적을 처리할 수 있다.
9. case 함수는 어떤 연산을 통해 비교가 가능하게 해주는가?
	a) 산술 연산만 가능
	b) 관계 연산만 가능
	c) 논리 연산만 가능
	d) 산술, 관계, 논리 연산 모두 가능 #
       비교를 처리해주는 연산식에 사용하는 연산자 사용이
       모두 가능하다. 산출, 관계, 논리연산
       
10. sign 함수는 어떤 값을 반환하는가?
	a) n < 0 : -1, n = 0 : 0, n > 0 : 0
	b) n < 0 : 0, n = 0 : 1, n > 0 : 1
	c) n < 0 : -1, n = 0 : 0, n > 0 : 1 #
	d) n < 0 : -1, n = 0 : -1, n > 0 : 1
  
1. a) Null값일 때의 에러 처리
2. a) Null값이 아닐 때와 Null일 때를 구분하여 처리할 경우
3. b) 두 데이터가 동일하면 null을 반환
4. b) Java의 switch-case 문
5. c) decode 함수
6. a) 양수인 경우 1, 음수인 경우 -1, 0인 경우 0
7. a) 날짜 데이터로부터 연도, 월, 일을 추출
8. b) 여러 조건에 따라 데이터를 다르게 처리할 수 있다
9. d) 산술, 관계, 논리 연산 모두 가능
10. c) n < 0 : -1, n = 0 : 0, n > 0 : 1


문제 1: `nvl()` 함수를 사용해 모든 직원의 이름과 보너스를 출력하되, 보너스가 NULL인 경우에는 0을 출력하는 SQL문을 작성해보세요.

```sql
SELECT ename, nvl(comm, 0) as bonus FROM emp;
```

문제 2: `nvl2()` 함수를 사용해, 
각 직원의 급여(sal)에 대해 보너스(comm)가 있는 경우 10% 증가한 금액을,
 보너스가 없는 경우 그대로의 금액을 출력하는 SQL문을 작성해보세요.

```sql
SELECT ename, sal, nvl2(comm, sal*1.1, sal) 
	as adjusted_sal FROM emp;
```

문제 3: `nullif()` 함수를 사용해 직원들의 hiredate가
 sysdate와 같은 경우 NULL을 반환하고, 
 그렇지 않은 경우 hiredate를 반환하는 SQL문을 작성해보세요.

```sql
SELECT ename, nullif(hiredate, sysdate) as hire_date 
FROM emp;
```

문제 4: `decode()` 함수를 사용하여 직원들의 job이 
'MANAGER'인 경우 '관리자', 그렇지 않은 경우 '비관리자'를
 반환하는 SQL문을 작성해보세요.

```sql
SELECT ename, decode(job, 'MANAGER', '관리자', '비관리자') as job_status FROM emp;
```

문제 5: `CASE WHEN` 문을 사용하여 직원들의 급여(sal)가
 2000 이상인 경우 '고임금', 그렇지 않은 경우 '저임금'을 반환하는 SQL문을 작성해보세요.

```sql
SELECT ename, 
       CASE WHEN sal >= 2000 THEN '고임금' 
            ELSE '저임금' 
       END as salary_level 
FROM emp;
```

문제 1:
사원들의 보너스를 계산하려 합니다. 보너스는 comm 값에 10%를 더한 값입니다. 만약 comm이 null인 경우에는 sal의 20%로 보너스를 설정하고, 이 보너스의 합산 금액을 출력하시오.
(문제에서는 nvl 함수를 활용해야 합니다.)

문제 2:
각 사원의 보너스를 계산하되, 만약 comm 값이 null이면 sal의 15%로, null이 아니라면 comm 값에 sal의 5%를 더하여 보너스를 계산하려 합니다. 10단위로 절삭한 보너스 금액을 출력하시오.
(문제에서는 nvl2 함수를 활용해야 합니다.)

문제 3:
모든 사원의 보너스를 계산하려 합니다. 만약 comm이 0인 경우에는 null을 반환하고, 그렇지 않으면 comm을 그대로 출력하시오. 각 사원의 사원명, 급여, 보너스를 출력하시오.
(문제에서는 nullif 함수를 활용해야 합니다.)

문제 4:
각 사원에 대한 급여 등급을 부여하려 합니다. 5000 이상의 급여를 받는 사원은 'A' 등급, 3000 ~ 4999는 'B' 등급, 2000 ~ 2999는 'C' 등급, 그 외는 'D' 등급을 부여하려 합니다. 각 사원의 이름과 급여 등급을 출력하시오.
(문제에서는 CASE WHEN 구문을 활용해야 합니다.)

문제 5:
사원들의 입사일이 2023년 이후인지 여부를 확인하려 합니다. 2023년 이후에 입사한 사원의 경우 'Y', 그렇지 않은 경우 'N'으로 출력하시오.
(문제에서는 extract와 decode 함수를 활용해야 합니다.)

---
정답 1:
```sql
SELECT ename, sal, comm, sal + NVL(comm, sal*0.2) as "Total" FROM emp;
```
정답 2:
```sql
SELECT ename, sal, comm, TRUNC(NVL2(comm, comm + sal*0.05, sal*0.15), -1) as "Bonus" FROM emp;
```
정답 3:
```sql
SELECT ename, sal, NULLIF(comm, 0) as "Bonus" FROM emp;
```
정답 4:
```sql
SELECT ename, sal,
    CASE 
        WHEN sal >= 5000 THEN 'A'
        WHEN sal BETWEEN 3000 AND 4999 THEN 'B'
        WHEN sal BETWEEN 2000 AND 2999 THEN 'C'
        ELSE 'D'
    END as "Grade"
FROM emp;
```
정답 5:
```sql
SELECT ename, hire

date, DECODE(SIGN(EXTRACT(YEAR FROM hiredate) - 2023), 1, 'Y', 'N') as "After 2023" FROM emp;
```
1. nvl 함수
    - 문제: EMP 테이블에서 각 사원의 이름, 월급, 커미션을 조회하고, 커미션이 NULL인 경우 0을 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, SAL, NVL(COMM, 0) AS COMM
    FROM EMP;
    ```
   
2. nvl2 함수
    - 문제: 각 사원의 이름과 커미션을 조회하되, 커미션이 NULL이면 급여의 10%를, NULL이 아니면 커미션에 10%를 더한 값을 보너스로 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, NVL2(COMM, COMM*1.1, SAL*0.1) AS BONUS
    FROM EMP;
    ```
   
3. nullif 함수
    - 문제: EMP 테이블에서 각 사원의 이름, 커미션을 조회하되, 커미션이 급여와 같다면 NULL을 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, NULLIF(COMM, SAL) AS COMM
    FROM EMP;
    ```
   
4. decode 함수
    - 문제: EMP 테이블에서 각 사원의 이름, 직무를 조회하되, 직무가 'MANAGER'라면 '관리자', 'ANALYST'라면 '분석가', 그 외는 '기타'로 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, DECODE(JOB, 'MANAGER', '관리자', 'ANALYST', '분석가', '기타') AS JOB_TITLE
    FROM EMP;
    ```
   
5. CASE WHEN 함수
    - 문제: EMP 테이블에서 각 사원의 이름, 월급을 조회하되, 월급이 3000 이상이면 '높음', 2000 이상 3000 미만이면 '중간', 2000 미만이면 '낮음'으로 급여 등급을 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, SAL,
           CASE WHEN SAL >= 3000 THEN '높음'
                WHEN SAL >= 2000 THEN '중간'
                ELSE '낮음'
           END AS SAL_GRADE
    FROM EMP;
    ```
   
6. sign 함수
    - 문제: EMP 테이블에서 각 사원의 이름, 월급을 조회하되, 월급이 평균 월급보

다 높다면 1, 평균과 같다면 0, 평균보다 낮다면 -1을 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, SAL, SIGN(SAL - (SELECT AVG(SAL) FROM EMP)) AS SAL_SIGN
    FROM EMP;
    ```
   
7. extract 함수 (문제를 위해 TO_DATE 함수도 함께 사용됨)
    - 문제: EMP 테이블에서 각 사원의 이름, 입사일을 조회하되, 입사 월을 별도로 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, HIREDATE, EXTRACT(MONTH FROM HIREDATE) AS HIRE_MONTH
    FROM EMP;
    ```

8. nvl, decode 함께 사용
    - 문제: EMP 테이블에서 각 사원의 이름, 직무, 커미션을 조회하되, 커미션이 NULL이면 'N/A', 그렇지 않고 직무가 'MANAGER'라면 'MGR', 'ANALYST'라면 'ANL', 그 외는 'OTH'로 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, JOB, DECODE(NVL(COMM, 'N/A'), 'N/A', 'N/A', 'MANAGER', 'MGR', 'ANALYST', 'ANL', 'OTH') AS COMM_DESC
    FROM EMP;
    ```

9. nvl, CASE WHEN 함께 사용
    - 문제: EMP 테이블에서 각 사원의 이름, 월급, 커미션을 조회하되, 커미션이 NULL이면 월급의 10%를, NULL이 아니면 월급과 커미션의 합계를 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, SAL, CASE WHEN NVL(COMM, 'N/A') = 'N/A' THEN SAL*0.1 ELSE SAL+COMM END AS TOTAL_PAY
    FROM EMP;
    ```

10. nvl2, decode 함께 사용
    - 문제: EMP 테이블에서 각 사원의 이름, 직무, 커미션을 조회하되, 커미션이 NULL이면 'N/A', 그렇지 않고 직무가 'MANAGER'라면 커미션의 10%를, 'ANALYST'라면 커미션의 20%를, 그 외는 커미션의 30%를 출력하시오.
    - 정답: 
    ```
    SELECT ENAME, JOB, NVL2(COMM, DECODE(JOB, 'MANAGER', COMM*0.1, 'ANALYST', COMM*0.2, COMM*0.3), 'N/A') AS BONUS
    FROM EMP;
    ```


*/

/*
--1. Group 함수 연습 예제:
--   1.1 직업별로 평균 급여를 계산하시오.
--   1.2 각 부서별로 가장 높은 급여를 받는 사람을 찾으시오.
--
--2. Subquery 연습 예제:
--   2.1 급여가 평균 급여보다 많이 받는 사원들의 이름과 급여를 찾으시오.
--   2.2 Smith의 급여보다 많은 급여를 받는 사원들의 이름과 급여를 찾으시오.
--
--3. Outer Join 연습 예제:
--   3.1 사원들의 이름과 부서 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
--   3.2 각 부서별로 최대 급여를 받는 사원의 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
--
--4. Group 함수와 Subquery를 조합한 연습 예제:
--   4.1 각 직업별로 최대 급여를 받는 사원의 이름을 가져오시오.
--   4.2 각 부서별로 최소 급여를 받는 사원의 이름을 가져오시오.
--   
--   
--1. Group 함수 연습 예제:
--   1.1 직업별로 평균 급여를 계산하시오.
--   ```
   SELECT job, round(AVG(sal),1) sal
   FROM emp
   GROUP BY job;
--   ```
--
--   1.2 각 부서별로 가장 높은 급여를 받는 사람을 찾으시오.
--   ```
   SELECT *
   FROM emp e,
   (SELECT deptno, MAX(sal) sal
     FROM emp
     GROUP BY deptno) me
   WHERE e.deptno = me.deptno
     and e.sal = me.sal;
--   ```
--
--2. Subquery 연습 예제:
--   2.1 급여가 평균 급여보다 많이 받는 사원들의 이름과 급여를 찾으시오.
--   ```
    SELECT AVG(sal) FROM emp;
   SELECT ename, sal
   FROM emp
   WHERE sal > (SELECT AVG(sal) FROM emp);
--   ```
--
--   2.2 Smith의 급여보다 많은 급여를 받는 사원들의 이름과 급여를 찾으시오.
--   ```
   SELECT sal FROM emp WHERE ename='SMITH';
   SELECT ename, sal
   FROM emp
   WHERE sal > (SELECT sal FROM emp WHERE ename='SMITH');
--   ```
--
--3. Outer Join 연습 예제:
--   3.1 사원들의 이름과 부서 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
--   ```
--  outer join null이 나올 수 있는 테이블과 컬럼에 (+)를 처리
   SELECT e.ename, d.dname
   FROM emp e, dept d
   where e.deptno(+) = d.deptno;
--   ```
--
--   3.2 각 부서별로 최대 급여를 받는 사원의 이름을 가져오시오. 
--     (부서에 할당되지 않은 사원도 포함)
--     사원 1000 홍길동 null/50...
--         null뿐만아니라 부서정보에 없은 사원의 부서번호도 포함..
--     부서 10,20,30,40  
--   ```
   SELECT e.ename, d.dname
   FROM emp e, dept d
   where e.deptno(+) = d.deptno
   and sal = (SELECT MAX(sal) 
              FROM emp WHERE deptno = e.deptno);
--   ```
--
--4. Group 함수와 Subquery를 조합한 연습 예제:
--   4.1 각 직업별로 최대 급여를 받는 사원의 이름을 가져오시오.
--   ```
   SELECT e.ename, e.job
   FROM emp e
   WHERE sal = (SELECT MAX(sal) 
                FROM emp 
               WHERE job = e.job);  
   SELECT e.ename, e.job
   FROM emp e,
   (SELECT job, max(sal) sal
    FROM emp 
    GROUP BY job
   ) me
   WHERE e.job = me.job
   AND e.sal = me.sal; 
--   ```
--
--   4.2 각 부서별로 최소 급여를 받는 사원의 이름을 가져오시오.
--   ```
   SELECT e.ename, d.dname
   FROM emp e , dept d
   where e.deptno = d.deptno
   and sal = (SELECT MIN(sal)
              FROM emp WHERE deptno = e.deptno);
             
   SELECT e.ename, e.dname, e.sal
   FROM (
         SELECT ename, dname, e.deptno, sal 
           FROM emp e, dept d
         WHERE e.deptno = d.deptno
        ) e, 
       (
        SELECT deptno, min(sal) sal
        FROM emp e
        GROUP BY e.deptno
      ) d
   where e.deptno = d.deptno
   AND e.sal = d.sal; 
             
--   ```
*/