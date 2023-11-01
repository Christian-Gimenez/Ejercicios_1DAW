CREATE SCHEMA Programas_Software;

USE Programas_Software;

CREATE TABLE IF NOT Exists Fabricantes(
	IDFab INT AUTO_INCREMENT,
    Nombre VARCHAR (20) NOT NULL UNIQUE,
    Pais VARCHAR (20) NOT NULL,
    CONSTRAINT ´PK_Fabricantes´ PRIMARY KEY (IDFab)
) ENGINE InnoDB;

CREATE TABLE IF NOT Exists Programas(
	Codigo INT AUTO_INCREMENT,
    Nombre VARCHAR (20) NOT NULL,
    Version VARCHAR (20),
    CONSTRAINT ´PK_Programas´ PRIMARY KEY (Codigo)
) ENGINE InnoDB;

CREATE TABLE IF NOT Exists Comercios(
	CIF INT AUTO_INCREMENT,
    Nombre VARCHAR (20) NOT NULL,
    Ciudad VARCHAR (20),
    CONSTRAINT ´PK_Comercios´ PRIMARY KEY (CIF)
) ENGINE InnoDB;

CREATE TABLE IF NOT Exists Clientes(
	DNI INT AUTO_INCREMENT,
    Nombre VARCHAR (20) NOT NULL,
    Edad TINYINT UNSIGNED,
    CONSTRAINT ´PK_Clientes´ PRIMARY KEY (DNI)
) ENGINE InnoDB;

CREATE TABLE IF NOT Exists Registra(
	CIF INT,
    DNI INT,
    Codigo INT,
    Medio VARCHAR(20) NOT NULL,
    CONSTRAINT ´PK_Registra´ PRIMARY KEY (CIF, DNI,Codigo),
    CONSTRAINT FOREIGN KEY (CIF) REFERENCES Comercios (CIF),
    CONSTRAINT FOREIGN KEY (DNI) REFERENCES Clientes (DNI),
    CONSTRAINT FOREIGN KEY (Codigo) REFERENCES Programas (Codigo)
) ENGINE InnoDB;

CREATE TABLE IF NOT Exists Desarrolla(
	IDFab INT,
    Codigo INT,
    CONSTRAINT ´PK_Desarrolla´ PRIMARY KEY (IDFab,Codigo),
    CONSTRAINT FOREIGN KEY (IDFab) REFERENCES Fabricantes (IDFab),
    CONSTRAINT FOREIGN KEY (Codigo) REFERENCES Programas (Codigo)
) ENGINE InnoDB;

CREATE TABLE IF NOT Exists Distribuye(
	CIF INT,
    Codigo INT,
    Cantidad TINYINT UNSIGNED,
    CONSTRAINT ´PK_Distribuye´ PRIMARY KEY (CIF, Codigo),
    CONSTRAINT FOREIGN KEY (CIF) REFERENCES Comercios (CIF),
    CONSTRAINT FOREIGN KEY (Codigo) REFERENCES Programas (Codigo)
) ENGINE InnoDB;

# INSERT
USE Programas_Software;

INSERT INTO fabricantes (Nombre, Pais)
VALUES ('Oracle','EEUU'),('Microsoft','EEUU'),('IBM','EEUU'),('Dynamic','España'),('Borland','EEUU'),('SYSMANTEC','EEUU'); 

INSERT INTO Programas (Nombre, Version)
VALUES ('Aplication Server','9I'),('Data Base','8I'),('Data Base','9I'),('Data Base','10G'),('Developer','6I'),('Access','97'),('Access','2000'),
('Access','XP'),('Windows','98'),('Windows','XP Professional'),('Windows','XP Home'),('Windows','10'),('Norton Internet','2004'),('Norton Internet','2000'),
('Freddy Hardest','2'),('Paradox','5.5'),('C++ Builder','2.0'),('DB/2','1.0'),('OS/2','X'),('JBuilder','1.0');

INSERT INTO Comercios (Nombre, Ciudad)
VALUES ('El Corte Inglés','Sevilla'),('El Corte Inglés','Madrid'),('JUMP','Valencia'),
('Centro MAIL','Sevilla'),('FNAC','Barcelona');

INSERT INTO Clientes (Nombre, Edad)
VALUES ('Pepe Pérez',45),('Juan González',45),('María Gómez',33),('Javier Casado',18),('Nuria Sánchez',29),('Antonio Navarro',58);


INSERT INTO Registra (CIF, DNI, Codigo, Medio)
VALUES (1,1,1,'Internet'),(1,3,4,'Tarjeta Postal'),(4,2,10,'Teléfono'),(4,1,10,'Tarjeta Postal'),(5,2,12,'Internet'),(2,4,15,'Internet');


INSERT INTO Desarrolla (IDFab, Codigo)
VALUES (1,1), (1,2), (1,3), (1,4), (1,5), (2,6), (2,7), (2,8), (2,9), (2,10), (2,11), (2,12), (6,13), (4,14), (5,15), 
(5,16), (3,17), (3,18), (5,19), (4,20);

INSERT INTO Distribuye (CIF, Codigo, Cantidad)
VALUES (1,1,10), (1,2,11), (1,6,5), (1,7,3), (1,10,5), (1,13,7), (2,1,6), (2,2,6), (2,6,4), (2,7,7), (3,10,8),
(3,13,5), (4,14,3), (4,20,6), (5,15,8), (5,16,2), (5,17,3), (5,19,6), (5,8,8);