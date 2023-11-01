USE ventas;

# Seleccionar todos los empleados de Madrid
SELECT * FROM empleados WHERE dep_no = 30;

# 2 Ejercicios:
# 1
SELECT * FROM empleados;

# 2
SELECT emp_no, apellido, dep_no FROM empleados;

# 3
SELECT DISTINCT dep_no FROM empleados;

# 4
-- SELECT DISTINCT oficio FROM empleados, dep_no;

# 4.2 Comparacion
# 1
SELECT apellido FROM empleados
	WHERE oficio = 'ANALISTA';
  
# 2
SELECT apellido FROM clientes WHERE localidad != 'SEVILLA';

# 3
SELECT oficio FROM empleados WHERE salario > 2000;

# 4.3 Booleanos
# 1
SELECT * FROM empleados
WHERE dep_no = 10 || dep_no = 30;

# 2
SELECT apellido FROM empleados
WHERE oficio = 'VENDEDOR' && comision > 300;

# 3
SELECT * FROM empleados
WHERE oficio != 'VENDEDOR' || salario > 2000;

# 4
SELECT * FROM empleados WHERE NOT oficio = 'VENDEDOR';

# 5
SELECT * FROM empleados WHERE oficio != 'VENDEDOR' || salario < 1500;

# 4.4 Between... AND ... / NOT BETWEEN ... AND ... 
# 1
SELECT * FROM empleados WHERE salario BETWEEN 2000 AND 3500;

# 2
SELECT * FROM productos WHERE precio NOT BETWEEN 300 AND 500;

# 4.5 In ( , , , ) / NOT IN ( , , , )
# 1
SELECT dnombre FROM departamentos WHERE localidad IN('MADRID', 'VALENCIA');

# 2
SELECT apellido FROM empleados WHERE dep_no IN(20, 30);

# 3
SELECT * FROM pedidos, productos WHERE precio > 500;

# 4.6 LIKE / NOT LIKE
# 1
SELECT * FROM departamentos WHERE localidad NOT LIKE '%e%';

# 2
SELECT * FROM departamentos WHERE localidad LIKE '_a%';

# 3
SELECT * FROM empleados WHERE apellido LIKE 'M%' AND salario BETWEEN 1000 AND 2000;

# 4
SELECT * FROM empleados WHERE apellido LIKE '%z';

# 4.7 ALL / ANY ó SOME

# 4.8 IS NULL / IS NOT NULL
# 1
SELECT * FROM empleados WHERE comision IS NULL;

# 2
SELECT apellido, salario, comision, salario+IFNULL(comision, 0)
FROM empleados;

# 4.9 EXISTS / NOT EXISTS
# 1
SELECT * FROM clientes WHERE EXISTS
	(SELECT localidad FROM departamentos WHERE
		departamentos.localidad = clientes.localidad);

SELECT nombre FROM clientes WHERE localidad 
	IN(SELECT localidad FROM departamentos);
        
# 2
SELECT nombre, cli_no FROM clientes WHERE EXISTS(SELECT * FROM pedidos WHERE 
	pedidos.cli_no = clientes.cli_no);

SELECT nombre, cli_no FROM clientes WHERE cli_no IN(SELECT cli_no FROM pedidos);

# 3
SELECT nombre FROM clientes WHERE EXISTS
	(SELECT * FROM pedidos WHERE clientes.cli_no = pedidos.cli_no
		&& producto_no = 20);
        
SELECT nombre FROM clientes WHERE cli_no IN
 	(SELECT cli_no FROM pedidos WHERE producto_no = 20);
        
# 4
SELECT nombre FROM clientes WHERE NOT EXISTS(SELECT cli_no FROM pedidos WHERE
	clientes.cli_no = pedidos.cli_no);
    
SELECT nombre, cli_no FROM clientes WHERE cli_no NOT IN(SELECT cli_no FROM pedidos);

# Clientes que han comprado el producto 20 y 30
SELECT nombre, cli_no FROM clientes WHERE EXISTS(
	SELECT * FROM pedidos WHERE clientes.cli_no = pedidos.cli_no
		&& (producto_no = 20 || producto_no = 30));
        
SELECT nombre, cli_no FROM clientes WHERE cli_no IN (SELECT cli_no FROM pedidos WHERE
	producto_no = 20 || producto_no = 30);

# 6 ORDER BY
# 1
SELECT * FROM empleados ORDER BY apellido;

# 2
SELECT * FROM empleados ORDER BY dep_no;

# 3
SELECT * FROM empleados ORDER BY oficio, salario DESC;

# 4
SELECT apellido, (salario+IFNULL(comision, 0))*14 "total" FROM empleados ORDER BY total DESC;

# LIMIT
# 1
SELECT * FROM empleados ORDER BY salario DESC LIMIT 5;

# 2
SELECT * FROM empleados ORDER BY apellido ASC LIMIT 5,2;

