use ventas;
# 1
CREATE VIEW datos_vendedores AS
SELECT emp_no, apellido, director, fecha_alta, dep_no
FROM empleados
WHERE oficio LIKE 'VENDEDOR';

# 2
CREATE VIEW resumen_dep1 AS
SELECT dep_no 'NºDepartamento', COUNT(emp_no) 'NºEmpleados',
SUM(salario) 'Suma Salarios', SUM(IFNULL(comision, 0)) 'Suma Comisiones'
FROM empleados
GROUP BY dep_no;

# 3
