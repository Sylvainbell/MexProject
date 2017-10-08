create database SampleDB;
 
use SampleDB;
 
CREATE TABLE `users` (
    `user_id` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(45) NOT NULL,
    `password` varchar(45) NOT NULL,
    `fullname` varchar(45) NOT NULL,
    `email` varchar(45) NOT NULL,
    PRIMARY KEY (`user_id`)
);


CREATE DATABASE database;

CREATE TABLE 'product' (

	'product_id' 	int(11) NOT NULL AUTO_INCREMENT,
	'name' 			varchar(45) NOT NULL,
	'ref_provider'	varchar(45) NOT NULL,
	'ref_custo'		varchar(13) NOT NULL,
	'code_barre'	varchar(45) NOT NULL,
	'photo'			??? NOT NULL,
	'creation_date'	DATE		NOT NULL,
	'description'	varchar(100),
	'is_active'     boolean NOT NULL,
	'historic_modif'varchar(100),
	PRIMARY KEY (`product_id`)
);


CREATE TABLE 'customer' (

	'customer_id' 	int(11) NOT NULL AUTO_INCREMENT,
	'name' 			varchar(45) NOT NULL,
	'last_name'		varchar(45) NOT NULL,
	'cell' 			varchar(13) NOT NULL,
	'adress'		varchar(45) NOT NULL,
	'creation_date'	DATE		NOT NULL,
	PRIMARY KEY (`customer_id`)
);

CREATE TABLE 'order' (

	'order_id' 	int(11) NOT NULL AUTO_INCREMENT,
	'customer_id'	int(11) 	NOT NULL,
	'creation_date'	DATE		NOT NULL,
	'products' 		int[] REFERENCES product (product_id),
	PRIMARY KEY (`order_id`)

);