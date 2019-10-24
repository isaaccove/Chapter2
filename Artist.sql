use artist_db;

select * from Artist;
select * from Album;

CREATE TABLE Artist(
ArtistId	Integer		NOT NULL,
ArtistName	Char(25)	NOT NULL,
Rating		Char(10)	NOT NULL,
Phone		Numeric(12)	NULL,
CONSTRAINT	Artist_PK	PRIMARY KEY(ArtistId));
	
ALTER TABLE Album
ADD Album_Id Integer NOT NULL,
ADD CONSTRAINT Album_PK PRIMARY KEY(Album_Id, YearRelease);



CREATE TABLE Album(
ArtistId	Integer		NOT NULL,
Track		Char(15)	NOT NULL,
Genre		Char(15)	NOT NULL,
YearRelease	Integer		NOT NULL,
    CONSTRAINT	Album_PK	FOREIGN KEY(ArtistId)
							REFERENCES	Artist(ArtistId));
                            
                            
insert into Album values(03, 'Crown', 'Gospel Artist', 1998, 001);                           
insert into Artist values(07, 'Tope Alabi', 'High', 067654654654); 


