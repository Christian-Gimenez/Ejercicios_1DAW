# 1
CREATE DATABASE envases_db;
USE envases_db;

#a)
CREATE TABLE envases (
referencia INT PRIMARY KEY,
nombre VARCHAR(6) UNIQUE,
radio_cm FLOAT,
altura_cm FLOAT CHECK(altura_cm > 1)
);

#b)
ALTER TABLE envases CHANGE nombre recipiente VARCHAR(6) UNIQUE;
ALTER TABLE envases ADD INDEX indice_recipiente(recipiente);

#c)
ALTER TABLE envases ADD COLUMN volumen FLOAT;

INSERT INTO envases VALUES(
1, 'Cont1', 5, 4, PI() * POW(5, 2) * 4),
(2, 'Cont2', 2.1, 3, PI() * POW(2.1, 2) * 3),
(3, 'Cont3', 1, 4.5, PI() * POW(1, 2) * 4.5);
UPDATE envases
SET volumen =(PI() * POW(radio_cm, 2) * altura_cm);

#d) Si, el de mayor capacidad es el 1º
SELECT * FROM envases ORDER BY volumen DESC LIMIT 1;
SELECT MAX(volumen) FROM envases;
