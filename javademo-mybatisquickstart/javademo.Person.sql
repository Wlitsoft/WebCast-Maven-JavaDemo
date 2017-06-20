-- auto-generated definition

create table Person
(
	pkid int auto_increment
		primary key,
	id int not null,
	name varchar(10) not null,
	age int default '0' not null,
	job varchar(20) null
);
INSERT INTO javademo.Person (id, name, age, job) VALUES (1, 'wlitsoft', 25, '.net');

