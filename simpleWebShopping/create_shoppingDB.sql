create table shoppingDB.user(
	id varchar(10) not null primary key, 
	pass varchar(10), name varchar(20), 
	age int
) character set utf8;

insert into shoppingDB.user(id, name, pass, age) values ("web01", "Taro", "password", 20);
insert into shoppingDB.user(id, name, pass, age) values ("web02", "Jiro", "pass", 17);
insert into shoppingDB.user(id, name, pass, age) values ("web03", "Saburo", "password", 19);

create table shoppingDB.item(
	item_id char(5) not null primary key, 
	item_name varchar(50), 
	price int not null
)character set utf8;

insert into shoppingDB.item(item_id, item_name, price) values ("s0001", "鋼のSword", 120);
insert into shoppingDB.item(item_id, item_name, price) values ("s0002", "ボロのメイル", 80);
insert into shoppingDB.item(item_id, item_name, price) values ("s0003", "ボロのシューズ", 40);


create table shoppingDB.stock(
	item_id char(5) not null primary key, 
	quantity int
) character set utf8;

insert into shoppingDB.stock(item_id,  quantity) values ("s0001",  10);
insert into shoppingDB.stock(item_id,  quantity) values ("s0002",  10);
insert into shoppingDB.stock(item_id,  quantity) values ("s0003",  10);

create table shoppingDB.history(
	order_id int(4) zerofill auto_increment primary key not null, 
	id varchar(10) not null, 
	item_id char(5) not null, 
	quantity int not null
) character set utf8;

create table shoppingDB.img(
	item_id char(5) not null primary key,
	picture varchar(30) not null
)character set utf8;

insert into shoppingDB.img(item_id,  picture) values ("s0001", "a.jpg");
insert into shoppingDB.img(item_id,  picture) values ("s0002", "b.jpg");
insert into shoppingDB.img(item_id,  picture) values ("s0003", "c.jpg");
