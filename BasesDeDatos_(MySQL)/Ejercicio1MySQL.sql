CREATE DATABASE colegio;
USE colegio;

CREATE TABLE alumno(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(25) NOT NULL,
apellido1 VARCHAR(25) NOT NULL,
apellido2 VARCHAR(25) NULL,
fecha_nacimiento DATE NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE asignatura(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(25) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE nota(
id INT AUTO_INCREMENT NOT NULL,
asignatura_id INT AUTO_INCREMENT NOT NULL,
calificacion FLOAT NULL,
fecha_examen DATE NULL,
convocatoria INT,
alumno_id INT AUTO_INCREMENT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(asignatura_id) REFERENCES asignatura(id),
FOREIGN KEY(alumno_id) REFERENCES alumno(id)
);

CREATE TABLE labor_extra(
id INT AUTO_INCREMENT NOT NULL,
nombre VARCHAR(25),
alumno_id INT AUTO_INCREMENT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(alumno_id) REFERENCES alumno(id)
);

