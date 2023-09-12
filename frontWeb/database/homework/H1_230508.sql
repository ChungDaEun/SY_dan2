/* 2023-05-08 과제

[1단계:코드] 1. employee 테이블 전체를 조회하고, 해당 컬럼을 조회해보세요. */
SELECT * FROM  employees;
SELECT employee_id FROM EMPLOYEES;
SELECT FIRST_NAME FROM EMPLOYEES;
SELECT LAST_NAME FROM EMPLOYEES;
SELECT email FROM EMPLOYEES;
SELECT PHONE_NUMBER  FROM EMPLOYEES;
SELECT HIRE_DATE FROM EMPLOYEES;
SELECT JOB_ID  FROM EMPLOYEES;
SELECT SALARY FROM EMPLOYEES;
SELECT COMMISSION_PCT FROM EMPLOYEES;
SELECT MANAGER_ID FROM EMPLOYEES;
SELECT DEPARTMENT_ID FROM EMPLOYEES;

/* 
[1단계:개념] 2. 정보와 데이터의 차이점을 기술하세요.
정보는 의사결정에 유용하게 활용할 수 있도록 데이터를 처리한 결과물이고
데이터는 현실세계에서 단순히 관찰하거나 측정하여 수집한 사실이나 값이다.

[1단계:개념] 3. 데이터의 형태에 따른 분류를 하고, 예를 나타내세요.
- 정형데이터 : 미리 정해진 구조가 있다. (엑셀, 관계형 데이터베이스의 테이블)
- 반정형데이터 : 내용안에 구조에 대한 설명이 같이 있다. (html, xml, json문서, 센서 데이터)
- 비정형 데이터 : 정해진 구조가 없다. (소셜데이터의 텍스트, 영상, 이미지, 음성)

[1단계:개념] 5. 이산형 데이터와 연속형 데이터의 차이점을 기술하세요
이산형 데이터는 갯수를 셀 수 있는 데이터로 학생 수, 결제금액, 구매자 수 등이 있고 
연속형 데이터는 측정을 할 수 있는 데이터로 온도, 습도, 키 등이 있다.

*/

/* [1단계:개념] 6. 테이블과 컴럼명의 alias를 사용하는 방법을 예제를 통해서 기술하세요.
1. select 컬럼명 as 별칭
2. select 컬럼명 별칭
3. select 컬러명 "공백이나 특수문자 포함"
차례대로 1,2,3 예제
 */
SELECT EMPLOYEE_ID AS "아이디"
FROM EMPLOYEES;

SELECT salary "월급"
FROM EMPLOYEES;

SELECT EMPLOYEE_ID "사원아이디", '이 사원의 월급은 ' || salary || '이고 보너스는 '|| salary*0.2 ||'입니다.'"월급 정보"
FROM EMPLOYEES;

/*
 * [1단계:코드] 8. 아래의 형태로 사원정보(emp) 테이블의 컬럼이름에 맞는 데이터를 출력하세요
                 부서번호 - deptno  사원번호(empno) 직책(job)  급여(sal*12) 보너스
*/
SELECT deptno AS "부서번호", empno "사원번호", job "직책", sal*12 "급여(보너스 포함)"
FROM emp;

/*
[1단계:코드] 9. 아래의 형식으로 컬럼간의 연산과 연결처리를 하여 alias로 출력하세요.
              1) @@님의 사원번호는 @@이고, 올해 연말보너스는 연봉의 20%인 @@원입니다.  @@님(ename)
              2) @@님의 입사일은 @@이고, 현재 연봉의 1/13인 월급여는 @@만원.   입사일 @@(hiredate)
*/
SELECT ename || '님의 사원번호는 ' || empno || '이고, 올해 연말 보너스는 연봉의 20%인' || sal*0.2 ||'원 입니다. '|| ename || '님' mrg
FROM emp;


SELECT ename || '님의 입사일은 ' || hiredate || '이고 연봉의 1/13인 월 급여는 ' || mgr/13 || '만원입니다. 입사일 '|| hiredate mrg
FROM emp;