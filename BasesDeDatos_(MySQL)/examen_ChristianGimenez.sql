# Christian Miguel Giménez Puerma 1ºDAW
# 1
SELECT a.nombre 'Nombre', a.FNacimiento 'Fecha Nacimiento', a.Nacionalidad 'Nacionalidad'
FROM actores a
WHERE a.FNacimiento > '1965-12-31'
AND (a.Nacionalidad LIKE 'Argentina'
    OR a.Nacionalidad LIKE 'Espanna');

# 2
SELECT d.nombre 'Nombre', d.Nacionalidad 'Nacionalidad', d.cache 'Cache'
FROM directores d
INNER JOIN peliculas p
ON d.codDirec = p.director
ORDER BY d.Nacionalidad ASC, d.cache DESC;

# 3
SELECT p.Titulo 'Titulo', p.fechaEstreno 'Fecha de Estreno'
FROM peliculas p
INNER JOIN directores d
ON d.codDirec = p.director
WHERE d.Nacionalidad != 'Espanna'
LIMIT 5;

# 4
SELECT AVG(a.Cache) 'Valor Medio Cache de Actores Españoles'
FROM actores a 
WHERE a.Nacionalidad LIKE 'Espanna'
AND a.Nacionalidad > '1975-12-31';

# 5
SELECT COUNT(*) 'Nº Actores EEUU con Cache > Media de Directores'
FROM actores a 
WHERE a.Nacionalidad LIKE 'Estados Unidos'
AND a.Cache > (SELECT AVG(d.Cache)
                FROM directores d);

# 6
SELECT p.Genero 'Genero', MAX(p.taquilla) 'Recaudación máxima'
FROM peliculas p
GROUP BY p.Genero;

# 7 
# Nota: Como muchas veces me fallan las subconsultas con más de 1 campo
# en vez de poner SELECT d.nacionalidad, AVG(d.cache) y hacer un GROUP BY d.nacionalidad
# Opté por hacer otra subconsulta que me devuelva cada nacionalidad
# de manera que se seleccione cada AVG(cache) de cada nacionalidad
# y así pdoer comparar con el SELECT principal.
SELECT d.Nacionalidad 'Nacionalidad'
FROM directores d
WHERE AVG(d.Cache) > (SELECT AVG(d2.Cache)
                    FROM directores d2
                    WHERE d2.Nacionalidad IN(SELECT DISTINCT d3.nacionalidad
                                            FROM directores d3
                                            )
                    );

# 8
SELECT d.Nombre 'Nombre', d.Cache 'Cache'
FROM directores d
WHERE d.Nacionalidad LIKE 'Espanna'
AND d.CodDirec IN (SELECT p.Director
                    FROM peliculas p
                    WHERE p.fechaEstreno > '1999-12-31');

# 9
SELECT a.Nombre 'Nombre', a.Nacionalidad 'Nacionalidad'
FROM actores a
INNER JOIN ActoresPelicula ap
ON a.codActor = ap.CodActor
INNER JOIN peliculas p
ON ap.codPeli = p.codPelicula
WHERE p.nacionalidad LIKE 'Espanna';

# 10
SELECT a.nombre 'Nombre', a.Cache 'Cache',
IFNULL(p.codPelicula,'No participó en ninguna') 'Código Película'
FROM actores a
LEFT JOIN ActorPelicula ap
ON a.codActor = ap.codPeli;

# 11
CREATE TABLE manager(
    id_manager INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) UNIQUE NOT NULL,
    direccion CHAR(50)
);

# 12
# Nota: Lo realicé en dos sentencias, primero añadi la columna
# y luego añadí la FK por que no sé si hacerlo de una sola vez funciona
ALTER TABLE actores ADD COLUMN cod_manager INT AFTER cache;
ALTER TABLE empleados ADD FOREIGN KEY(cod_manager)
REFERENCES manager(id_manager)
ON UPDATE CASCADE ON DELETE RESTRICT;

# 13
ALTER TABLE ActorPelicula
DROP COLUMN papel;

# 14
INSERT INTO directores(Nombre, Fnacimiento, LNacimiento, Nacionalidad, Cache)
VALUES ('Alex de la Iglesia', '1965-12-04', 'Bilbao', 'Espanna', NULL);

# 15
DELETE FROM peliculas 
WHERE director IN (SELECT d.codDirec
                    FROM directores d
                    WHERE d.Nacionalidad
                    LIKE 'Alemania');

# 16
UPDATE directores d
SET d.cache = d.cache + (d.cache * 0.1)
WHERE d.Nacionalidad LIKE 'Espanna'
AND d.cache < (SELECT AVG(d2.cache)
                FROM directores d2);

# 17
CREATE TABLE valores_calculados AS
SELECT MAX(a.cache) 'Cache Máximo', MIN(a.cache) 'Cache Mínimo',
AVG(a.cache) 'Cache Medio', a.nacionalidad 'Nacionalidad'
FROM actores a
GROUP BY a.nacionalidad;

# 18
CREATE VIEW datos_no_confidenciales AS
SELECT a.Codigo 'Codigo', a.Nombre 'Nombre',
a.LNacimiento 'LNacimiento', a.Nacionalidad 'Nacionalidad'
FROM actores a
WHERE a.FNacimiento > '1960-12-31';

# 19 - 1ª Parte
CREATE VIEW caches_medios_directores AS
SELECT AVG(d.Cache) 'Cache_Medio', d.Nacionalidad 'Nacionalidad'
GROUP BY d.nacionalidad;
# 19 - 2ª Parte
SELECT MIN(Cache_Medio)
FROM cachas_medios_directores;

# 20
CREATE INDEX indx_genero ON Peliculas(genero);

