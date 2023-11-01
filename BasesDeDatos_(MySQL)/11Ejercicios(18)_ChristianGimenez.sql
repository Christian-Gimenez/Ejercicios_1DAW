# 11. Ejercicios de creación de tablas (Ejercicio 18)
# Ejercicio 18
CREATE DATABASE concesionario;
USE concesionario;

CREATE TABLE coche(
	matricula VARCHAR(7) PRIMARY KEY,
	marca VARCHAR(10),
	modelo VARCHAR(10),
	color VARCHAR(10),
	precioHora FLOAT
);

CREATE TABLE cliente(
	codCliente INT PRIMARY KEY,
	dni VARCHAR(9) UNIQUE,
	nombre VARCHAR(20),
	direccion VARCHAR(50),
	telefono INT
);

CREATE TABLE reserva(
	numero INT PRIMARY KEY,
	fechaInicio DATE,
	fechaFin DATE,
	precioTotal FLOAT,
	codCliente INT,
	FOREIGN KEY(codCliente) REFERENCES cliente(codCliente)
);

CREATE TABLE avala(
	avalado INT PRIMARY KEY,
	avalador INT,
	FOREIGN KEY(avalado) REFERENCES cliente(codCliente),
	FOREIGN KEY(avalador) REFERENCES cliente(codCliente)
);

CREATE TABLE incluye(
	numero INT,
	matricula VARCHAR(7),
	litrosGas FLOAT,
	PRIMARY KEY(numero, matricula),
	FOREIGN KEY(numero) REFERENCES reserva(numero),
	FOREIGN KEY(matricula) REFERENCES coche(matricula)
);
