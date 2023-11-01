USE ventas;
SET SQL_SAFE_UPDATES = 0; -- Necesario para poder actualizar un campo clave
# 1 Modifica la fecha de alta del empleado con apellido Garrido al 12 de noviembre de 2010
UPDATE empleados
SET fecha_alta = '2010-11-12'
WHERE apellido = 'GARRIDO';

# 2 Modifica el stock del producto con codigo 20 asignándole un valor de 150
UPDATE productos
SET stock = 150
WHERE producto_no = 20;

# 3. Los clientes cuyo nombre tiene una letra A en la segunda posición han cambiado de ubicación a Salamanca
UPDATE clientes
SET localidad = 'SALAMANCA'
WHERE nombre LIKE '_A%';

# 4. El jefe de Lopez a partir de hoy va a ser Garrido
UPDATE empleados -- Hemos tenido que hacer una subquery porque falla al hacer una subconsulta sobre la misma tabla
SET director = (SELECT emp_no
				FROM (SELECT emp_no, apellido 
                FROM empleados
                WHERE apellido = 'GARRIDO') AS subquery)
WHERE apellido = 'LOPEZ';

# 5. Aumenta un 15% el salario de los vendedores

# 6. Aumenta en 10 el número de unidades de los pedidos del cliente 105
# 7. Borrar de la tabla departamentos todas las filas cuyo nombre de departamento sea ‘INVESTIGACION’
# 8. Borrar todas las filas de la tabla departamentos.
# 9. Elimina los pedidos que afectan al producto con código 70