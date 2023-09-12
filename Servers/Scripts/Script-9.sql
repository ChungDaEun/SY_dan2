CREATE TABLE department(
	deptno NUMBER PRIMARY KEY,
	dname varchar2(60)
);

CREATE TABLE professor(
	prono NUMBER PRIMARY KEY,
	pro_pass varchar2(30),
	pro_name varchar2(30),
	pro_phone varchar2(12),
	pro_email varchar2(50),
	lab varchar2(50),
	deptno NUMBER,
	CONSTRAINT department_fk FOREIGN KEY deptno REFERENCES department(deptno)
)

CREATE TABLE student(
	studentno NUMBER PRIMARY KEY,
	deptno NUMBER,
	prono NUMBER,
	stu_pass varchar2(30),
	stu_name varchar2(30),
	stu_phone varchar2(12),
	stu_email varchar2(50),
	CONSTRAINT department_fk FOREIGN KEY deptno REFERENCES department(deptno),
	CONSTRAINT professor_fk FOREIGN KEY prono REFERENCES professor(prono)
)

CREATE TABLE lecture(
	lectureno varchar(30) PRIMARY KEY,
	prono NUMBER,
	lecturename varchar(50),
	lecturetime DATE,
	lectureplace varchar2(50),
	CONSTRAINT professor_fk FOREIGN KEY prono REFERENCES professor(prono)
)

CREATE TABLE grades(
	lectureno varchar2(50),
	studentno NUMBER,
	attendance varchar2(6),
	late varchar2(6),
	point NUMBER,
	CONSTRAINT lecture_fk FOREIGN KEY lectureno REFERENCES lecture(lectureno),
	CONSTRAINT student_fk FOREIGN KEY studentno REFERENCES student(studentno)
)

CREATE TABLE post(
	postno NUMBER PRIMARY KEY,
	studentno NUMBER,
	postname varchar2(300),
	postdetail varchar2(3000),
	posttype varchar2(30),
	postdate DATE,
	CONSTRAINT student_fk FOREIGN KEY studentno REFERENCES student(studentno)
)

CREATE TABLE ap_comment(
	commentno NUMBER PRIMARY KEY,
	postno NUMBER,
	studentno NUMBER,
	commentdetail varchar2(300),
	commentdate DATE,
	CONSTRAINT post_fk FOREIGN KEY postno REFERENCES post(postno),
	CONSTRAINT student_fk FOREIGN KEY studentno REFERENCES student(studentno)
)

CREATE TABLE admin(
	empno NUMBER PRIMARY KEY,
	ad_pass varchar2(30),
	ad_name varchar2(30),
	ad_phone varchar2(12),
	ad_email varchar2(50)
)

SELECT * FROM admin;