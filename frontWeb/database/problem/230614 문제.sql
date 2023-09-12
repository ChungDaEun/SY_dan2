--[1단계:개념] 1. 제약조건의 각각의 특징을 기본 예제를 통해서 설정하고 확인하세요.
/*
1. NOT NULL : 제약조건을 설정 시, 해당필드는 NULL 값을 저장할 수 없게 하는 제약조건입니다.
2. UNIQUE : 제약조건을 설정 시, 중복된 값을 저장할 수 없게 하는 제약조건입니다. 
3. PRIMARY KEY : 기본키를 지정하는 제약조건으로, 해당 필드는 NOT NULL과 UNIQUE 제약조건의 특성을 모두 가집니다.
4. FOREIGN KEY :  한 테이블을 다른 테이블과 연결하여 외래키를 지정하는 제약조건으로, 해당 테이블은 다른 테이블에 의존됩니다.
5. DEFAULT : 해당 필드의 디폴트값을 설정할 수 있게 해주는 제약조건입니다.
*/
--[1단계:코드] 2. 쇼핑몰의 회원 정보/구매정보/물품정보를 테이블로 만들 때, 오늘 배운 제약조건 5가지를 통해 만드세요
CREATE TABLE mem_info(
	mem_id varchar(50),
	mem_pw varchar(50),
	mem_name varchar(50),
	mem_email varchar(50)
)

CREATE TABLE buy_info(
	mem_id varchar(50),
	buy_pro varchar(50),
	buy_pri NUMBER,
	buy_cnt number
)
CREATE TABLE pro_info(
	pro_name varchar(50),
	pro_pri NUMBER,
	pro_cnt number
)
--[1단계:코드] 3. 컴퓨터부품테이블(부품key, 부품명, 가격, 재고량, 부품 설명)만들되, sequence를 이용해서 부품key를 설정해서 할당하도록 하세요.
--[1단계:코드] 4. Enrollments라는 테이블을 생성하고, 학생의 학번(student_id)과 수강한 강의의 고유번호(course_id)를 저장하는데, 
--              각각의 값은 Students 테이블과 Courses 테이블의 학번과 고유번호를 참조하는 외래키로 설정되도록 하세요.