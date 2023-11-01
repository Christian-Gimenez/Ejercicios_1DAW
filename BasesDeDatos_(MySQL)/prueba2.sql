-- CREAMOS la DB curso
CREATE DATABASE curso;

-- También podemos poner antes USE curso;
USE curso;
-- CREAMOS la TABLA usuarios dentro de la DB curso
CREATE TABLE curso.usuarios ( 
	id int(11) NOT NULL AUTO_INCREMENT,
    nombre varchar(80) NOT NULL,
    apellido varchar(80) NOT NULL,
    fecha_nacimiento DATETIME NULL,
    PRIMARY KEY (id)
);

-- BORRAMOS la TABLA
DROP TABLE IF EXISTS usuarios; 

-- CREAMOS en la tabla usuarios la COLUMNA telefono
ALTER TABLE usuarios ADD COLUMN telefono varchar(45) NULL;

-- MODIFICAMOS la COLUMNA telefono de la tabla usuarios para que sea varchar(30)
ALTER TABLE usuarios MODIFY COLUMN telefono varchar(30) NULL;

-- AGREGAMOS informacion a la TABLA
-- INSERTAMOS en la TABLA usuarios
INSERT INTO usuarios (
nombre, apellido, fecha_nacimiento, telefono) -- en los campos especificados
VALUES ('Christian', 'Gimenez', '1995-09-29 10:00:00', '643673282'); -- Estos valores

INSERT INTO usuarios (nombre, apellido, fecha_nacimiento, telefono)
VALUES ('Laura', 'Molina', '1996-08-03 10:00:00', '605940048');

-- ELIMINAMOS de la tabla usuarios donde el ID sea 1
DELETE FROM usuarios WHERE id = '1';

-- MODIFICAR/ACTUALIZAR los DATOS de la TABLA usuarios donde el ID SEA 1
UPDATE usuarios
SET nombre = 'Pepe', -- Pon el nombre Pepe
apellido = 'Angelini' -- El apellido Angelini
WHERE id = '1'; -- Donde el id sea 1

-- CONSULTAR DATOS
-- BUSCAR TODOS los usuarios
SELECT * FROM usuarios;
-- BUSCAR el Usuario con ID 1
SELECT * FROM usuarios WHERE id = '1';

-- BUSCAR el nombre y apellido del Usuario con ID 1:
SELECT nombre, apellido FROM usuarios WHERE id = '1';

-- Buscar el nombre 'Laura' que tenga tambien el apellido 'Molina' de la tabla usuarios
SELECT * FROM usuarios WHERE nombre = 'Laura' AND apellido = 'Molina';

-- Busca el telefono '605..' o el telefono '643...' de la tabla usuarios
SELECT * FROM usuarios WHERE telefono = '605940048' OR telefono = '643673282';

-- Cuénta cuantos registros hay donde nombre sea 'Christian' O apellido sea 'Molina'
SELECT COUNT(*) AS 'Cantidad' FROM usuarios
WHERE nombre = 'Christian' OR apellido = 'Molina'; -- Devuelve 2

-- Cuenta cuantos registros hay donde apellido sea 'Gimenez' Y telefono sea '643...'
SELECT COUNT(*) AS 'Cantidad' FROM usuarios
WHERE apellido = 'Gimenez' AND telefono = '643673282'; -- Devuelve 1

-- Busca los nombres que empiecen por 'Chr' en la tabla usuarios
SELECT * FROM usuarios
WHERE nombre LIKE 'Chri%';

-- Busca los apellidos que contengan 'olin' en la tabla usuarios
SELECT * FROM usuarios
WHERE apellido LIKE '%olin%';

-- Busca los telefonos que acaben en '82' en la tabla usuarios
SELECT * FROM usuarios
WHERE telefono LIKE '%82';

-- Creamos otra tabla llamada publicaciones
CREATE TABLE publicaciones (
	id int(11) NOT NULL AUTO_INCREMENT,
    autor_id int(11) NOT NULL,
    titulo varchar(150) NOT NULL,
    texto text NOT NULL,
    PRIMARY KEY (id),
    -- La llave foránea sera autor_id y hará referencia al id de la tabla usuarios
    FOREIGN KEY (autor_id) REFERENCES usuarios(id)
);
ALTER TABLE publicaciones MODIFY COLUMN titulo varchar(150) NOT NULL;
ALTER TABLE publicaciones MODIFY COLUMN texto text NOT NULL;

