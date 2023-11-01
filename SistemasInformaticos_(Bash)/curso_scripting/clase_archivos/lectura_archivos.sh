#!/bin/bash
# Lectura de archivos
input_name=$1
echo "=============LECTURA DE ARCHIVOS============="
cat $input_name
echo "=============Lectura de archivos LINEA POR LINEA============="
echo "IFS: (INTERNAL FIELD SEPARATOR), para leer linea por linea"
while IFS= read linea
do
	echo "== $linea =="
done < $input_name
