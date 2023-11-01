#1
CREATE DATABASE examen3_db;
USE examen3_db;

CREATE TABLE departamentos(
	codDep INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE alumnos(
codAlu INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20),
apellido VARCHAR(20),
fechaNacimiento DATE,
provincia VARCHAR(20)
);

CREATE TABLE profesores(
	codPro INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20),
    apellido VARCHAR(20),
    categoria ENUM('PS', 'PT'),
    sueldo DECIMAL(6, 2),
    departamento INT NOT NULL,
    FOREIGN KEY(departamento) REFERENCES departamentos(codDep)
    ON UPDATE RESTRICT ON DELETE RESTRICT
);

CREATE TABLE modulos(
	codMod INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20),
    curso INT CHECK (curso = 1 || curso =2),
    horas INT,
    profesor INT,
    FOREIGN KEY(profesor) REFERENCES profesores(codPro)
    ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE matriculas(
	codMat INT PRIMARY KEY AUTO_INCREMENT,
    alumno INT NOT NULL,
    modulo INT NOT NULL,
    nota DECIMAL(3,1) CHECK (nota >= 0.0 && nota <=10.0),
    FOREIGN KEY(alumno) REFERENCES alumnos(codAlu)
    ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY(modulo) REFERENCES modulos(codMod)
    ON UPDATE RESTRICT ON DELETE RESTRICT
);


ALTER TABLE departamentos ADD COLUMN jefe INT AFTER nombre;
ALTER TABLE departamentos ADD FOREIGN KEY(jefe) REFERENCES profesores(codPro)
	ON DELETE RESTRICT ON UPDATE CASCADE;
    
INSERT INTO departamentos(nombre) VALUES ('Informática'), ('Administración'), ('Inglés'), ('RRHH');
INSERT INTO alumnos(nombre, apellido, fechaNacimiento, provincia) VALUES
	('Aarón', 'Rivero', '2000-01-01', 'Madrid'),
  	('Pilar', 'salas', '1999-01-02', 'Madrid'),  
	('Marta', 'Rubio', '2000-01-01', 'Madrid'),
	('Adrián', 'Suárez', '2000-01-01', 'Madrid'),
	('María', 'Loyola', '2000-02-01', 'Toledo'),
	('Adela', 'Santana', '1999-06-01', 'Madrid'),
	('Pepe', 'Ruiz', '2000-06-01', 'Granada'),
	('Daniel', 'Ruiz', '2000-01-02', 'Madrid'),
	('Juan', 'López', '1999-03-01', 'Madrid'),
	('Adolfo', 'Flores', '2000-05-01', 'Barcelona');

INSERT INTO profesores(nombre, apellido, categoria, sueldo, departamento) VALUES
	('Daniel', 'Sáez', 'PS', 3000, 1),
    ('Marta', 'Vega', 'PT', 2500, 1),
    ('Ángeles', 'Martín', 'PS', 2500, 1),
    ('Manuel', 'Carretero', 'PS', 2000, 1),
    ('María', 'Sánchez', 'PT', 2000, 1),
    ('Sergio', 'Garrido', 'PS', 3000, 2),
    ('Alfredo', 'Ruiz', 'PS', 3000, 3)
;

INSERT INTO modulos(nombre, curso, horas, profesor) VALUES
	('SI', 1, 6, 2),
	('BD', 1, 6, 1),
	('Pro', 1, 8, 3),
    ('LM', 1, 4, 1),
    ('ED', 1, 3, 3),
    ('AD', 2, 6, 5),
    ('DI', 2, 6, 2),
    ('PMM', 2, 4, 1),
    ('PSP', 2, 4, 3),
    ('SGE', 2, 5, 6),
    ('FOL', 1, 3, 6),
    ('I', 2, 2, 7);

INSERT INTO matriculas(alumno, modulo, nota) VALUES
	(1, 1, 7.5),(1, 2, 8.0),(1, 3, 6.0),(1, 4, 5.0),(2, 1, 4.5),
    (2, 3, 2.0),(2, 4, 3.0),(3, 11, 6.5),(3, 3, 8.0),(4, 4, 9.0),
	(4, 6, 10.0),(5, 7, 8.0),(5, 8, 5.3),(5, 10, 8.4),(6, 3, 1.5),
    (6, 12, 6.0),(6, 8, 8.6),(7, 3, 6.4),(8, 6, 3.3),(8, 7, 2.5),
    (8, 8, 8.4),(9, 1, 7.0),(10, 1, 6.4),(10, 12, 5.0);
    
