CREATE TABLE usuarios( -- Creamos una tabla llamada usuarios
-- creamos la columna id, tipo int que no puede ser null y se auto-incrementa
    id int(11) NOT NULL AUTO_INCREMENT, 
-- creamos la columna nombre, tipo varchar que no puede ser null
    nombre varchar(80) NOT NULL,
-- creamos la columna apellido, tipo varchar que no puede ser null
    apellido varchar(80) NOT NULL,
-- creamos la columna fecha_nacimiento, tipo datetime que SI puede ser null,
    fecha_nacimiento DATETIME NULL,
    
/* indicamos que la llave primaria
* va a ser la columna id
*/
    PRIMARY KEY (id)
);

-- Agregamos una columna a la tabla usuario llamada telefono tipo varchar y puede ser null
ALTER TABLE usuario ADD COLUMN telefono varchar(45) NULL;

ALTER TABLE usuarios DROP telefono;

--
ALTER TABLE usuario ALTER COLUMN telefono varchar(35) NULL;

-- Sirve para eliminar la Tabla exista o no, evitando un error si la misma no existe
DROP TABLE IF EXISTS usuarios; 
