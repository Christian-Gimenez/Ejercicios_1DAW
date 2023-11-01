#!/bin/bash
# Definición y uso de funciones
hola_mundo () {
	echo "Hola mundo"
}

function parametros {
	echo "Hola soy $1 y me gusta $2"
}

hola_mundo
read -p "Ingrese su nombre: " nombre
read -p "Ingrese su hobby: " hobby
parametros "$nombre" "$hobby"
