#!/bin/bash
# Enseñanza sobre Arrays

numeros=(1 2 3 4 5 6 7 8 9 10)
nombres=("diego bastidas" "julian pepe" "jennifer laura" "rosa flor" "miguel angel")
rangos=({A..Z} {20..30})
echo "====== Imprimir todos los valores ======"

echo "Arrreglo de Números: ${numeros[*]}"
echo "Arreglo de Nombres: ${nombres[*]}"
echo "Arreglo de Rangos: ${rangos[*]}"

echo "====== Tamaño de los arreglos ======"
echo "Numeros: ${#numeros[*]}"
echo "Nombres: ${#nombres[*]}"
echo "Rangos: ${#rangos[*]}"

echo "====== Manipular Arreglos ======"
unset numeros[0]
echo "${numeros[*]}"
numeros[0]=1
echo "${numeros[*]}"



# echo -e "====== Programa ======\n" 
#opcion=""
#textoIndice="Ahora indica un índice válido [0 - "
#indice=""
#textoValorAlojado="El valor alojado en el índice "
#textoError="Error, el índice no es válido"
#longNumeros=${#numeros[*]}
#longNombres=${#nombres[*]}
#longRangos=${#rangos[*]}

#read -p "Selecciona una opción:
#a) Numeros
#b) Nombres
#c) Rangos
#-> " opcion

#case $opcion in
#	a | A)
#		echo "Has seleccionado Numeros"
#		read -p "$textoIndice$((${#numeros[*]} - 1))] 
#-> " indice
#		if [ $indice -ge 0 ] && [ $indice -lt $longNumeros ]; then
#			echo "$textoValorAlojado$indice es: " ${numeros[$indice]}
#		else
#			echo "$textoError"
#		fi
#		;;
#
#	b | B)
#		echo "Has seleccionado Nombres"
#		read -p "$textoIndice$((${#nombres[*]} - 1))] 
#-> " indice
#		if [ $indice -ge 0 ] && [ $indice -lt $longNombres ]; then
#			echo "$textoValorAlojado$indice es: " ${nombres[$indice]}
#		else
#			echo "$textoError"
#		fi
#		;;
#
#	c | C)
#		echo "Has seleccionado Rangos"
#		read -p "$textoIndice$((${#rangos[*]} - 1))]
#-> "  indice
#		if [ $indice -ge 0 ] && [ $indice -lt $longRangos ]; then
#			echo "$textoValorAlojado$indice es: " ${rangos[$indice]}
#		else
#			echo "$textoError"
#		fi
#		;;
#	*)
#		echo "Opcion Inválida"
#		;;
#esac;
