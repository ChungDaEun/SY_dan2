/*
1. SQL의 JOIN 기능에 대한 설명 중 가장 정확한 것은 무엇인가요?
A. 단일 테이블에서 데이터를 조회하는 기능이다.
B. 하나의 SQL 명령문으로 여러 테이블에 저장된 데이터를 한 번에 조회할 수 있다.#
C. 데이터베이스 분야의 표준이 아니다.
D. 항상 세 개 이상의 테이블을 결합한다.

효과적으로 나누어진 테이블을 연결 컬럼을 기준으로 조회하기 위한 목적이 join이다.


2. 다음 중 SQL에서 조인을 할 때 공통 컬럼을 기준으로 Inner Join하는 것을 가리키는 기본 조인 구문 형식은 무엇인가요?
A. select 선택할 컬럼 from 테이블1 별칭1, 테이블2 별칭2 where 별칭1.공통컬럼 = 별칭2.공통컬럼 #
B. select 선택할 컬럼 from 테이블1 별칭1, 테이블2 별칭2 where 별칭1.공통컬럼 <> 별칭2.공통컬럼
C. select 선택할 컬럼 from 테이블1 별칭1, 테이블2 별칭2 where 별칭1.공통컬럼 > 별칭2.공통컬럼
D. select 선택할 컬럼 from 테이블1 별칭1, 테이블2 별칭2 where 별칭1.공통컬럼 < 별칭2.공통컬럼

기본적인 ANSI 방식(DB 공통 표준 방식)으로 조인 형식을 처리
기존 조인을 inner join이다.


3. 두 개의 테이블에서 공통되는 컬럼을 구분할 때 일반적으로 사용되는 방식은 무엇인가요?
A. 테이블 별칭을 사용한다. (예: e., d.) #
B. 공통 컬럼 이름을 바꾼다.
C. 테이블 이름을 사용하지 않는다.
D. 새로운 공통 컬럼을 만든다.

from 테이블1 별칭1, 테이블2 별칭2 
select 나, where 조건에 컬럼을 사용할 때, 
공통컬럼은 반드시 별칭.컬럼명으로 지정해서 호출하여야 하고,
그 외는 별칭을 생략해도 무방하다.
select e.deptno, ename, dname
from emp e, dept d
where e.deptno = d.deptno
사원정보의 deptno와 부서정보의 deptno는 별칭으로 반드시 구분해서
사용해야 한다.

4. 다음 SQL 문장 중에서 부서별로 최고 급여를 출력하는 문장은 어떤 것인가요?
A. SELECT deptno, max(sal) FROM emp WHERE e.deptno = d.deptno GROUP BY loc;
B. SELECT loc, max(sal) FROM emp e, dept d WHERE e.deptno = d.deptno;
C. SELECT loc, max(sal) 
   FROM emp e, dept d 
   WHERE e.deptno = d.deptno 
   GROUP BY loc; #
D. SELECT deptno, max(sal) FROM emp GROUP BY deptno; #

join을 처리하더라도 기존에 배운 여러가지 함수 처리, sql 처리는
동일하게 처리한다. 
SELECT dname, max(sal) 
FROM emp e, dept d
where e.deptno = d.deptno
GROUP BY deptno;

5. SQL의 조인 기능에 대한 설명으로 올바른 것은?
    A. 여러 테이블의 데이터를 한번에 조회할 수 없다.
    B. 관계형 데이터베이스 분야의 표준이 아니다.
    C. 한 개의 테이블을 결합한다.
    D. 두 개 이상의 테이블을 결합한다. #
    
    기본적으로 두 개이상 테이블를 결합하고,
    self join은 물리적으로 하나의 테이블이나, 
    논리적으로 테이블을 alias로 호출하여 처리하기에 데이터 로딩의
    관점에서는 두개의 테이블이 조인되는 것과 마찬가지이다.
    ex)
    from emp e, emp m
    where e.mgr = m.empno

6. 기본 조인 구문 형식으로 올바르지 않은 것은?
    A. 테이블의 별칭을 이용하여 컬럼에 접근할 수 있다.
    B. 공통되는 컬럼을 구분할 때, 별칭을 사용한다.
    C. 공통된 컬럼이 아니면 별칭을 반드시 사용해야 한다.#
    D. 두 개의 테이블을 공통 컬럼을 기준으로 inner 조인한다.
    
    공통된 컬럼만 반드시 별칭을 사용하여야 한다.
    공통된 컬럼이 아닌 경우는 일반적으로 별칭을 사용하지 않는 경우가 많다.
    물론, 사용해도 에러는 발생하지 않는다.
    

7. "조인하기 전에, 데이터를 로딩해서 가져오는 형식"을 무엇이라고 하는가?
    A. Equi Join
    B. Outer Join
    C. Subquery #
    D. Self Join
    
    # Subquery
    1. select, where 조건의 컬럼과 matching 시
    	select (select max(sal) from emp) maxSal,
    		sal, ename
    	from emp;
    	최대급여를 각 row마다 보여주면서 사원의 급여와 이름 출력  	
    	select *
    	from emp
    	where sal = (select max(sal) from emp)
        최대 급여에 해당하는 사원 정보
    
    2. inline view(테이블 선언 위치에 sql을 사용하여 가상 테이블인
    	view를 만들어 사용하는 경우를 말한다.)
    	
    

8. 부서별 최고 급여자에 대한 정보를 출력하는 쿼리 중 올바른 것은?
    A. SELECT deptno, max(sal) sal FROM emp WHERE e.deptno = me.deptno;
    B. SELECT * FROM emp e, (SELECT deptno, max(sal) sal FROM emp GROUP BY deptno) me WHERE e.deptno = me.deptno AND e.sal = me.sal; #
    C. SELECT deptno, max(sal) sal FROM emp GROUP BY deptno WHERE e.deptno = me.deptno;
    D. SELECT * FROM emp e, (SELECT deptno, max(sal) sal FROM emp) me WHERE e.deptno = me.deptno;
    1단계 부서별 최고급여
    	select deptno, max(sal)
    	from emp
    	group by depno
    2단계 subquery로 join관계에 의해 해당 사원 정보 조회
        select *
        from emp e,
        ( select deptno, max(sal) sal
    		from emp
    	  group by depno ) me
    	where e.deptno = me.deptno
    	  and e.sal = me.sal;

9. outer join에 대한 설명으로 올바르지 않은 것은?
    A. equi join에서 null값을 가진 행은 출력이 되지 않는다.
    	연관관계가 없은 한쪽 테이블의 정보를 출력되지 않는다.
    B. 부서번호에 해당하는 사원이 없으면 inner join시 해당 부서정보를 표시하지 못한다.
    C. outer join 연산자 (+) 기호를 사용하면 조인 조건에 의해 null로 출력되는 테이블의 컬럼을 처리한다.
    D. outer join은 null값을 가진 행을 출력할 수 없다. #
    	두테이블 중에 연관관계가 없는 테이블의 행을 null로 출력된다.
   # outer join을 처리해야 할 경우
   1. 사원정보, 부서정보에서 부서별로 소속된 사원을 출력하는데,
      소속된 사원이 없더라도 부서정보를 출력해야할 경우
      (inner join의 경우 소속된 사원이 없으면 부서정보가 출력이 되지 
      않는다)
   2. 강좌와 수강신청학생과의 관계에서 수강신청을 하지않는 강좌 정보도
   	  출력해야할 경우

10. 두 테이블이 조인될 때, 같은 값이 없는 경우 사용하는 조인 형식은 무엇인가요?
    - A. Equi Join
    - B. Outer Join #
    - C. No Equi Join
    - D. Self Join
    
    같은 값이 없는 경우 사용
    1. null 값인 경우와
    2. 동일한 범위로 설정??
    
    select *
    from emp e, salgrade s
    where e.sal between s.losal and s.hisal
    No Equi Join : 같은 값을 포함하는 범위로 지정한다.

11. 동일한 테이블의 컬럼 내부에서 연관관계가 있는 컬럼 간의 조인은 무엇인가요?
    - A. Outer Join
    - B. Equi Join
    - C. No Equi Join
    - D. Self Join #
    emp테이블 empno, mgr의 관계는 

12. 부서에 사원이 없더라도 부서 정보를 표시해야할 때 어떤 조인을 사용하나요?
    - A. Equi Join
    - B. Outer Join #
    - C. No Equi Join
    - D. Self Join

13. 아래 SQL 쿼리는 어떤 조인을 사용한 것인가요?
   ```
   SELECT d.*, e.*
   FROM emp e, dept d
   WHERE e.deptno(+) = d.deptno
   ORDER BY d.deptno;
   ```
    - A. Equi Join
    - B. Outer Join #
    - C. No Equi Join
    - D. Self Join

15. 하나의 테이블에서 두 개의 컬럼을 연결하여 equi join하는 것을 무엇이라고 하나요?
   - A. Outer Join
   - B. Equi Join
   - C. No Equi Join
   - D. Self Join #
   
   self join을 사용하는 유형
   1. 계층적 데이터 처리시 많이 활용
      1) 관리자 번호와 사원번호
      2) 게시판의 답글 처리
      	 no : 게시번호와 
      	 refno : 상위번호
      3) 계층형 코드성 데이터 처리.
      	 code parCode
         1001 1000 
      
      	 1000 부서코드   
      	 	인사 1001
      	 	    인력관리
      	 	      ...
      	 	    신입관리
      	 	      ...
      	 	재무 1002
      	 	회계 1003
      	 2000 우편대분류 주소코드
      	 3000

16. 특정 직책에 대해 가장 최근에 입사한 사원 정보를 출력하는 쿼리에는 어떤 조인 형식이 필요한가요?
   - A. No Equi Join
   - B. Self Join
   - C. Outer Join
   - D. Inline View를 통한 Join #
   
   inline view
   	select*
   	from emp e,
   	 (select max(hiredate) hiredate from emp) me
   	where e.hiredate = me.hiredate
   컬럼 subquery도 가능하다.
     select *
     from emp
     where hiredate = (select max(hiredate) from emp )
   
   

17. 부서에 사원이 없는 경우에도 부서 정보를 출력하려면 어떤 Join을 사용해야 하나요?
   - A. Equi Join
   - B. Outer Join #
   - C. No Equi Join
   - D. Self Join

18. 자기 자신의 테이블과 조인하는 것을 무엇이라고 하나요?
   - A. Equi Join
   - B. Outer Join
   - C. No Equi Join
   - D. Self Join #
19. 다음 중 자기 조인이 필요한 상황은 어느 것인가요?
A. 하나의 테이블에서 두 개의 컬럼을 연결할 때 #
B. 두 테이블 간에 동일한 데이터를 찾을 때
C. 두 테이블 간에 공통된 컬럼을 연결할 때
D. NULL 값이 포함된 행을 결과에 포함시키기 위해

20. 자기 조인의 SQL 형식에는 어떤 테이블 별명이 포함되어 있나요?
A. 왼쪽 테이블의 별명과 오른쪽 테이블의 별명 #
B. 중간 테이블의 별명과 오른쪽 테이블의 별명
C. 왼쪽 테이블의 별명만
D. 자기 자신 테이블의 별명만
*/

--1. 아래의 EMP 테이블에 새로운 사원 데이터를 추가해보세요. 이름은 '최길동', 사원 번호는 2000, 직책은 '과장', 급여는 5000으로 설정하세요. 
SELECT * FROM emp03;

INSERT INTO emp03(ename, empno, job, sal)
	VALUES('최길동',2000, '과장',5000);

--2. EMP 테이블에서 '최길동'의 급여를 6000으로 수정해보세요. 
UPDATE emp03
	SET sal = 6000
WHERE ename = '최길동';

--3. EMP 테이블에서 사원 번호가 2000인 사원 정보를 삭제해보세요. 
DELETE FROM EMP03
WHERE empno = 2000;

--4. EMP 테이블에서 사원들의 급여를 10% 인상하는 SQL 문을 작성해보세요. 
UPDATE EMP03
	SET sal = sal + (sal * 0.1)
WHERE sal IS NOT NULL;
ROLLBACK;

--5. 새로운 사원 정보를 추가하고, 바로 롤백하여 원래 상태로 돌리는 SQL 문을 작성해보세요. 
INSERT INTO EMP03
	values(1200,'권순영','신입사원',NULL, sysdate, 2000, 500, 40);
SELECT * FROM emp03;
ROLLBACK;




















