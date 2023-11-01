USE Programas_Software;
# Ejercicio 1. Consulta en cuántos establecimientos se vende el programa cuyo código es 7.
SELECT COUNT(*) 'Nº Establecimientos donde se vende', d.codigo 'Codigo Producto'
FROM distribuye d
WHERE d.codigo = 7;

# Ejercicio 2. Obtén un listado con el número máximo de programas de cierto tipo que se vende en
# cada establecimiento.
-- SELECT DISTINCT d.cif 'CIF establecimiento', d.codigo 'Tipo Programa', d.cantidad 'Cantidad Maxima'
-- FROM distribuye d GROUP BY d.codigo;
SELECT d.cif 'CIF Establecimiento', MAX(d.cantidad) 'Cantidad Maxima'
FROM distribuye d GROUP BY d.cif;

# Ejercicio 3. Obtén una lista con el número total de registros que se han realizado por cada medio.
SELECT DISTINCT Medio, COUNT(*) 'Numero Total de registros'
FROM registra GROUP BY medio;

# Ejercicio 4. Obtenga un listado con el número total de registros que se han realizado para cada
# programa.
SELECT DISTINCT r.codigo 'Programa', COUNT(*) 'Numero total de registros'
FROM registra r GROUP BY r.codigo;

# Ejercicio 5. Obtenga un listado con el número total de registros que se han realizado para cada
# programa, siempre que dicho número sea mayor que 1.
SELECT DISTINCT r.codigo 'Programa', COUNT(*) 'Número total de registros'
FROM registra r WHERE r.codigo > 1 GROUP BY r.codigo;

SELECT DISTINCT r.codigo 'Programa', COUNT(*) 'Número total de registros'
FROM registra r GROUP BY r.codigo HAVING COUNT(*) > 1;

# Ejercicio 6. Determine los programas para los que ha habido un único registro.
SELECT r.codigo 'Programa'
FROM registra r GROUP BY r.codigo HAVING COUNT(*) = 1;

# Ejercicio 7. Determine los usuarios que han realizado más de un registro.
SELECT r.dni 'Usuario'
FROM registra r
GROUP BY r.dni
HAVING COUNT(*) > 1;

# Ejercicio 8. ¿De qué programas y versiones se han distribuido a un mismo comercio 3 o más
# unidades?
SELECT p.nombre 'Programa', p.version 'Versión', d.cif 'CIF Comercio', d.cantidad 'Cantidad distribuida'
FROM programas p, distribuye d
WHERE d.codigo = p.codigo && d.cantidad >= 3;

# Ejercicio 9. Determina el promedio de edad de los usuarios que se registran por cada medio.
SELECT AVG(c.edad) 'Edad promedio usuario', r.medio 'Medio'
FROM clientes c, registra r WHERE r.dni = c.dni
GROUP BY r.medio;
# Ejercicio 10. Determina el número de programa de cada tipo que se han vendido en cada ciudad.
SELECT p.codigo 'Nº de Programa', c.ciudad 'Ciudad donde se ha vendido'
FROM distribuye d, programas p, comercios c
WHERE c.cif = d.cif && d.codigo = p.codigo;

# Ejercicio 11. ¿Qué usuarios han registrado Access XP?
SELECT r.dni 'DNI Usuario', c.nombre 'Nombre Usuario', p.nombre 'Nombre Programa', p.version 'Versión'
FROM registra r, clientes c, programas p
WHERE r.dni = c.dni && p.version = 'XP' && p.nombre = 'Access' && p.codigo = r.codigo;

# Ejercicio 12. Obtenga un listado con las ciudades en las que se pueden obtener los productos de
# Oracle.
SELECT f.nombre 'Empresa de SW', c.ciudad 'Ciudades disponibles'
FROM fabricantes f, desarrolla des, distribuye dis, comercios c
WHERE f.idfab = des.idfab && des.codigo = dis.codigo
&& dis.cif = c.cif && f.nombre = 'Oracle'
GROUP BY c.ciudad;

# Ejercicio 13. Obtenga un listado con las ciudades en las que se pueden obtener los productos de
# cada fabricante.
SELECT f.nombre 'Empresa de SW', c.ciudad 'Ciudad disponible'
FROM fabricantes f, desarrolla des, distribuye dis, comercios c
WHERE f.idfab = des.idfab && des.codigo = dis.codigo && dis.cif = c.cif
ORDER BY c.ciudad;


# Ejercicio 14. Consigue una lista de los clientes que se han registrado con cada fabricante,
# incluyendo el comercio donde han adquirido el producto y el medio que han usado para registrarse.
SELECT cli.nombre 'Cliente', f.nombre 'Fabricante', com.nombre 'Comercio',
r.medio 'Medio usado para registrarse', p.nombre 'Programa', p.version 'Versión'
FROM clientes cli, registra r, comercios com,
fabricantes f, desarrolla d, programas p
WHERE cli.dni = r.dni && r.codigo = d.codigo
&& r.cif = com.cif && d.idfab = f.idfab
&& p.codigo = r.codigo;

