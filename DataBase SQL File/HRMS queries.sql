--CREATE TABLE Jobs(
--	id int IDENTITY(1,1) NOT NULL ,
--	job_title varchar (100) NOT NULL  PRIMARY KEY ,
--	job_description  varchar (1000) NOT NULL
	 
--	 )

--	 CREATE TABLE Applied_Job_user_details(
--	id int IDENTITY(1,1) NOT NULL PRIMARY KEY ,
--	username  varchar (50) NOT NULL,
--	job_title varchar (100) NOT NULL  ,
	
--	filename varchar (50) NOT NULL
	 
--	 )


--	 

--create table sme(
--	id int IDENTITY(1,1) NOT NULL PRIMARY KEY ,
--	name varchar (50) NOT NULL   ,
--	username  varchar (50) NOT NULL,
--	email varchar(50)
	


--);
--create table hrp_info(
--	id int IDENTITY(1,1) NOT NULL PRIMARY KEY ,
--	name varchar (50) NOT NULL   ,
--	username  varchar (50) NOT NULL,
--	email varchar(50),
--	ratings varchar(11)
	


--);

create table hrm(
	id int IDENTITY(1,1) NOT NULL PRIMARY KEY ,
	username varchar (50) NOT NULL   ,
	filename  varchar (50) NOT NULL,
	email varchar(50)
	


);

select * from user_ratings


--create table user_ratings(
--	id int IDENTITY(1,1) NOT NULL PRIMARY KEY ,
--	username varchar (50) NOT NULL   ,
--	ratings  varchar (50) NOT NULL,
--	email varchar(50)
	


--);


select * from hrm

select * from hrp_info


select * from sme




--	CREATE TABLE Register(
--	id int IDENTITY(1,1) NOT NULL primary key,
--	name varchar(50) NOT NULL,
--	username varchar(50) NOT NULL,
--	email varchar(50) NOT NULL,
--	password varchar(50) NOT NULL,
--	phoneNo varchar(50) NOT NULL,
--	address varchar(50) NOT NULL,
--	gender varchar(50) NOT NULL,
--	securitycode varchar(50) NOT NULL,
--	confrim varchar(50) NOT NULL,
--	options varchar(20) NOT NULL
--	)





	--drop table JOBS
	--truncate table Jobs
	

	Select * from Applied_Job_user_details

	
	--insert into JOBS values('IT JOB','Best job')

	--insert into JOBS values('Electrical Engineering Job','Very good job')
	--insert into JOBS values('Teacher JOB','Nice job')

	--insert into Register values('HR Personnel','hrp','tayyab.shahid11@gmail.com','123','123456','lhr','male','1234',1,'hrp')
	
	--insert into Register values('Tahir','sme','tayyab.shahid11@gmail.com','123','123456','lhr','male','1234',1,'sme')


	--insert into Register values('Dawood','sme','tayyab.shahid11@gmail.com','123','123456','lhr','male','1234',1,'hrm')

		select * from Register
	select * from JOBS
	select * from hrm
	select * from hrp_info
	select * from Applied_Job_user_details
	select * from user_ratings
	select * from sme