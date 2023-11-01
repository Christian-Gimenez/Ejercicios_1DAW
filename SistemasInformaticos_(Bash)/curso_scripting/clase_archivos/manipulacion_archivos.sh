#!/bin/bash
# Manipular archivos
input_type=""
input_name=""
input_text=""

read -p "Deseas generar un directorio(1) o un archivo(2): " input_type
if (( $input_type == 1 )); then
	read -p "Ingresa el nombre del Directorio: " input_name
	mkdir -m 777 $input_name
elif (( $input_type == 2 )); then
	read -p "Ingresa el nombre + extensión del Archivo (ej: hola.txt): " input_name
	touch $input_name
	read -p "Introduce texto para el fichero $input_name: " input_text
	echo $input_text >> $input_name
	echo "Contenido del archivo $input_name: "
	cat $input_name
fi


