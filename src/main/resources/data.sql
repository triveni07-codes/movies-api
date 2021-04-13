CREATE TABLE IF NOT EXISTS MOVIE (
   ID   INT              NOT NULL,
   TITLE VARCHAR (100)     NOT NULL,
   COMMENT  VARCHAR (200)   NOT NULL,
   IMAGE_URL  VARCHAR (500)  NOT NULL,
   PRIMARY KEY (ID)
);

INSERT INTO MOVIE
VALUES (1, 'The Avengers', 'New York blows up in this!', 'http://d21lz9b0v8r1zn.cloudfront.net/wp-content/uploads//2012/03/detail.jpg');

INSERT INTO MOVIE
VALUES (2, 'Dark City', 'This looks mysterious. Cool!', 'https://i.chzbgr.com/full/5569379584/hA96709E0/');

INSERT INTO MOVIE
VALUES (3, 'Matrix', 'Something different to try!', 'https://m.media-amazon.com/images/I/71F0pogpAmL._SL1382_.jpg');

INSERT INTO MOVIE
VALUES (4, 'John Carter', 'He is super cool!', 'https://gdj-inr5u0ip5pewom.stackpathdns.com/wp-content/uploads/2012/03/movies-poster-20.jpg');

INSERT INTO MOVIE
VALUES (5, 'Harry Potter ', 'Its mysterious!', 'https://maxcdn.icons8.com/app/uploads/2019/05/poster-for-movie.png');

INSERT INTO MOVIE
VALUES (6, 'The Dark Knight', 'This looks mysterious. Cool!', 'https://qph.fs.quoracdn.net/main-qimg-d96cc1808f88d15a62633841e6e2efe0');

INSERT INTO MOVIE
VALUES (7, 'Spiderman', 'Someone said this was fun. Maybe!', 'https://lh3.googleusercontent.com/proxy/83yD50ZrGb_ZDKdXzLFBg7VctMW4a6s5AqagtLYGGk8ehY7AfQx5VyNgN08Z7TNUJWksSmJFRDl9s9LO7zfWek2e480G5lLbgqNY1sooRZQiIAe6A3h-pvpqZiZ1ituNnWNEVOH8Hggp-lDKSpEOVzIrezHSmV7Hib-8ssyhp4bgew8');

commit;