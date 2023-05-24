drop database if exists sampledb;
create database sampledb;
use sampledb;

create table student (
	id char(7) not null,
    name varchar(10),
    dept varchar(20),
    constraint student_pk primary key (id)
);

insert into student values ('20001', '김철수', '컴퓨터시스템');
insert into student values ('20002', '이영희', '컴퓨터시스템');
insert into student values ('20003', '아이유', '디자인학과');
insert into student values ('20004', '제니', '체육학과');

update student
set name = '김종민', dept = '음악학과'
where id = '20001';

delete 
from student
where id = '20001';

select * from student;