# 7.1 Funciones de columna
# 1 
SELECT SUM((salario+IFNULL(comision, 0))) "Masa salarial mensual" FROM empleados;


# 2
SELECT MAX(salario) "Salario máximo", MIN(salario) "Salario mínimo",
MAX(salario) - MIN(salario)"Diferencia" FROM empleados;

# 3
SELECT MAX(fecha_alta) "Fecha alta más recientes" FROM empleados;
SELECT fecha_alta "Fecha alta" FROM empleados ORDER BY fecha_alta DESC LIMIT 1;

# 4
SELECT AVG(salario) "Salario medio" FROM empleados;

# 5
SELECT AVG(salario) "Salario medio Analistas" FROM empleados
	WHERE oficio = "ANALISTA";
    
# 6
SELECT AVG(salario) "Salario medio Dep.10" FROM empleados
	WHERE dep_no = 10;
    
# 7
SELECT COUNT(*) "Número filas" FROM empleados;

# 8
SELECT COUNT(*) "Número empleados SIN comisión" FROM empleados
	WHERE comision IS NULL;
    
SELECT COUNT(*) "Número empleados CON comisión" FROM empleados
	WHERE comision IS NOT NULL;

# 9
SELECT VARIANCE(salario), STDDEV(salario) FROM empleados;

# 10
SELECT AVG(salario), MAX(salario), MIN(Salario), SUM(salario) FROM empleados
	WHERE oficio = "VENDEDOR";
    
# 7.2 Funciones escalares
# 1
SELECT apellido, salario, ABS(salario - 10000) FROM empleados;

# 7.2.2 Funciones de caracteres

# 7.2.3 Funciones de fecha y hora
SELECT ADDDATE(CURDATE(), 7) "Siguiente martes";
SELECT DATE_ADD(CURDATE(), INTERVAL 2 WEEK);

# 7.2.4 Funciones de comparación
SELECT GREATEST("Christian", "Ramon", "Josema");
SELECT LEAST("Christian", "Ramon", "Josema");

# 7.2.5 Otras funciones
SELECT DATABASE();
SELECT USER();
SELECT VERSION();

# 8 Group by
# 1
SELECT AVG(salario) "Salario medio", dep_no "Departamento"
	FROM empleados GROUP BY dep_no;

SELECT dep_no, AVG(salario) FROM empleados
	GROUP BY dep_no ORDER BY 2 LIMIT 1;

# 2
SELECT oficio, COUNT(*) "empleados" FROM empleados GROUP BY oficio;
-- SELECT oficio, COUNT(*) "empleados" FROM empleados; Daria ERROR porque no se puede un COUNT() sin GROUP BY, excepto para contar todas las filas: SELECT COUNT()* FROM tabla;

# 3
SELECT dep_no "Departamento", oficio "Oficio", SUM(salario) "Suma salarios",
	COUNT(*) "Nº de empleados" FROM empleados GROUP BY dep_no, oficio ORDER BY dep_no;

# 9 Having
# 1
SELECT dep_no "Departamento", oficio "Oficio", SUM(salario) "Suma salarios",
	COUNT(*) "Nº de empleados" FROM empleados GROUP BY dep_no, oficio HAVING SUM(salario) > 2000;
    
# 2
SELECT oficio, COUNT(*) "Nº empleados" FROM empleados GROUP BY oficio
	HAVING COUNT(*) >= 2;
    
# 3
SELECT oficio, COUNT(*) num, SUM(salario) "salario" FROM empleados
	WHERE salario >= 1400
		GROUP BY oficio HAVING num >= 2;
    
# 9 Consulta Multitabla  
# 1 
SELECT e.emp_no, e.apellido,
	d.dep_no, d.dnombre, d.localidad
		FROM empleados e, departamentos d WHERE e.dep_no = d.dep_no;

# 2
SELECT e.dep_no, d.dnombre, COUNT(*) cantidad FROM 
	empleados e, departamentos d WHERE e.dep_no = d.dep_no
		GROUP BY d.dnombre, e.dep_no;

# 3
SELECT pedidos.pedido_no, productos.producto_no, productos.descripcion,
	productos.precio FROM productos, pedidos
		WHERE pedidos.producto_no = productos.producto_no;
        
# 4
SELECT pedidos.pedido_no, pedidos.cli_no, productos.producto_no,
	productos.descripcion, productos.precio FROM productos, pedidos
		WHERE pedidos.cli_no = 106 &&
			pedidos.producto_no = productos.producto_no;
            
# 5
SELECT pedidos.pedido_no, pedidos.cli_no, productos.producto_no,
	productos.descripcion, productos.precio, clientes.* FROM productos, pedidos, clientes
		WHERE pedidos.cli_no = 106 &&
			pedidos.producto_no = productos.producto_no && clientes.nombre
				LIKE 'SIGNOLOGIC*' && clientes.cli_no = 160;
                
SELECT * FROM clientes WHERE nombre = 'SIGNOLOGIC S.A.';