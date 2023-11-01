CREATE DATABASE prueba;
USE prueba;
CREATE TABLE pru(
	cod INT PRIMARY KEY,
	dato CHAR(10));
    
CREATE TABLE alumnos(
	n_matricula INT,
    nombre VARCHAR(40),
    dni NUMERIC(8));

CREATE TABLE alumnos1(
	n_matricula NUMERIC(5),
    nombre VARCHAR(40),
    dni NUMERIC(8) UNIQUE NOT NULL);
    
CREATE TABLE alumnos2(
	n_matricula NUMERIC(5) PRIMARY KEY,
    nombre VARCHAR(40),
    dni NUMERIC(8) UNIQUE NOT NULL);
    
CREATE TABLE alumnos3(
	n_matricula NUMERIC(5) PRIMARY KEY,
    nombre VARCHAR(40),
    dni NUMERIC(8) UNIQUE NOT NULL,
    cp NUMERIC(5) CHECK (cp >= 28000 AND cp <= 28999));
    
CREATE TABLE usuarios(
	n_usuario NUMERIC(4) PRIMARY KEY,
    nom_usuario VARCHAR(15) NOT NULL,
    id_usuario VARCHAR(5) UNIQUE,
    tipo CHAR(1) CHECK(tipo IN ('A', 'B')));
    
    
CREATE TABLE editorial(
	cod_edi INT PRIMARY KEY,
    nom_edi CHAR(9)
);

    
CREATE TABLE documento(
	tipo ENUM('A', 'B'),
    cod_doc CHAR(4),
    titulo VARCHAR(25) NOT NULL,
	idioma VARCHAR(20),
    num_edi INT,
    anno YEAR,
    isbn NUMERIC(10) UNIQUE,
    PRIMARY KEY(tipo, cod_doc),
    FOREIGN KEY (num_edi) REFERENCES editorial(cod_edi)
);

CREATE TABLE socios (
	socio_no INT PRIMARY KEY,
    apellidos VARCHAR(14) NOT NULL UNIQUE,
    telefono NUMERIC(9) NOT NULL,
    fecha_alta DATE DEFAULT('2022-01-01'),
    direccion VARCHAR(20),
    codigo_postal NUMERIC(5)
);

CREATE TABLE prestamos (
	num_prestamo SMALLINT PRIMARY KEY,
    socio_num INT,
    FOREIGN KEY(socio_num) REFERENCES socios(socio_no) ON UPDATE SET NULL ON DELETE RESTRICT
);
ALTER TABLE prestamos ADD CONSTRAINT socio_num FOREIGN KEY (socio_num) REFERENCES socios(socio_no) ON UPDATE SET NULL ON DELETE RESTRICT;

CREATE TABLE pedidos (
	num_pedido INT PRIMARY KEY AUTO_INCREMENT,
    fecha_pedido DATE,
    cliente VARCHAR(20),
    cod_vend INT NOT NULL,
    fabrica VARCHAR(20),
    producto VARCHAR(20),
    importe DECIMAL(3, 2)
);

CREATE TABLE clientes (
	cod_cli INT PRIMARY KEY,
    nombre VARCHAR(20)
);

CREATE TABLE vendedores(
	id_vend INT PRIMARY KEY,
    nombre VARCHAR(20)
    );

CREATE TABLE fabricantes(
	id_fab INT PRIMARY KEY,
    nombre VARCHAR(20)
);
    
CREATE TABLE productos (
	id_prod INT,
    id_fab INT,
    PRIMARY KEY(id_prod, id_fab)
);

CREATE TABLE pedidos1 (
	num_pedido INT PRIMARY KEY AUTO_INCREMENT,
    fecha_pedido DATE,
    cliente INT NOT NULL,
    cod_vend INT NOT NULL,
    fabrica INT NOT NULL,
    producto INT NOT NULL,
    importe DECIMAL(3, 2),
    FOREIGN KEY(cliente) REFERENCES clientes(cod_cli),
    FOREIGN KEY(cod_vend) REFERENCES vendedores(id_vend),
    FOREIGN KEY(producto, fabrica) REFERENCES productos(id_prod, id_fab)
);

CREATE TABLE IF NOT EXISTS socios_mod LIKE socios;