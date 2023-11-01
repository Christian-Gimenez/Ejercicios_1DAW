#!/bin/bash
# Sentencia Case

opcion=""
read -p "Ingrese una Opción [A-B]: " opcion

if [ "$opcion" == "A" ] || [ "$opcion" == "a" ]; then
	echo "Entré al condicional 1"
else
	echo "No entré al condicional 1"
fi

case "$opcion" in 
	"A" | "a")
		echo "Ha ingresado la Opción A"
		;;

	"B" | "b")
		echo "Ha ingresado la Opción B"
		;;

	[C-Z] | [c-z])
		echo "Ha ingresado una Opción fuera del rango"
		;;

	*)
		echo "No ingresó una Opción válida"
		;;
esac
