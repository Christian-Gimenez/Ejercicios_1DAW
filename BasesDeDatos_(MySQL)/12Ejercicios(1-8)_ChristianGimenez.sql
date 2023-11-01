# 12. Ejercicios de eliminación y modificación de tablas (todos los ejercicios)
# Ejercicio 1
CREATE DATABASE marcas_DB;
USE marcas_DB;

CREATE TABLE marcas(
	cifm INT AUTO_INCREMENT UNIQUE NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    ciudad VARCHAR(25) NOT NULL,
    PRIMARY KEY(cifm)
);

# Ejercicio 2
ALTER TABLE marcas ADD COLUMN pais VARCHAR(20) NULL AFTER nombre;

# Ejercicio 3
ALTER TABLE marcas DROP COLUMN pais;

# Ejercicio 4
ALTER TABLE marcas CHANGE nombre nombre_coche VARCHAR(20) NOT NULL UNIQUE;

# Ejercicio 5
CREATE INDEX indice_marcas ON marcas(nombre_coche DESC);
-- Crear un indice descendente implica que el índice se ordene de 1..N o de N..1
-- de manera que se puede invertir el orden del indice con DESC (por defecto es ASC)

# Ejercicio 6
DROP INDEX indice_marcas ON marcas;

# Ejercicio 7
CREATE INDEX indice_marcas_ciudades ON marcas(nombre_coche ASC, ciudad DESC);

# Ejercicio 8
CREATE DATABASE edificios;
USE edificios;
CREATE TABLE buildings(
	building_no INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(25) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE rooms(
	room_no INT PRIMARY KEY AUTO_INCREMENT,
    room_name VARCHAR(255) NOT NULL,
    building_no INT NOT NULL,
    FOREIGN KEY(building_no) REFERENCES buildings(building_no) ON DELETE CASCADE
);

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE buildings;