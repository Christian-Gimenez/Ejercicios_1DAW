#PARTE 2
CREATE DATABASE campeonato_db;
USE campeonato_db;

CREATE TABLE CAMPEONATO (
Id INTEGER PRIMARY KEY,
nombre VARCHAR(15) NOT NULL,
apellido VARCHAR(20) NOT NULL,
prueba_1 float NOT NULL,
prueba_2 float NOT NULL,
fecha DATE
);

INSERT INTO CAMPEONATO(Id, nombre, apellido, prueba_1, prueba_2, fecha)
VALUES (1,"Martín","López",5.4,3.2,"2023-01-18"),
(2,"Martín","López",5.4,3.2,"2023-02-18"),
(3,"Laura","Pérez",2.3,6.0,"2023-01-12"),
(4,"María","Alonso",7.3,9,"2023-02-01"),
(5,"Roberto","Santos",6.2,5.9,"2023-03-18"),
(6,"Susana","Valdivia",3.0,9.5,"2023-02-25"),
(7,"Marcos","Martín",2.9,7.3,"2023-02-03"),
(8,"Diego","León",8.3,6,"2023-01-28"),
(9,"Carmen","Alegre",9,5,"2023-02-17"),
(10,"Rosa","Morales",7.8,3.9,"2023-03-28"),
(11,"Mario","Sanz",9.4,7.2,"2023-01-21");

#1)
SELECT * FROM CAMPEONATO;

#2)
UPDATE campeonato
SET prueba_1 = 4.3
WHERE nombre = 'Susana' AND apellido = 'Valdivia';

#3)
INSERT INTO campeonato VALUES(12, "Manuel", "Ruíz", 8, 6.2, "2023-03-18");


#4)
SELECT * FROM campeonato WHERE nombre LIKE 'M%';

#5)
ALTER TABLE campeonato ADD COLUMN nombre_completo VARCHAR(35) AFTER apellido;
UPDATE campeonato SET nombre_completo = CONCAT(nombre, ' ', apellido);

#6)
ALTER TABLE campeonato ADD COLUMN final FLOAT AFTER prueba_2;
UPDATE campeonato SET final = 1.5 * prueba_1 * SQRT(prueba_2);

#7)
-- ALTER TABLE campeonato ADD COLUMN comentario VARCHAR(15) AFTER ;

#8)
ALTER TABLE campeonato ADD COLUMN semana INT;
UPDATE campeonato SET semana = WEEK(fecha);

#9)
SELECT * FROM campeonato ORDER BY final DESC;

#10)
SELECT nombre_completo, final FROM campeonato ORDER BY final DESC LIMIT 1;
-- SELECT nombre_completo, MAX(final) 'Puntuación final' FROM campeonato;