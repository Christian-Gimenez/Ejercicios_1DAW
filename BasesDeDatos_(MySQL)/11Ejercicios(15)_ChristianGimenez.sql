# 11. Ejercicios de creación de tablas (Ejercicio 15)
# Ejercicio 15
CREATE DATABASE direcciones_empleados;
USE direcciones_empleados;

CREATE TABLE region(
	CodRegion INT PRIMARY KEY,
	nombre VARCHAR(20)
);

CREATE TABLE provincia(
	CodProvincia INT PRIMARY KEY,
	nombre VARCHAR(20),
	CodRegion INT,
	FOREIGN KEY(CodRegion) REFERENCES region(CodRegion)
);

CREATE TABLE localidad(
	CodLocalidad INT PRIMARY KEY,
	nombre VARCHAR(20),
	CodProvincia INT,
	FOREIGN KEY(CodProvincia) REFERENCES provincia(CodProvincia)
);

CREATE TABLE empleado(
	id INT PRIMARY KEY,
	dni VARCHAR(9) UNIQUE,
	nombre VARCHAR(20),
	fechaNac DATE,
	telefono INT,
	salario FLOAT,
	CodLocalidad INT,
	FOREIGN KEY(CodLocalidad) REFERENCES localidad(CodLocalidad)
);