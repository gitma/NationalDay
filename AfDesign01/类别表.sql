drop database if exists mydb0915;

create database mydb0915 default character set utf8;

use mydb0915;

drop table if exists category;

create table category
(
	/* 类别编号，自动增长 */
	id int not null auto_increment,
	/* 类别名称 */
	type varchar(20),
	/* 类别是否为热点类别，热点类别才有可能显示在首页 */
	hot bool default false,
	/* 设置类别别号为主键 */
	primary key(id)
);

select * from category;