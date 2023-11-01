# 6 Relacion de Ejercicios
USE automoviles;
# Ejercicio 2. Obtén todos los campos de todos los concesionarios.
SELECT * FROM concesionarios;

# Ejercicio 3. Obtén todos los campos de todos los clientes de Madrid.
SELECT * FROM clientes WHERE ciudad = 'Madrid';

# Ejercicio 4. Obtener todos los nombres de todas las marcas de coches ordenadas alfabéticamente.
SELECT nombre FROM marcas ORDER BY nombre ASC;

# Ejercicio 5. Obtén todos los nombres de COCHES existentes sin repetición.
SELECT DISTINCT nombre FROM coches;

# Ejercicio 6. Obtener el cifc de todos los concesionarios cuyo atributo cantidad en la tabla de
# DISTRIBUCIÓN es mayor que 18.
SELECT cifc, cantidad FROM distribucion WHERE cantidad > 18;

# Ejercicio 7. Obtener el cifc de todos los concesionarios cuyo atributo cantidad en la tabla de
# DISTRIBUCIÓN está comprendido entre 10 y 18, ambos inclusive;
SELECT cifc, cantidad FROM distribucion WHERE cantidad BETWEEN 10 AND 18;

# Ejercicio 8. Obtener el cifc de todos los concesionarios que han adquirido más de 10 coches
# o menos de 5.
SELECT cifc, cantidad FROM distribucion WHERE cantidad > 10 || cantidad < 5;

# Ejercicio 9. Obtener todas las parejas de cifm de MARCAS y dni de CLIENTES que sean de
# la misma ciudad. Razona qué interés puede tener hacer esta consulta.
SELECT m.cifm 'CIF', c.dni 'DNI Cliente', m.ciudad 'Ciudad común'
FROM marcas m, clientes c
WHERE m.ciudad = c.ciudad;

# Ejercicio 10. Obtén todas las parejas de dni de CLIENTES y cifm de MARCAS que NO sean
# de la misma ciudad. El campo dni debe tener el alias IdCliente y el cifm será CodMarca.
SELECT c.dni AS IdCliente, m.cifm AS CodMarca,
c.ciudad 'Ciudad Cliente', m.ciudad 'Ciudad Marca'
FROM clientes c, marcas m
WHERE m.ciudad != c.ciudad;

# Ejercicio 11. Obtén el nombre, dni y ciudad de todos los CLIENTES cuyo nombre empiece
# por “A”.
SELECT nombre, dni, ciudad FROM clientes WHERE nombre LIKE 'A%';

# Ejercicio 12. Obtén el nombre y apellido de todos los CLIENTES cuyo apellido termine por “ez”.
SELECT nombre, apellido FROM clientes WHERE apellido LIKE '%ez';

# Ejercicio 13. Obtén todos los campos de los COCHES que sean Ibiza o Megane.
SELECT * FROM coches WHERE nombre IN('Ibiza', 'Megane');

# Ejercicio 14. Obtener los codcoche suministrados por algún concesionario de Barcelona.
SELECT d.codcoche 'CodCoche', c.nombre 'Concesionario', c.ciudad 'Ciudad'
FROM distribucion d, concesionarios c
WHERE c.cifc = ANY
	(SELECT c.cifc FROM concesionarios c WHERE ciudad = 'Barcelona')
&& d.cifc = c.cifc;

# Ejercicio 15. Obtener el codcoche de aquellos coches vendidos a clientes de Madrid.
SELECT v.codcoche 'CodCoche', c.nombre 'Nombre cliente', c.ciudad 'Ciudad cliente'
FROM ventas v, clientes c
WHERE c.dni = v.dni && c.ciudad = 'Madrid';

# Ejercicio 16. Obtener el codcoche de los coches que han sido adquiridos por un cliente de
# Madrid en un concesionario de Madrid.
SELECT v.codcoche 'CodCoche', concesionarios.ciudad 'Ciudad concesionario',
c.nombre 'Nombre cliente', c.ciudad 'Ciduad cliente'
FROM clientes c, ventas v, concesionarios
WHERE v.cifc = concesionarios.cifc && concesionarios.ciudad = 'Madrid'
&& c.ciudad = 'Madrid';

# Ejercicio 17. Con la fiestas navideñas, todas las marcas de coches se han puesto generosas
# y han decidido premiar con 1000 € a todos los concesionarios por cada coche vendido.
# Obtén un listado con el código de concesionario, el código de coche, la cantidad de coches
# distribuidos por el concesionario en cuestión y la cuantía económica de premio que le
# corresponde, ordenado por concesionario y coche (descendente).
SELECT d.cifc 'CIF Concesionario', d.codcoche 'CodCoche',
d.cantidad 'Cantidad vendida', d.cantidad*1000 'Cuantía económica de premio'
FROM distribucion d ORDER BY d.cifc DESC, d.codcoche DESC;

# Ejercicio 18. Dentro del contexto del ejercicio anterior, resulta que al concesionario “bcar”
# le han detectado malas prácticas comerciales y se va a quedar sin premio. Saca el nuevo
# listado del premio que le corresponde a cada concesionario, desgranado por concesionario
# y modelo.
SELECT d.cifc 'CIF Concesionario', concesionarios.nombre 'Concesionario',
d.codcoche 'CodCoche', coches.nombre 'Marca Coche', coches.modelo 'Modelo Coche',
d.cantidad 'Cantidad vendida', d.cantidad*1000 'Cuantía económica de premio'
FROM distribucion d, concesionarios, coches
WHERE concesionarios.nombre != 'bcar' && d.cifc = concesionarios.cifc
&& d.codcoche = coches.codcoche
ORDER BY d.cifc DESC, d.codcoche DESC;
