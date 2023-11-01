USE ventas;
# 10
SELECT descripcion, stock FROM productos;

# 11
SELECT nombre, lim_credito FROM clientes WHERE localidad = 'MADRID';

# 12
SELECT producto_no, precio FROM productos WHERE stock > 20;

# 13
SELECT nombre, localidad FROM clientes WHERE nombre LIKE '%S.A.';

# 14
SELECT apellido, oficio FROM empleados WHERE comision IS NOT NULL;

# 15
SELECT pedido_no, fecha FROM pedidos WHERE fecha > DATE('2009-11-01');

# 16
SELECT apellido, salario, ABS(salario - 10000) AS 'Salario en valor absoluto' FROM empleados;

# 17
SELECT apellido, LENGTH(apellido) AS 'Longitud apellido' FROM empleados;

# 18
SELECT ADDDATE(fecha_alta, 365) AS 'Fecha de Alta + 12 meses'
FROM empleados
WHERE dep_no = 10;

# 19
SELECT LAST_DAY(fecha_alta) AS 'Ultimo día del mes'
FROM empleados WHERE dep_no = 10;

# 20
SELECT * FROM empleados e JOIN departamentos d ON e.dep_no = d.dep_no;
SELECT * FROM empleados NATURAL JOIN departamentos;

# 21
SELECT e.emp_no, e.apellido, d.dep_no, d.dnombre, d.localidad
FROM empleados e NATURAL JOIN departamentos d;

# 22
SELECT e.* FROM empleados e
NATURAL JOIN  departamentos d
WHERE d.dnombre = 'INVESTIGACION';

# 23
SELECT p.* FROM pedidos p
NATURAL JOIN clientes c
WHERE c.localidad = 'SEVILLA';

# 24
SELECT p.pedido_no 'Codigo pedido', p.unidades 'Unidades vendidas', pr.precio 'Precio'
FROM pedidos p
NATURAL JOIN productos pr
WHERE pr.precio < 500;

# 25
SELECT p.*, c.nombre 'Nombre Cliente', e.apellido 'Vendedor'
FROM pedidos p
NATURAL JOIN clientes c
JOIN empleados e
ON c.vendedor_no = e.emp_no
WHERE e.apellido = 'MARTIN';

# 26
SELECT p.*, c.nombre 'Cliente', c.lim_credito 'Limite credito',
pr.descripcion 'Producto comprado'
FROM pedidos p
NATURAL JOIN clientes c
NATURAL JOIN productos pr
WHERE pr.descripcion LIKE 'MESA%';

#27
SELECT p.*, pr.*
FROM pedidos p
NATURAL JOIN productos pr
WHERE p.fecha > '2009-11-01'
&& pr.stock > 25;

# 28
SELECT * FROM clientes c
WHERE c.nombre LIKE '%S.A.'
ORDER BY c.localidad;

# 29
SELECT e.* FROM empleados e
WHERE e.comision IS NOT NULL
ORDER BY e.oficio ASC, e.apellido DESC;

# 30
SELECT e.dep_no 'Nº', d.dnombre 'Departamento', e.apellido 'Nombre',
e.salario 'Salario' FROM empleados e
NATURAL JOIN departamentos d
ORDER BY e.dep_no ASC, e.salario DESC;

# 31
SELECT p.*, c.nombre, c.localidad FROM productos p
NATURAL JOIN pedidos pe
NATURAL JOIN clientes c 
WHERE c.localidad = 'MADRID'
ORDER BY p.descripcion;

# 32
SELECT p.*, e.apellido
FROM productos p 
NATURAL JOIN pedidos pe
NATURAL JOIN empleados e
INNER JOIN clientes c
ON c.vendedor_no = e.emp_no
WHERE e.apellido = 'ALONSO' || e.apellido = 'CALVO'
LIMIT 3;

# 33
SELECT pr.*, c.nombre 'Nombre cliente', c.lim_credito 'Limite Crédito'
FROM productos pr 
INNER JOIN pedidos pe ON pr.producto_no = pe.producto_no
INNER JOIN clientes c ON c.cli_no = pe.cli_no
WHERE c.lim_credito = 10000
ORDER BY pr.producto_no
LIMIT 3;

# 34
SELECT pr.*, c.nombre 'Nombre cliente', c.lim_credito 'Limite Crédito'
FROM productos pr 
INNER JOIN pedidos pe ON pr.producto_no = pe.producto_no
INNER JOIN clientes c ON c.cli_no = pe.cli_no
WHERE c.lim_credito = 10000
ORDER BY pr.producto_no
LIMIT 3,3;

# 35
SELECT AVG(e.salario) AS 'Salario medio', e.dep_no 'Nº Departamento'
FROM empleados e
WHERE e.dep_no = 10;

