create database employees_database;

use employees_database;

show databases;

create table employees_tbl (
id INT AUTO_INCREMENT PRIMARY KEY,
name varchar(20),
dept varchar(10),
salary int(10)
);

insert into employees_tbl values(100,'Michael','Sales',5500);
insert into employees_tbl values(200,'Cassandra','Technology',6000);
insert into employees_tbl values(300,'Samuel','Technology',7000);
insert into employees_tbl values(400,'John','Marketing',9500);
insert into employees_tbl values(500,'Beth','Technology',6500);
insert into employees_tbl values(600,'Peter','HR',5000);
insert into employees_tbl values(700,'Romeo','Legal',5400);
