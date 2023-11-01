USE ventas;

# 2 Select basicos
SELECT * FROM empleados;

SELECT emp_no 'Nº Empleado', apellido 'Nombre y Apellidos', dep_no 'Nº Departamento' FROM empleados;

SELECT DISTINCT dep_no 'Nº Departamento' FROM empleados;

SELECT DISTINCT Oficio FROM empleados;

# 4.1 Select operadores aritmeticos
SELECT apellido 'Nombre y apellidos', Salario, Comision FROM empleados WHERE salario > comision * 3;

SELECT nombre 'Nombre Cliente', Localidad, lim_credito/1000 'Limite de Credito en Miles'
	FROM clientes WHERE localidad = 'MADRID';

# 4.2 Select opreadores comparacion
SELECT apellido 'Empleado', Oficio
	FROM empleados WHERE oficio = 'ANALISTA';
    
SELECT nombre 'Cliente', localidad 'Localidad' FROM clientes WHERE localidad != 'SEVILLA';

SELECT Oficio, Salario FROM empleados WHERE salario > 2000;

# 4.3 Select booleanos
SELECT apellido 'Empleado', dep_no 'Departamento'
	FROM empleados WHERE dep_no = 10 || dep_no = 30;
    
SELECT Apellido, Comision FROM empleados
	WHERE oficio = 'VENDEDOR' && comision > 300;

SELECT Apellido, Oficio, Salario FROM empleados
	WHERE oficio != 'VENDEDOR' && salario > 2000;
    
SELECT emp_no 'Nº Empleado', Apellido, Oficio, IFNULL(director, 'Ninguno') 'Director',
	fecha_alta 'Fecha Alta', Salario, dep_no 'Departamento'
    FROM empleados WHERE NOT oficio = 'VENDEDOR';
    
SELECT apellido 'Empleado', Oficio, Salario FROM empleados
	WHERE oficio != 'VENDEDOR' AND salario < 1500;

# 4.4 Selecto BETWEEN...AND... / NOT BETWEEN...AND...
SELECT apellido 'Empleado', Salario FROM empleados
	WHERE salario BETWEEN 2000 AND 3500;
    
SELECT descripcion 'Producto', Precio FROM productos
	WHERE precio NOT BETWEEN 300 AND 500;

#4.5 IN ( , , , ) / NOT IN ( , , , )
SELECT dnombre 'Departamento', Localidad FROM departamentos
	WHERE localidad IN ('MADRID', 'VALENCIA');
    
SELECT e.apellido 'Empleado', d.dnombre 'Departamento', d.localidad 'Localidad' 
FROM empleados e, departamentos d 
WHERE d.localidad IN (SELECT localidad FROM departamentos WHERE localidad IN ('MADRID', 'VALENCIA'))
GROUP BY d.localidad, e.apellido, d.dnombre;

SELECT pe.*, pr.* FROM pedidos pe, productos pr WHERE pr.precio > 500;

# 4.5 LIKE / NOT LIKE
SELECT * FROM departamentos WHERE localidad NOT LIKE '%e%';

SELECT * FROM departamentos WHERE localidad LIKE '_a%';

SELECT * FROM empleados WHERE apellido LIKE 'M%' AND salario BETWEEN 1000 AND 2000;

SELECT * FROM empleados WHERE apellido LIKE '%z';

# 4.8 IS NULL / IS NOT NULL
SELECT * FROM empleados WHERE comision IS NULL;

SELECT apellido 'Apellidos', Salario, IFNULL(comision, 0) 'Comision',
Salario + IFNULL(comision, 0) 'Salario + Comision'
FROM empleados;

# 4.9 EXISTS / NOT EXISTS - IN / NOT IN
SELECT * FROM clientes c WHERE EXISTS(
	SELECT d.localidad FROM departamentos d
    WHERE c.localidad = d.localidad
);

SELECT c.* FROM clientes c, departamentos d
WHERE c.localidad IN(d.localidad); 

SELECT c.nombre 'Nombre', c.cli_no 'Código Cliente'
FROM clientes c
WHERE EXISTS (
	SELECT p.cli_no FROM pedidos p WHERE p.cli_no = c.cli_no
) GROUP BY c.cli_no;

SELECT c.nombre 'Nombre', c.cli_no 'Código Cliente'
FROM clientes c, pedidos p
WHERE c.cli_no IN (p.cli_no) GROUP BY c.cli_no;
# 5 