# 36
SELECT COUNT(*) AS 'Nº filas tabla empleados'
FROM empleados;

# 37
SELECT COUNT(*) AS 'Nº filas tabla empleados'
FROM empleados WHERE comision IS NULL;

# 38
SELECT MAX(salario) FROM empleados;

# 39
SELECT SUM(stock) AS 'Nº Productos en el almacén'
FROM productos;

# 40
SELECT SUM(stock*precio) AS 'Valor total del almacén'
FROM productos;

# 41
SELECT descripcion 'Mesa', stock*precio 'Valor mesas almacen'
FROM productos
WHERE descripcion LIKE 'MESA%';

SELECT SUM(stock*precio) AS 'Valor mesas'
FROM productos
WHERE descripcion LIKE 'MESA%';

# 42
SELECT AVG(salario) 'Salario medio', MIN(salario) 'Salario mínimo',
MAX(salario) 'Salario máximo', SUM(salario) 'Suma salarios', oficio
FROM empleados WHERE oficio = 'VENDEDOR';

# 43
SELECT d.dep_no 'Nº departamento', d.dnombre 'Nombre departamento', e.oficio 'Oficio',
SUM(e.salario) 'Suma salarios'
FROM departamentos d
NATURAL JOIN empleados e
GROUP BY d.dep_no, e.oficio, d.dnombre;

# 44
SELECT d.dep_no 'Nº departamento', d.dnombre 'Nombre departamento', e.oficio 'Oficio',
SUM(e.salario) AS 'Suma salarios'
FROM departamentos d
NATURAL JOIN empleados e
GROUP BY d.dep_no, e.oficio, d.dnombre
HAVING SUM(e.salario) > 1000;

# 45
SELECT COALESCE(SUM(pe.unidades), 0) 'Unidades vendidas', pr.descripcion 'Producto',
IFNULL(pe.producto_no, ' ') 'Nº Producto', IFNULL(c.vendedor_no, 'Otro') 'Nº Vendedor', IFNULL(e.apellido, 'Otro diferente a ALONSO') 'Vendedor'
FROM productos pr
LEFT JOIN pedidos pe ON pr.producto_no = pe.producto_no
LEFT JOIN clientes c ON c.cli_no = pe.cli_no
LEFT JOIN empleados e ON e.emp_no = c.vendedor_no AND e.apellido = 'ALONSO'
GROUP BY pr.descripcion, pe.producto_no, c.vendedor_no, e.apellido;

# 46
SELECT pe.pedido_no 'Nº Pedido', pe.producto_no 'Nº Producto',
pr.descripcion 'Nombre producto', pe.cli_no 'Nº Cliente',
cl.nombre 'Nombre Cliente', cl.localidad 'Localidad',
pr.precio 'Precio/Ud Producto', pe.unidades 'Unidades', SUM(pr.precio*pe.unidades) 'Precio total'
FROM pedidos pe
JOIN productos pr ON pe.producto_no = pr.producto_no
JOIN clientes cl ON cl.cli_no = pe.cli_no
GROUP BY pe.pedido_no, pe.producto_no, pr.descripcion,
pe.cli_no, cl.nombre, cl.localidad, pr.precio, pe.unidades
HAVING cl.localidad LIKE 'LAS ROZAS';

# 47
UPDATE empleados
SET oficio = (SELECT oficio FROM empleados WHERE emp_no = 7499),
dep_no = (SELECT dep_no FROM empleados WHERE emp_no = 7499)
WHERE emp_no = 7698;

SELECT @oficio := oficio, @dep_no := dep_no
FROM empleados WHERE emp_no = 7499;

UPDATE empleados
SET oficio = @oficio, dep_no = @dep_no
WHERE emp_no = 7698;

SELECT * FROM empleados WHERE emp_no = 7698;

# 48
SELECT apellido, salario FROM empleados
WHERE salario > ANY (
	SELECT salario FROM empleados
	WHERE emp_no = 7566);
    
# 49
SELECT * FROM empleados
WHERE oficio = ANY (
	SELECT oficio FROM empleados
	WHERE emp_no = 7698)
AND salario > ANY (
    SELECT salario FROM empleados
    WHERE emp_no = 7876);
    

# 50
SELECT apellido, oficio, salario
FROM empleados
WHERE salario = ANY (
	SELECT MIN(salario) FROM empleados);
    
# 51
SELECT dep_no, salario
FROM empleados
GROUP BY dep_no, salario
HAVING MIN(salario) > ANY (
	SELECT MIN(salario) FROM empleados
    WHERE dep_no = 20);

# 52
SELECT oficio, AVG(salario) salario_medio
FROM empleados
GROUP BY oficio
ORDER BY salario_medio LIMIT 1;