UPDATE departamentos SET jefe = (SELECT codPro FROM profesores WHERE codPro = 1) WHERE codDep = 1;
UPDATE departamentos SET jefe = (SELECT codPro FROM profesores WHERE codPro = 6) WHERE codDep = 2;
UPDATE departamentos SET jefe = 7 WHERE codDep = 3;

UPDATE profesores SET sueldo = 2500 WHERE nombre LIKE 'Manuel' AND apellido LIKE 'Carretero';
SELECT * FROM profesores WHERE nombre LIKE 'Manuel' AND apellido LIKE 'Carretero';

SELECT DISTINCT matr.alumno FROM matriculas matr;

SELECT m.nombre, m.horas FROM modulos m ORDER BY m.horas DESC LIMIT 3;

SELECT m.nombre, m.horas FROM modulos m ORDER BY m.horas DESC LIMIT 3;

SELECT a.*, CONCAT(p.nombre, " ", p.apellido) 'profesora', mo.nombre 'modulo', matr.nota 'nota'
FROM profesores p
INNER JOIN modulos mo ON mo.profesor = p.codPro
INNER JOIN matriculas matr ON mo.codMod = matr.modulo
INNER JOIN alumnos a ON a.codAlu = matr.alumno
WHERE p.nombre = 'Ángeles' AND p.apellido = 'Martín';

SELECT p.*, mo.nombre 'modulo impartido' FROM profesores p
LEFT JOIN modulos mo ON p.codPro = mo.profesor;

SELECT d.*, IFNULL(CONCAT(p.nombre, " ", p.apellido), 'Sin Jefe') 'Nombre Jefe'
FROM profesores p
RIGHT JOIN departamentos d ON d.jefe = p.codPro;

SELECT CONCAT(a.nombre, ' ', a.apellido) 'alumno', CONCAT(p.nombre, ' ', p.apellido) 'profesora',
mo.nombre 'modulo', matr.nota 'nota' FROM alumnos a
INNER JOIN matriculas matr ON a.codAlu = matr.alumno
INNER JOIN modulos mo ON mo.codMod = matr.modulo
INNER JOIN profesores p ON p.codPro = mo.profesor
WHERE p.nombre LIKE 'Ángeles' AND p.apellido LIKE 'Martín';

SELECT COUNT(*) 'Nº Modulos de Pepe Ruiz' FROM matriculas matr
INNER JOIN alumnos a ON matr.alumno = a.codAlu
INNER JOIN modulos mo ON matr.modulo = mo.codMod
WHERE a.nombre = 'Pepe' AND a.apellido = 'Ruiz';


SELECT mo.nombre, mo.horas, CONCAT(a.nombre, ' ', a.apellido) 'alumna'
FROM modulos mo INNER JOIN matriculas matr ON mo.codMod = matr.modulo
INNER JOIN alumnos a ON matr.alumno = a.codAlu
WHERE a.nombre = 'María' AND a.apellido = 'Loyola'
ORDER BY mo.horas LIMIT 1;

SELECT SUM(horas_1) '1ºCurso', SUM(horas_2) '2ºCurso', horas_1+horas_2 'Suma total de horas'
FROM (SELECT horas FROM modulos WHERE curso = 1) AS horas_1, (SELECT horas FROM modulos WHERE curso = 2) AS horas_2;

SELECT
	(SELECT SUM(horas) FROM modulos WHERE curso = 1) 'Horas 1º',
	(SELECT SUM(horas) FROM modulos WHERE curso = 2) 'Horas 2º',
    SUM(horas) 'Horas totales'
FROM modulos;

SELECT a.*, (SELECT COUNT(*) FROM alumnos a2
			INNER JOIN matriculas matr ON matr.alumno = a2.codAlu
            WHERE a.codAlu = a2.codAlu) 'Modulos matriculados'
FROM alumnos a;

SELECT a.*, (SELECT SUM(mo.horas) FROM alumnos a2
INNER JOIN matriculas matr ON a2.codAlu = matr.alumno
INNER JOIN modulos mo ON mo.codMod = matr.modulo
WHERE a.codAlu = a2.codAlu)'horas totales'
FROM alumnos a;

SELECT a.*, mo.nombre 'modulo' , mo.horas FROM alumnos a
INNER JOIN matriculas matr ON a.codAlu = matr.alumno
INNER JOIN modulos mo ON mo.codMod = matr.modulo; 

SELECT a.*, (SELECT AVG(nota) FROM modulos mo
			INNER JOIN matriculas matr ON mo.codMod = matr.modulo
            INNER JOIN alumnos a2 ON matr.alumno = a2.codAlu
            WHERE a.codAlu = a2.codAlu) 'Nota media'
FROM alumnos a;