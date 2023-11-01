# Ejercicio 1
CREATE DATABASE automoviles;
USE automoviles;

# Ejercicio 2
CREATE TABLE marcas(
cifm INT PRIMARY KEY,
nombre VARCHAR(20),
modelo VARCHAR(20)
);

# Ejercicio 3
CREATE TABLE coches(
codcoche INT PRIMARY KEY,
nombre VARCHAR(20),
modelo VARCHAR(20)
);

# Ejercicio 4
CREATE TABLE concesionarios(
cifc INT PRIMARY KEY,
nombre VARCHAR(20),
ciudad VARCHAR(20)
);

# Ejercicio 5
CREATE TABLE clientes(
dni INT PRIMARY KEY,
nombre VARCHAR(20),
apellidos VARCHAR(40),
ciudad VARCHAR(20)
);

# Ejercicio 6
CREATE TABLE distribucion(
cifc INT,
codcoche INT,
cantidad INT,
PRIMARY KEY(cifc, codcoche),
FOREIGN KEY(cifc) REFERENCES concesionarios(cifc),
FOREIGN KEY(codcoche) REFERENCES coches(codcoche)
);
# 11. Ejercicios de creación de tablas (del ejercicio 1 al 8, y también el ejercicio 13)
# Ejercicio 7
CREATE TABLE ventas(
	cifc INT,
	dni INT,
	codcoche INT,
	PRIMARY KEY(cifc, dni, codcoche),
	FOREIGN KEY(cifc) REFERENCES concesionarios(cifc),
	FOREIGN KEY(dni) REFERENCES clientes(dni),
	FOREIGN KEY(codcoche) REFERENCES coches(codcoche)
);

# Ejercicio 8
CREATE TABLE marco(
	cifm INT,
	codcoche INT,
	PRIMARY KEY(cifm, codcoche),
	FOREIGN KEY(cifm) REFERENCES marcas(cifm),
	FOREIGN KEY(codcoche) REFERENCES coches(codcoche) 
);

# Ejercicio 13
ALTER TABLE marco DROP FOREIGN KEY marco_ibfk_2,
ADD FOREIGN KEY(codcoche) REFERENCES coches(codcoche) ON UPDATE CASCADE;
