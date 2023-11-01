# 11. Ejercicios de creación de tablas (Ejercicio 16)
# Ejercicio 16
CREATE DATABASE empresa;
USE empresa;

CREATE TABLE empleado(
	id INT PRIMARY KEY,
	dni VARCHAR(9) UNIQUE,
	nombre VARCHAR(20),
	salario FLOAT,
	telefono INT,
	idDep INT
);

CREATE TABLE departamento(
	id INT PRIMARY KEY,
	nombre VARCHAR(20),
	ubicacion VARCHAR(20),
	idJefe INT UNIQUE
);

ALTER TABLE empleado ADD FOREIGN KEY(idDep) REFERENCES departamento(id);
ALTER TABLE departamento ADD FOREIGN KEY(idJefe) REFERENCES empleado(id);