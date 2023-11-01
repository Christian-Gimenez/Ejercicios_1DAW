#!/bin/bash
# Ej: Comparar 2 String

cadena1=""
cadena2=""
igual="\tLas cadenas son iguales"
distinto="\tLas cadenas son distintas"

read -p "Introduce la 1ª cadena: " cadena1
read -p "Introduce la 2ª cadena: " cadena2

echo "***** COMPARAR CADENAS SIN MODIFICAR *****"
if [ $cadena1 = $cadena2 ]; then
	echo -e $igual
else
	echo -e $distinto
fi

echo -e "\n"

echo "***** COMPARAR CADENAS ToLowerCase *****"
if [ ${cadena1,,} = ${cadena2,,} ]; then
	echo -e "${igual,,}"
else
	echo -e "${distinto,,}"
fi

echo -e "\n"

echo "***** COMPARAR CADENAS ToUpperCase *****"
if [ ${cadena1^^} = ${cadena2^^} ]; then
	igual_mayus="${igual^^}"
	igual_mayusTab="${igual_mayus/\\T/\\t}"
	echo -e "$igual_mayusTab"
else
	distinto_mayus="${distinto^^}"
	distinto_mayusTab="${distinto_mayus/\\T/\\t}"
	echo -e "$distinto_mayusTab"
	# echo -e "${distinto^^/\\T/\\t}" SOLUCION QUE NO FUNCIONA
fi

