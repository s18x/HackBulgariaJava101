CREATE DATABASE IF NOT EXISTS warehouse;

USE warehouse;

CREATE TABLE IF NOT EXISTS products (
	product_id int NOT NULL AUTO_INCREMENT,
    product_name varchar(255) NOT NULL,
	primary key(product_id)
);

CREATE TABLE IF NOT EXISTS availability (
	availability_id int NOT NULL AUTO_INCREMENT,
	product_id int NOT NULL,
    quantity int,
    primary key(availability_id),
    foreign key(product_id) REFERENCES products(product_id)
);

CREATE TABLE IF NOT EXISTS supply_history (
	supply_id int NOT NULL AUTO_INCREMENT,
	product_id int NOT NULL,
    quantity int,
    primary key(supply_id),
    foreign key(product_id) REFERENCES products(product_id)
);
