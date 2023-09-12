CREATE TABLE userinfo(
	"user_name" VARCHAR2(100),
	"favorite_song" VARCHAR2(100),
	"fsong_artist" VARCHAR2(100),
	"favorite_genre" VARCHAR2(100));
	
SELECT * FROM userinfo;

INSERT INTO userinfo VALUES ('이지율','Dangerously','찰리푸스','팝송');
INSERT INTO userinfo VALUES ('나보미','만화영화','지코','힙합');
INSERT INTO userinfo VALUES ('차민석','Polaroid Love','Enhypen','케이팝');
INSERT INTO userinfo VALUES ('유하나','Love me','비오','힙합');
INSERT INTO userinfo VALUES ('모둔석','파이팅해야지','부석순(feat.이영지)','케이팝');

CREATE TABLE songinfo(
	"title" VARCHAR2(100),
	"album_title" VARCHAR2(100),
	"open_date" DATE,
	"ranking" NUMBER,
	"장르" VARCHAR2(100));
	
SELECT * FROM songinfo;
/*
INSERT INTO userinfo VALUES ('Dangerously','Nine Track Mind','찰리푸스','2016-01-29','20','팝송');
INSERT INTO userinfo VALUES ('만화영화','Random Box','지코','2020-07-01','1','힙합');
INSERT INTO userinfo VALUES ('Polaroid Love','Dimension : Answer','Enhypen','2022-01-10','34','케이팝');
INSERT INTO userinfo VALUES ('Love me','Love me','비오','2016-01-29','20','팝송');
INSERT INTO userinfo VALUES ('Dangerously','Nine Track Mind','찰리푸스','2016-01-29','20','팝송');
*/
