# 11. Ejercicios de creación de tablas (del ejercicio 9 al 12)
CREATE DATABASE libreria;
USE libreria;

# Ejercicio 9
CREATE TABLE autor(
	aut_id VARCHAR(8) NOT NULL,
	aut_nombre VARCHAR(50) NOT NULL,
	pais VARCHAR(25) NOT NULL,
	ciudad VARCHAR(25) NOT NULL
);

# Ejercicio 10
CREATE TABLE libros(
	id VARCHAR(15) PRIMARY KEY,
	nombre VARCHAR(50),
	isbn VARCHAR(15) NOT NULL UNIQUE,
	num_paginas INT(5) UNSIGNED, -- También se puede usar con CHECK(num_paginas > 0)
	precio FLOAT(8,2)
);

# Ejercicio 11
CREATE TABLE autores(
	id VARCHAR(8),
	nombre VARCHAR(50) NOT NULL,
	pais ENUM('USA', 'UK', 'India') NOT NULL, -- No me deja poner VARCHAR porque el tipo de dato es ENUM
	ciudad VARCHAR(25),
	PRIMARY KEY(id, ciudad)
);

# Ejercicio 12
CREATE TABLE editorial(
	id VARCHAR(8) PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	pais VARCHAR(25) NOT NULL DEFAULT 'desconocido',
	num_sucursales INT CHECK(num_sucursales < 100)
);