# Ejercicio 15. Determina, para cada programa distribuido, de cuántas unidades no se ha recibido
# registro.
SELECT d.codigo 'Codigo programa', p.nombre 'Nombre programa', d.cantidad 'Unidades sin registro'
FROM distribuye d, programas p, registra r
WHERE d.codigo = p.codigo && p.codigo != r.codigo
GROUP BY d.codigo, d.cantidad;

# Ejercicio 16. Determina, para cada fabricante, cuántas unidades de sus programas no se han
# registrado.
SELECT f.nombre 'Fabricante', p.nombre 'Programa', dis.cantidad 'Unidades sin registro'
FROM distribuye dis, programas p, registra r, fabricantes f, desarrolla des
WHERE f.idfab = des.idfab && des.codigo = dis.codigo && dis.codigo != r.codigo
&& des.codigo = p.codigo
GROUP BY f.nombre, p.nombre, dis.cantidad;

# Ejercicio 17. Determina cuántos registros ha recibido cada fabricante por cada medio.
SELECT r.codigo 'Codigo Fabricante', r.medio 'Medio', COUNT(*) 'Registros por cada medio'
FROM fabricantes f, desarrolla des, registra r
WHERE f.idfab = des.idfab && des.codigo = r.codigo
GROUP BY r.codigo, r.medio;

# Ejercicio 18. Determina, en cada medio, cuántos fabricantes han recibido registros.
SELECT r.medio 'Medio', r.codigo 'Codigo Fabricante', COUNT(*) 'Nº Registros'
FROM fabricantes f, desarrolla des, registra r
WHERE f.idfab = des.idfab && des.codigo = r.codigo
GROUP BY r.codigo, r.medio;

# Ejercicio 19. Selecciona el nombre de los programas que se registran por Internet.
SELECT p.nombre 'Nombre programa', r.medio 'Medio'
FROM programas p, registra r 
WHERE r.codigo = p.codigo && r.medio = 'Internet';

# Ejercicio 20. Selecciona el nombre de las personas que se registran por Internet.
SELECT c.nombre 'Nombre personas', r.medio 'Medio registro'
FROM clientes c, registra r
WHERE c.dni = r.dni && r.medio = 'Internet';

# Ejercicio 21. Indica qué programas desarrolla Oracle.
SELECT f.nombre 'Fabricante', p.nombre 'Programa', p.version 'Version'
FROM fabricantes f, programas p, desarrolla d
WHERE p.codigo = d.codigo && d.idfab = f.idfab && f.nombre = 'Oracle';

# Ejercicio 22. Consulta qué comercios distribuyen Windows XP.
SELECT c.nombre 'Comercio', p.nombre 'S.O.', p.version 'Version'
FROM comercios c, distribuye d, programas p
WHERE p.codigo = d.codigo && d.cif = c.cif
&& p.version LIKE 'XP%' && p.nombre = 'Windows';

# Ejercicio 23. Consulta qué medios ha utilizado Pepe Pérez para registrarse.
SELECT c.nombre 'Nombre cliente', r.medio 'Medio para registrarse'
FROM registra r, clientes c
WHERE r.dni = c.dni && c.nombre = 'Pepe Pérez';

# Ejercicio 24. Indica las ciudades en las que se han vendido productos que han sido registrados a
# través de Internet.
SELECT r.medio 'Medio', c.ciudad 'Ciudad', p.nombre 'Nombre producto'
FROM registra r, comercios c, programas p
WHERE p.codigo = r.codigo && c.cif = r.cif && r.medio = 'Internet';

# Ejercicio 25. Consulta qué programas han recibido registros por tarjeta postal.
SELECT p.nombre 'Programa', r.medio 'Medio'
FROM programas p, registra r
WHERE r.medio = 'Tarjeta postal' && p.codigo = r.codigo;

# Ejercicio 26. Indica en qué programas y versiones se han distribuido a un mismo comercio 3 o más
# unidades.
SELECT p.nombre 'Programa', p.version 'Version', d.cantidad 'Unidades', c.nombre 'Comercio'
FROM programas p, distribuye d, comercios c
WHERE d.cantidad >= 3 && p.codigo = d.codigo && c.cif = d.cif;

# Ejercicio 27. Consulta cuántas unidades de Windows XP se han distribuido a El Corte Inglés de
# Madrid.
SELECT c.nombre 'Comercio', c.ciudad 'Ciudad', p.nombre 'S.O.', p.version 'Versión', d.cantidad 'Unidades distribuidas'
FROM programas p, distribuye d, comercios c
WHERE c.cif = 2 && c.cif = d.cif && p.codigo = d.codigo
&& p.nombre = 'Windows' && p.version LIKE 'XP%';