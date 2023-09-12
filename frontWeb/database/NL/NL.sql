CREATE TABLE seat_info(
	seat_serialnum Number(10),
	building varchar2(50),
	floor_num Number(5),
	room NUMBER(5),
	seat_num Number(10),
	reservation varchar(5)
);

INSERT INTO seat_info VALUES(10101020,'A동',1,1,20,'yes');
INSERT INTO SEAT_INFO VALUES(10102034,'A동',1,2,34,'yes');
INSERT INTO SEAT_INFO VALUES(10102065,'A동',1,2,65,'no');
INSERT INTO SEAT_INFO VALUES(10103023,'A동',1,3,23,'yes');
INSERT INTO SEAT_INFO VALUES(10201054,'A동',2,1,54,'yes');
INSERT INTO SEAT_INFO VALUES(10202043,'A동',2,2,43,'no');
INSERT INTO SEAT_INFO VALUES(10202156,'A동',2,2,156,'no');
INSERT INTO SEAT_INFO VALUES(10203014,'A동',2,3,14,'yes');

INSERT INTO SEAT_INFO VALUES(20101024,'B동',1,1,24,'no');
INSERT INTO SEAT_INFO VALUES(20102065,'B동',1,2,65,'yes');
INSERT INTO SEAT_INFO VALUES(20102056,'B동',1,2,56,'no');
INSERT INTO SEAT_INFO VALUES(20103035,'B동',1,3,35,'yes');
INSERT INTO SEAT_INFO VALUES(20201123,'B동',2,1,123,'yes');
INSERT INTO SEAT_INFO VALUES(20202056,'B동',2,2,56,'no');
INSERT INTO SEAT_INFO VALUES(20202045,'B동',2,2,45,'yes');
INSERT INTO SEAT_INFO VALUES(20203023,'B동',2,3,23,'no');


SELECT * FROM seat_info;

CREATE TABLE seat_res(
	re_num NUMBER(10),
	myid varchar(50),
	sear_serialnum Number(10),
	res_date DATE
);
INSERT INTO seat_res values(32,'nami0839',10102034,'2023-02-12');
INSERT INTO seat_res values(12,'yuho7304',10203014,'2023-04-21');
INSERT INTO seat_res values(34,'mimi0723',20102065,'2022-12-09');
INSERT INTO seat_res values(24,'sara0234',20103035,'2023-05-02');
INSERT INTO seat_res values(9,'jiho0128',20202045,'2023-06-20');
INSERT INTO seat_res values(33,'hyee0426',20201123,'2023-06-15');

SELECT * FROM seat_res;
SELECT * FROM seat_info;

DELETE from seat_res
WHERE re_num = 439;

SELECT * FROM SEAT_RES
WHERE myid = 'hyee0426';