INSERT INTO publicaciones (autor_id, titulo, texto)
VALUES (2, 'Curso de SQL', 'En este curso...');

INSERT INTO publicaciones (autor_id, titulo, texto)
VALUES (4, 'Curso JavaScript', 'La declaracion de variables...');

-- CONSULTAS COMPLEJAS
-- Seleccionamos todas * las columnas que hay dentro de publicaciones
SELECT p.*,
-- Concatenamos el nombre + ' ' + apellido para mostrarlo como autor
CONCAT(u.nombre, ' ', u.apellido) as 'autor'
-- Desde la tabla publicaciones y usuarios (abreviando ambas a p y u respectivamente)
FROM publicaciones p, usuarios u
-- Para darle lógica a la consulta, indicamos con WHERE que de publicaciones/autor_id
WHERE p.autor_id = u.id; -- Tiene que ser == a usuarios/id

-- Para mostrar lo mismo que antes pero omitiendo el autor_id (porque es info irrelevante)
SELECT p.id, p.titulo, p.texto, -- Especificamos concretamente qué columnas de publicaciones mostrar
CONCAT(u.nombre, ' ', u.apellido) as 'autor' -- concatenamos de nuevo como autor etc.
FROM publicaciones p, usuarios u
WHERE p.autor_id = u.id;

-- Si hacemos lo anterior sin concatenar nombre y apellido con CONCAT() seria asi:
SELECT p.id,
p.titulo,
p.texto,
u.nombre,
u.apellido -- saldria separado en el orden que lo ponemos
FROM publicaciones p, usuarios u
WHERE p.autor_id = u.id;

-- UTILIZACION DE JOIN para aprovechar las FOREIGN KEY
SELECT p.id, p.titulo, p.texto,
CONCAT(u.nombre, ' ', u.apellido) AS 'autor'
-- Usamos INNER JOIN para la unión de ambas tablas
FROM publicaciones p INNER JOIN usuarios u 
-- Y en vez de WHERE, usamos ON para aplicar la conexion
ON p.autor_id = u.id;

CREATE TABLE productos (
	id int(11) NOT NULL AUTO_INCREMENT,
    nombre varchar(100),
    precio Double,
    PRIMARY KEY (id)
);

INSERT INTO productos (nombre, precio)
VALUES ('pantuflas', '8');

SELECT COUNT(*) FROM productos; -- Nos muestra cuantos productos tenemos
SELECT MAX(precio) FROM productos; -- Nos muestra el precio más caro
SELECT MIN(precio) FROM productos; -- Nos muestra el precio más barato
SELECT AVG(precio) FROM productos; -- Nos muestra promedio/media aritmética de precio
SELECT SUM(precio) FROM productos; -- Nos muestra la suma total de todos los precios

-- SUB CONSULTAS
-- Consultamos de la DB curso en la tabla publicaciones donde la tabla id_autor sea 1, 2, 3, y/o 4
SELECT * FROM curso.publicaciones WHERE autor_id IN(1, 2, 3, 4);

-- Hacemos lo anterior pero dandole logica al IN()
SELECT * FROM curso.publicaciones WHERE autor_id IN(
	-- Pidiendo que seleccione la columna id de la tabla usuarios de la DB curso
	SELECT id FROM curso.usuarios
);

-- Lo mismo pero especificando que el nombre del usuario empiece por L
SELECT * FROM curso.publicaciones WHERE autor_id IN(
	SELECT id FROM curso.usuarios WHERE nombre LIKE 'L%'
);

-- Igual pero que me traiga todo salvo los usuarios cuyo nombre empeice por L
SELECT * FROM curso.publicaciones WHERE autor_id NOT IN(
	SELECT id FROM curso.usuarios WHERE nombre LIKE 'L%'
);

-- CONCATENAR 2 O MÁS CONSULTAS DISTINTAS
SELECT * FROM curso.usuarios WHERE nombre LIKE 'L%'
UNION
SELECT * FROM curso.usuarios WHERE nombre LIKE 'C%';

-- Agrupamos la consulta para que no se repita lo pedido
SELECT * FROM curso.usuarios GROUP BY nombre;

-- Contamos y agrupamos por mes
SELECT COUNT(*) AS cantidad, MONTH(fecha_nacimiento) AS mes
FROM curso.usuarios GROUP BY MONTH(fecha_nacimiento);








