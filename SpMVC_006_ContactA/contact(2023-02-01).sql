CREATE DATABASE myPMS;
USE mypms;
CREATE TABLE tbl_contacts (
	c_uid	BIGINT	AUTO_INCREMENT	PRIMARY KEY,
	c_name	VARCHAR(20)	NOT NULL,	
	c_tel	VARCHAR(15)	NOT NULL,	
	c_addr	VARCHAR(125),		
	c_hobby	VARCHAR(20)		
);

CREATE TABLE tbl_hobbies (
	h_uid	BIGINT	AUTO_INCREMENT	PRIMARY KEY,
	h_cuid	BIGINT	NOT NULL,	
	h_name	VARCHAR(15)	NOT NULL	
);
DROP TABLE tbl_contacts;
DROP TABLE tbl_hobbies;




