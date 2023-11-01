# 11. Ejercicios de creación de tablas (Ejercicio 17)
# Ejercicio 17
CREATE DATABASE montaje_DB;
USE montaje_DB;

CREATE TABLE cliente(
	nif VARCHAR(9) PRIMARY KEY,
	nombre VARCHAR(20),
	direccion VARCHAR(50),
	telefono INT
);

CREATE TABLE montador(
	nif VARCHAR(9) PRIMARY KEY,
	nombre VARCHAR(20),
	direccion VARCHAR(50),
	telefono INT
);

CREATE TABLE modeloDormitorio(
	cod INT PRIMARY KEY
);

CREATE TABLE compra(
	nif_c VARCHAR(9),
	modelo INT,
	fechaCompra DATE,
	PRIMARY KEY(nif_c, modelo, fechaCompra),
	FOREIGN KEY(nif_c) REFERENCES cliente(nif),
	FOREIGN KEY(modelo) REFERENCES modeloDormitorio(cod)
);

CREATE TABLE monta(
	modelo INT,
	nif_m VARCHAR(9),
	fechaMontaje DATE,
	PRIMARY KEY(modelo, nif_m, fechaMontaje),
	FOREIGN KEY(modelo) REFERENCES modeloDormitorio(cod),
	FOREIGN KEY(nif_m) REFERENCES montador(nif)
);