/*
[1단계:개념] 1. 테이블 구조변경의 종류를 기본 코드로 리스트하세요
[1단계:코드] 2. emp14 (사원명과 부서명, 급여)테이블을 만들고, 직책명 컬럼을 추가하되 default로 '직책없음', 
                제약사항으로 사원정보의 직책범위를 distinct로 확인하여 check 설정하여 만드세요.
[1단계:코드] 3. 주문번호   고객명   주문일자           상품명
		      1   		홍길동   2022-01-01   	노트북
		      2   		이영희   2022-02-15  	 	마우스
		      3   		김철수   2022-01-01   	키보드, 마우스   
		      4   		박지성   2022-03-10   	스마트폰
		      5   		이영희   2022-03-10   	노트북, 핸드폰
		      6   		홍길동   2022-03-10   	키보드
      이 내용을 제1정규화를 처리한 테이블 구조를 만드세요.
[1단계:코드] 4. 깁밥의 가격과 갯수를 3종류를 요청값으로 받아서 해당 내용의 계산 결과를 테이블에 총비용과 함께 출력하세요.
*/

-- 1. 테이블 구조변경의 종류를 기본 코드로 리스트하세요

-- 2. emp14 (사원명과 부서명, 급여)테이블을 만들고, 직책명 컬럼을 추가하되 default로 '직책없음', 
--    제약사항으로 사원정보의 직책범위를 distinct로 확인하여 check 설정하여 만드세요.

/*
3. 주문번호   고객명   주문일자           상품명
   1   		홍길동   2022-01-01   	노트북
   2   		이영희   2022-02-15  	 	마우스
   3   		김철수   2022-01-01   	키보드, 마우스   
   4   		박지성   2022-03-10   	스마트폰
   5   		이영희   2022-03-10   	노트북, 핸드폰
   6   		홍길동   2022-03-10   	키보드
   
   고객정보
   고객번호 	고객명	
   1		홍길동
   2		이영희
   3		김철수
   4		박지성	
   5		이영희
   
   주문정보
   주문번호	주문일자		상품명
   1		2022-01-01	노트북
   2		2022-02-15	마우스
   3		2022-01-01	키보드, 마우스 
   4		2022-03-10	스마트폰
   5		2022-03-10	노트북, 핸드폰
   6		2022-03-10	키보드

   주문상품정보
   주문번호	상품명
   1		노트북
   5		노트북
   2		마우스
   3		마우스
   3		키보드
   6		키보드
   4		스마트폰
   5		핸드폰
*/
CREATE TABLE cus_info(
	cus_num int PRIMARY key, 
	cus_name varchar(50)
);
SELECT * FROM cus_info;
INSERT INTO cus_info VALUES(1,'홍길동');
INSERT INTO cus_info VALUES(2,'이영희');
INSERT INTO cus_info VALUES(3,'김철수');
INSERT INTO cus_info VALUES(4,'박지성');
INSERT INTO cus_info VALUES(5,'이영희');

CREATE TABLE order_info(
	order_num int PRIMARY KEY,
	order_date DATE,
	pro_num varchar(100)
);
INSERT INTO order_info VALUES(1, '2022-01-01', '노트북');
INSERT INTO order_info VALUES(2,'2022-02-15','마우스');
INSERT INTO order_info VALUES(3, '2022-01-01', '키보드, 마우스');
INSERT INTO order_info VALUES(4, '2022-03-10', '스마트폰');
INSERT INTO order_info VALUES(5, '2022-03-10', '노트북, 핸드폰');
INSERT INTO order_info VALUES(6, '2022-03-10', '키보드');
SELECT * FROM order_info;

/*
   주문번호	상품명
   1		노트북
   5		노트북
   2		마우스
   3		마우스
   3		키보드
   6		키보드
   4		스마트폰
   5		핸드폰
*/
CREATE TABLE or_pro(
	order_num int,
	cus_name varchar(50),
	FOREIGN KEY(order_num) REFERENCES order_info(order_num)
);
INSERT INTO or_pro VALUES(1,'노트북');
INSERT INTO or_pro VALUES(5,'노트북');
INSERT INTO or_pro VALUES(2,'마우스');
INSERT INTO or_pro VALUES(3,'마우스');
INSERT INTO or_pro VALUES(3,'키보드');
INSERT INTO or_pro VALUES(6,'키보드');
INSERT INTO or_pro VALUES(4,'스마트폰');
INSERT INTO or_pro VALUES(5,'핸드폰');

SELECT * FROM or_pro;