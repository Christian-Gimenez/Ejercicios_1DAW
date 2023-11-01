# 6 Relacion de Ejercicios
# Ejercicio 1. Crea las anteriores tablas e inserta todos los datos en las mismas.
CREATE DATABASE automoviles;
USE automoviles;

CREATE TABLE
 IF NOT EXISTS automoviles.marcas(
cifm int auto_increment unique not null,
nombre varchar(20) not null,
ciudad varchar(25) not null,
primary key(cifm));

CREATE TABLE IF NOT EXISTS automoviles.coches(
codcoche int auto_increment not null,
nombre VARCHAR(10) not null,
modelo varchar(10) not null,
primary key(codcoche));

CREATE TABLE IF NOT EXISTS automoviles.concesionarios(
cifc int auto_increment not null,
nombre varchar(10) not null,
ciudad varchar(25) not null,
primary key(cifc));

CREATE TABLE IF NOT EXISTS automoviles.clientes(
dni varchar(9) not null,
nombre varchar(10) not null,
apellido varchar(40) not null,
ciudad varchar(25) not null,
primary key(dni));

CREATE TABLE IF NOT EXISTS automoviles.distribucion(
cifc int not null,
codcoche int not null,
cantidad smallint unsigned not null,
primary key(cifc, codcoche),
foreign key(cifc) references concesionarios(cifc),
foreign key(codcoche) references coches(codcoche));

CREATE TABLE IF NOT EXISTS automoviles.ventas(
cifc int not null,
dni varchar(9) not null,
codcoche int not null,
color varchar(10) not null,
primary key(cifc, dni, codcoche),
foreign key(cifc) references concesionarios(cifc),
foreign key(dni) references clientes(dni),
foreign key(codcoche) references coches(codcoche));

CREATE TABLE IF NOT EXISTS automoviles.marco(
cifm int not null,
codcoche int not null,
primary key(cifm, codcoche),
foreign key(cifm) references marcas(cifm),
foreign key(codcoche) references coches(codcoche));

INSERT INTO automoviles.marcas (nombre, ciudad)
VALUES
('Seat','Madrid'),
('Renault','Barcelona'),
('Citroen','Valencia'),
('Audi','Madrid'),
('Opel','Bilbao'),
('BMW','Barcelona');

INSERT INTO automoviles.coches (nombre, modelo)
VALUES
('Ibiza','glx'),
('Ibiza','gti'),
('Ibiza','gtd'),
('Toledo','gtd'),
('Córdoba','gti'),
('Megane','1.6'),
('Megane','gti'),
('Laguna','gtd'),
('Laguna','td'),
('ZX','16v'),
('ZX','td'),
('Xantia','gtd'),
('A4','1.8'),
('A4','2.8'),
('Astra','caravan'),
('Astra','gti'),
('Corsa','1.4'),
('300','316i'),
('500','525i'),
('700','750i');

# Tabla CONCESIONARIOS
INSERT INTO automoviles.concesionarios (nombre, ciudad)
VALUES ('acar', 'Madrid'), ('bcar', 'Madrid'), ('ccar', 'Barcelona'),
('dcar', 'Valencia'), ('ecar', 'Bilbao');
# Tabla CLIENTES
INSERT INTO `automoviles`.`clientes`(dni, nombre, apellido, ciudad)
VALUES
(1,
'Luis',
'García',
'Madrid'),
(2,
'Antonio',
'López',
'Valencia'),
(3,
'Juan',
'Martín',
'Madrid'),
(4,
'María',
'García',
'Madrid'),
(5,
'Javier',
'González',
'Barcelona'),
(6,
'Ana',
'López',
'Barcelona');
# Tabla DISTRIBUCIÓN
INSERT INTO automoviles.distribucion (cifc, codcoche, cantidad)
VALUES (1,1,3), (1,5,7), (1,6,7), (2,6,5), (2,8,10), (2,9,10), (3,10,5),
(3,11,3), (3,12,5),
(4,13,10), (4,14,5), (5,15,10), (5,16,20), (5,17,8);

# Tabla VENTAS
INSERT INTO automoviles.ventas(cifc, dni, codcoche, color)
VALUES (1, 1, 1, 'Blanco'), (1, 2, 5, 'Rojo'), (2, 3, 8, 'Blanco'), (2,
1, 6, 'Rojo'),
(3, 4, 11, 'Rojo'), (4, 5, 14, 'Verde');

# Tabla MARCO
INSERT INTO automoviles.marco (cifm, codcoche)
VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
(2, 6), (2, 7), (2, 8), (2, 9), (3, 10), (3, 11),
(3, 12), (3, 13), (4, 14), (5, 15), (5, 16), (5, 17),
(6, 18), (6, 19), (6, 20);
