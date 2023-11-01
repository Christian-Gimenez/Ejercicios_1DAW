# 11. Ejercicios de creación de tablas (Ejercicio 14)
# Ejercicio 14
CREATE DATABASE gestion_compras;
USE gestion_compras;

CREATE TABLE cliente(
	nombre VARCHAR(20),
	apellido VARCHAR(20),
	codigo INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE articulo(
	nombreArticulo VARCHAR(20),
	codigo INT PRIMARY KEY
);

CREATE TABLE compra(
	fecha DATETIME,
	unidades INT CHECK(unidades > 0),
	codcliente INT AUTO_INCREMENT,
	codarticulo INT,
	PRIMARY KEY (fecha, codcliente, codarticulo),
	FOREIGN KEY (codcliente) REFERENCES cliente(codigo),
	FOREIGN KEY (codarticulo) REFERENCES articulo(codigo)
);