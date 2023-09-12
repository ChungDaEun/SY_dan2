CREATE TABLE userinfo(
   user_name VARCHAR(100),
   favorite_song VARCHAR(100),
   fsong_artist VARCHAR(100),
   favorite_genre VARCHAR(100)
);

SELECT * FROM userinfo;

INSERT INTO userinfo VALUES ('이지율','Dangerously','찰리푸스','팝송');
INSERT INTO userinfo VALUES ('나보미','만화영화','지코','힙합');
INSERT INTO userinfo VALUES ('차민석','Polaroid Love','Enhypen','케이팝');
INSERT INTO userinfo VALUES ('유하나','Love me','비오','힙합');
INSERT INTO userinfo VALUES ('모둔석','파이팅 해야지','부석순(feat.이영지)','케이팝');

SELECT * FROM userinfo;

CREATE TABLE songinfo(
   title VARCHAR(100),
   album_title VARCHAR(100),
   artist_name VARCHAR(100),
   ranking NUMBER,
   genre VARCHAR(100)
);

SELECT * FROM songinfo;

INSERT INTO songinfo VALUES ('Dangerously','Nine Track Mind','찰리푸스',20,'팝송');
INSERT INTO songinfo VALUES ('만화영화','Random Box','지코',1,'힙합');
INSERT INTO songinfo VALUES ('Polaroid Love','Dimension : Answer','Enhypen',34,'케이팝');
INSERT INTO songinfo VALUES ('Love me','Love me','비오',25,'힙합');
INSERT INTO songinfo VALUES ('파이팅 해야지','Second wind','부석순(feat.이영지)',11,'케이팝');

SELECT * FROM SONGINFO
WHERE genre = ?
;