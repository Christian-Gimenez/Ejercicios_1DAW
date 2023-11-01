#1. Crea un usuario llamado creador que pueda crear, a su vez, otros usuarios.
CREATE USER 'creador'@'localhost' IDENTIFIED BY '1234';
GRANT CREATE USER ON *.* TO 'creador'@'localhost';

#2. Haciendo login en la base de datos con el usuario creador, crea los siguientes usuarios: usuario1 y usuario2.
CREATE USER 'usuario1'@'localhost' IDENTIFIED BY '1234';
CREATE USER 'usuario2'@'localhost' IDENTIFIED BY '1234';

#3. Conectado como creador, otórgale permisos de creación de tablas al usuario1. ¿Todo bien? ¿Por qué?
GRANT CREATE ON *.* TO 'usuario1'@'localhost';
#REVOKE CREATE ON *.* FROM 'usuario1'@'localhost';
#No deja por que creador solo tiene permisos de crear usuarios, pero no de dar permisos a los mismos

#4 Conectado como root, otórgale permisos de creación de tablas al usuario2
GRANT CREATE ON *.* TO 'usuario2'@'localhost';

#5 Conectado con usuario1, crea un esquema con tu nombre y una tabla con tu primer apellido. ¿Todo bien? ¿Por qué?
CREATE SCHEMA christian;
USE christian;
CREATE TABLE gimenez(prueba INT PRIMARY KEY);
#No deja ya que al usuario1 se le intentó dar permisos con creador, el cual no puede otorgar permisos.

#6 Conectado con usuario2, crea un esquema con tu nombre y una tabla con tu segundo apellido
CREATE SCHEMA christian;
USE christian;
CREATE TABLE puerma(prueba INT PRIMARY KEY);

#7 Conectado con usuario2, mira las bases de datos creadas y su contenido. ¿Ves algo raro? ¿Qué harías para solucionarlo?
SELECT * FROM christian;
#No se puede porque usuario2 sólo puede crear, no hacer querys, hay que darle permisos de SELECT.

#8 Conectado como root, muestra los permisos que tienen los usuarios usuario1 y usuario2.
SHOW GRANTS FOR 'usuario1'@'localhost';
SHOW GRANTS FOR 'usuario2'@'localhost';

#9 Conectado como usuario2 muestra los permisos que posee y comprueba que son los mismos a los del ejercicio anterior.
SHOW GRANTS FOR 'usuario2'@'localhost';

#10 Conectado como root da permisos de creación, borrado y modificación de tablas al usuario creador
GRANT CREATE, DROP, ALTER ON *.* TO 'creador'@'localhost';

#11 Conectado como creador, crea dos tablas (tabla1 y tabla2) en el esquema de tu nombre,
# con dos columnas cada una (Clave INT PK, Valor VARCHAR(50))
USE christian;
CREATE TABLE tabla1(clave INT PRIMARY KEY, valor VARCHAR(50));
CREATE TABLE tabla2(clave INT PRIMARY KEY, valor VARCHAR(50));

#12 Conectado como root da permisos de lectura sobre todas las tablas de la base de datos
# que has creado con tu nombre al usuario1
GRANT SELECT ON christian.* TO 'usuario1'@'localhost';

#13 Conectado como root da permisos de inserción y actualización sobre todas las tablas
#de la base de datos que has creado con tu nombre al usuario2
GRANT INSERT, UPDATE ON christian.* TO 'usuario2'@'localhost';

#14 Conectado como usuario2, inserta un par de registros en cada una de las tablas tabla1 y tabla2.
USE christian;
INSERT INTO tabla1 VALUES(1, "Primero"), (2, "Segundo");
INSERT INTO tabla2 VALUES(1, "2-Primero"), (2, "2-Segundo");

#15 Conectado como usuario1, actualiza un dato de la tabla1
USE christian;
UPDATE tabla1 SET clave = 666, valor = "Cambiado" WHERE clave = 1;
# No se puede porque no tiene permisos de actualizacion

#16 Conectado como creador, da permisos de actualización sobre la tabla1 al usuario1 y
# vuelve a repetir el ejercicio anterior
GRANT UPDATE ON christian.tabla1 TO 'usuario1'@'localhost';

USE christian;
UPDATE tabla1 SET clave = 666, valor = "Cambiado" WHERE clave = 1;

#17 Conectado como usuario1, elimina un registro de la tabla2. Si no puedes, haz lo
# necesario para poder realizar esta acción
GRANT DELETE ON christian.tabla2 TO 'usuario1'@'localhost';

#18  Conectado como root, elimina los permisos de creación de tablas de usuario2
REVOKE CREATE ON *.* FROM 'usuario2'@'localhost';

#19 Conectado como root, elimina al usuario usuario1.
DROP USER 'usuario1'@'localhost';

#20 Conectado como root, crea un rol denominado comodin que permita realizar copias de
# seguridad de la base de datos.
CREATE ROLE IF NOT EXISTS comodin;
GRANT ALL ON christian.* TO 'comodin';

#21 Conectado como root, asigna el rol comodín al usuario2
GRANT comodin TO 'usuario2'@'localhost';
FLUSH PRIVILEGES;

#22 Conectado como usuario2, muestra el rol que tiene en ese momento
SHOW GRANTS FOR 'usuario2'@'localhost';

#23 Debemos dar acceso de lectura a nuestra tabla1 a un usuario (que llamaremos externo)
#quien pertenece a una empresa distinta a la nuestra con la que estamos colaborando. Dicho usuario
#únicamente debe poder conectar desde su oficina la cual tiene la IP 80.25.13.85. Implementa las
#sentencias necesarias para realizar esta funcionalidad.
CREATE USER 'externo'@'80.25.13.85' IDENTIFIED BY '1234';
GRANT SELECT ON christian.tabla1 TO 'externo'@'80.25.13.85';

#24 El usuario externo del ejercicio anterior, ha dejado de colaborar con nuestra empresa
#pero es muy probable que lo vuelva a hacer en el futuro con los mismos permisos. ¿Cómo
#solventarías esta situación? ¿Qué se te ocurre hacer?
#SOLUCION: Podemos bloquear al usuario y cuando llegara el momento desbloquearlo
ALTER USER 'externo'@'80.25.13.85' ACCOUNT LOCK;