# 53
SELECT apellido, salario
FROM empleados
WHERE salario = ANY (
	SELECT MIN(salario)
    FROM empleados
);

# 54
SELECT apellido, salario, dep_no
FROM empleados e1
WHERE salario = (
	SELECT MIN(salario)
	FROM empleados e2
	WHERE e1.dep_no = e2.dep_no
);

# 55
SELECT apellido, fecha_alta
FROM empleados e1
WHERE dep_no = (
	SELECT dep_no
    FROM empleados e2
    WHERE e2.emp_no = 7566
);

# 56
SELECT apellido, fecha_alta
FROM empleados e1
WHERE dep_no = (
	SELECT dep_no
    FROM empleados e2
    WHERE e2.emp_no = 7566
) AND emp_no != 7566;

# 57
SELECT emp_no, apellido, salario
FROM empleados e1
WHERE salario > (
	SELECT AVG(salario)
    FROM empleados e2
)
ORDER BY salario DESC;

# 58
SELECT emp_no, apellido, dep_no
FROM empleados
WHERE dep_no IN (
	SELECT dep_no
    FROM empleados
    WHERE apellido LIKE '%T%'
)
ORDER BY dep_no;

# 59
SELECT e.apellido, e.dep_no, e.oficio, d.localidad
FROM empleados e
NATURAL JOIN departamentos d
WHERE d.localidad = 'MADRID';

# 60
SELECT emp_no, apellido, salario
FROM empleados
WHERE salario > (
	SELECT AVG(salario)
    FROM empleados
) AND dep_no IN (
	SELECT dep_no
    FROM empleados
    WHERE apellido LIKE '%T%'
);

# 61
SELECT pr.descripcion 'Producto', IFNULL(pe.pedido_no, 'No hay') 'Nº Pedido',
IFNULL(pe.producto_no, 'Ninguno') 'Nº Producto', IFNULL(pe.cli_no, 'Sin cliente') 'Nº Cliente',
IFNULL(pe.unidades, 0) 'Unidades', IFNULL(pe.fecha, 'Ninguna') 'Fecha pedido'
FROM productos pr
LEFT JOIN pedidos pe
ON pr.producto_no = pe.producto_no;

# 62
SELECT pr.descripcion 'Producto', IFNULL(pe.unidades, 'Ninguna, no hubo pedido') 'Unidades pedidas'
FROM productos pr
LEFT JOIN pedidos pe
ON pr.producto_no = pe.producto_no;

# 63
SELECT e.apellido 'Empleado', e.oficio 'Oficio',
IFNULL(c.nombre, 'No tiene clientes') 'Cliente asociado',
IFNULL(c.localidad, 'Sin clientes') 'Localidad cliente'
FROM empleados e
LEFT JOIN clientes c
ON c.vendedor_no = e.emp_no;

# 64
SELECT d.dep_no 'Nº Departamento', d.dnombre 'Departamento',
d.localidad 'Localidad departamento', IFNULL(e.emp_no, 'Sin empleados') 'Nº Empleado',
IFNULL(e.apellido, 'Sin empleados') 'Nombre y apellidos empleado',
IFNULL(e.oficio, 'N/A') 'Oficio',
IFNULL(e.director, 'N/A') 'Director',
IFNULL(e.fecha_alta, 'N/A') 'Fecha Alta',
IFNULL(e.salario, '0') 'Salario',
IFNULL(e.comision, 'Sin comisión') 'Comisión',
IFNULL(e.dep_no, 'Sin empleados') 'Confirmación Nº dep'
FROM departamentos d
LEFT JOIN empleados e 
ON d.dep_no = e.dep_no;

# 65
SELECT d.dnombre 'Departamento', d.localidad 'Localidad',
COALESCE(COUNT(e.dep_no), 0) 'Nº Empleados'
FROM departamentos d
LEFT JOIN empleados e ON e.dep_no = d.dep_no
GROUP BY d.dnombre, d.localidad;

# 66
SELECT e1.emp_no 'Nº Empleado', e1.apellido 'Nombre',
IFNULL(e2.apellido, 'Sin jefe') 'Jefe'
FROM empleados e1
LEFT JOIN empleados e2
ON e1.director = e2.emp_no;

# 67
SELECT e.emp_no 'Nº Empleado', e.apellido 'Nombre',
e.oficio 'Oficio', IFNULL(e.director, 'Sin jefe') 'Nº Jefe',
IFNULL(j.apellido, 'Sin jefe') 'Nombre de su Jefe',
e.fecha_alta 'Fecha alta', e.salario 'Salario',
IFNULL(e.comision, 0) 'Comision', e.dep_no 'Nº departamento'
FROM empleados e
LEFT JOIN empleados j
ON e.director = j.emp_no
WHERE e.oficio != 'DIRECTOR';

