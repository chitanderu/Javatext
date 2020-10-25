CREATE SCHEMA `book_schema` ;

use book_schema;
create table `管理员`
(   username varchar(20),
	password varchar(20)  not null,
    primary key(`username`)
);
create table `学生`
(   username varchar(20),
	password varchar(20)  not null,
    have_read_book varchar(20),
    primary key(`username`)
);

create table `老师`
(   username varchar(20),
	password varchar(20)  not null,
    primary key(`username`)
);

create table `book`
(
book_id char(5),   
name varchar(20) not null,
storage_date date, 
user_name char(20), 
have_borrow boolean,
type varchar(10) not null,
primary key(book_id),
foreign key(user_name) references `学生`(username)
);


insert into 学生 value('xiaoming','123456',1);
insert into 学生 value('xiaohong','123426',2);
insert into 学生 value('xiaohua','1234267',1);

insert into book value(12,'中国通史','2020/10/2','xiaoming',1,'社会科学');
insert into book value(13,'白夜行','2020/10/12','xiaohong',1,'心理学');
insert into book value(14,'c++ perior','2020/10/3','xiaoming',1,'心理类');
insert into book value(15,'活着','2020/10/2','xiaohua',1,'文学类');

insert into 管理员 value('admin','123456');

insert into 老师   value('teacher','1234567');
update book set name = "java web" where book_id = 14;
 
SELECT * FROM book_schema.学生;  
SELECT * FROM book_schema.book;
 delete from book where book_id = 12;
 

