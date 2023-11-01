CREATE DATABASE ventas2;
USE ventas2;
# Tabla DEPARTAMENTOS
CREATE TABLE departamentos (
	dep_no NUMERIC(2) PRIMARY KEY,
    dnombre VARCHAR(20),
    localidadd VARCHAR(30)
);
    
# Tabla PRODUCTOS
CREATE TABLE productos (
	producto_no NUMERIC(2) PRIMARY KEY,
    descripcion VARCHAR(50),
    precio DECIMAL(8, 2),
    stock INT
);
    
# Tabla EMPLEADOS
CREATE TABLE empleados (
	emp_no NUMERIC(4) PRIMARY KEY,
    apellido VARCHAR(30),
    oficio VARCHAR(10),
    director NUMERIC(4),
    fecha_alta DATE,
    salario DECIMAL(6,2),
    comision DECIMAL(6,2),
    dep_no NUMERIC(2),
    FOREIGN KEY (director) REFERENCES empleados(emp_no),
    FOREIGN KEY (dep_no) REFERENCES departamentos(dep_no)
);

ALTER TABLE empleados MODIFY dep_no NUMERIC(2);

# Tabla CLIENTES
CREATE TABLE clientes (
	cli_no NUMERIC(3) PRIMARY KEY,
    nombre VARCHAR(50),
    localidad VARCHAR(30),
    vendedor_no NUMERIC(4),
    debe DECIMAL(8,2),
    haber DECIMAL(8,2),
    lim_credito DECIMAL(8,2),
    FOREIGN KEY (vendedor_no) REFERENCES empleados(emp_no)
);

# Tabla PEDIDOS
CREATE TABLE pedidos (
	pedido_no NUMERIC(4) PRIMARY KEY,
    producto_no NUMERIC(2),
    cli_no NUMERIC(3),
    unidades INT,
    fecha DATE,
    FOREIGN KEY (producto_no) REFERENCES productos(producto_no),
    FOREIGN KEY(cli_no) REFERENCES clientes(cli_no)
);
	