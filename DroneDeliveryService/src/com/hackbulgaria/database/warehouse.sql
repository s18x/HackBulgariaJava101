CREATE DATABASE IF NOT EXISTS warehouse;

CREATE TABLE products (
	product_id int NOT NULL AUTO_INCREMENT,
    product_name varchar(255) NOT NULL,
	primary key(product_id)
);

CREATE TABLE availability (
	availability_id int NOT NULL AUTO_INCREMENT,
	product_id int NOT NULL,
    quantity int,
    primary key(employee_id),
    foreign key(product_id) REFERENCES products(product_id)
);

CREATE TABLE supply_history (
	supply_id int NOT NULL AUTO_INCREMENT,
	product_id int NOT NULL,
    quantity int,
    primary key(employee_id),
    foreign key(product_id) REFERENCES products(product_id)
);