# 68
SELECT e1.apellido 'Empleado', e1.salario 'Salario'
FROM empleados e1
WHERE e1.salario > ANY (
	SELECT COALESCE(AVG(salario), 0)
	FROM empleados e2
	RIGHT JOIN departamentos d
	ON e2.dep_no = d.dep_no
	GROUP BY d.dep_no
);

# 69
SELECT d.dep_no 'Nº departamento', d.dnombre 'Departamento',
d.localidad 'Localidad'
FROM departamentos d
LEFT JOIN empleados e
ON d.dep_no = e.dep_no
WHERE e.dep_no IS NULL;

# 70
SELECT e1.* 
FROM empleados e1
WHERE e1.salario < ANY (
	SELECT AVG(e2.salario)
	FROM empleados e2
	GROUP BY e2.dep_no
);

# 71
SELECT e1.apellido 'Empleado', e1.oficio 'Oficio', e1.salario 'Salario'
FROM empleados e1
WHERE (e1.oficio, e1.salario) IN (
	SELECT e2.oficio, e2.salario
    FROM empleados e2
    WHERE e2.apellido = 'MARTIN'
); 

# 72: 22 Obtén los datos de los empleados del departamento de Investigación
-- SELECT e.* FROM empleados e
-- NATURAL JOIN  departamentos d
-- WHERE d.dnombre = 'INVESTIGACION';
SELECT e.* FROM empleados e
WHERE e.dep_no IN (
	SELECT d.dep_no
    FROM departamentos d
    WHERE d.dnombre = 'INVESTIGACION'
);

# 72: 23 Obtén los pedidos realizados por clientes de Sevilla
-- SELECT p.* FROM pedidos p
-- NATURAL JOIN clientes c
-- WHERE c.localidad = 'SEVILLA';
SELECT p.* FROM pedidos p
WHERE p.cli_no IN (
	SELECT c.cli_no
    FROM clientes c
    WHERE c.localidad = 'SEVILLA'
);

# 72: 24 Obtén el código de los pedidos y las unidades vendidas de los productos cuyo precio es menor que 500.
-- SELECT p.pedido_no 'Codigo pedido', p.unidades 'Unidades vendidas', pr.precio 'Precio'
-- FROM pedidos p
-- NATURAL JOIN productos pr
-- WHERE pr.precio < 500;
SELECT pe.pedido_no 'Código', pe.unidades 'Uds'
FROM pedidos pe
WHERE pe.producto_no IN (
	SELECT pr.producto_no
    FROM productos pr
    WHERE pr.precio < 500
);

# 72: 25 Obtén los pedidos de los clientes del vendedor que se apellido Martín
-- SELECT p.*, c.nombre 'Nombre Cliente', e.apellido 'Vendedor'
-- FROM pedidos p
-- NATURAL JOIN clientes c
-- JOIN empleados e
-- ON c.vendedor_no = e.emp_no
-- WHERE e.apellido = 'MARTIN';
SELECT p.*
FROM pedidos p
WHERE p.cli_no IN (
	SELECT c.cli_no
    FROM clientes c
    INNER JOIN empleados e
    ON c.vendedor_no = e.emp_no
    WHERE e.apellido = 'MARTIN'
);

# 72: 26 Obtén los datos de los pedidos que afectan a clientes cuyo límite de crédito es 5000€ y han comprado mesas
-- SELECT p.*, c.nombre 'Cliente', c.lim_credito 'Limite credito',
-- pr.descripcion 'Producto comprado'
-- FROM pedidos p
-- NATURAL JOIN clientes c
-- NATURAL JOIN productos pr
-- WHERE pr.descripcion LIKE 'MESA%';
SELECT pe.*
FROM pedidos pe 
WHERE pe.producto_no IN (
	SELECT pr.producto_no
    FROM productos pr
    JOIN clientes c
    ON pe.cli_no = c.cli_no
    WHERE c.lim_credito = 5000
    AND pr.descripcion LIKE 'MESA%'
);

# 72: 27 Obtén los pedidos con fecha posterior al 1 de noviembre de 2009 en los que se han comprado productos que tiene más de 25 unidades en stock.
-- SELECT p.*, pr.*
-- FROM pedidos p
-- NATURAL JOIN productos pr
-- WHERE p.fecha > '2009-11-01'
-- && pr.stock > 25;
SELECT pe.* 
FROM pedidos pe
WHERE pe.fecha > '2009-11-01'
AND pe.producto_no IN (
	SELECT pr.producto_no
    FROM productos pr
    WHERE pr.stock > 25
);
