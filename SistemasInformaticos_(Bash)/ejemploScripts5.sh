#!/bin/bash

# read:
# -p (prompt)
# -r (caracteres escape)
# -s (passwords)
# -n X (leer solo X caracteres)
# -d delim (continua hasta el delimitador)
read -p "Introduce dos números: " num1 num2 
echo "$num1 y $num2"

read -p "Introduce un número: "
echo "$REPLY"

while [ "$opcion" != 3 ]; do
    clear
    echo "1- Añadir usuario"
    echo "2- Mostrar usuarios"
    echo "3- Salir"
    read -p "-> " opcion
    case $opcion in
        1) echo "Usuario añadido";;
        2) echo "Mostramos usuario";;
        3) echo "Fin del programa";;
        *) echo "Opción errónea";;
    esac
    read -p "Pulsa cualquier tecla para continuar..." -n1
done

while : ; do
    clear
    echo "1- Añadir usuario"
    echo "2- Mostrar usuarios"
    echo "3- Salir"
    read -p "-> " opcion
    case $opcion in
        1) echo "Usuario añadido" ;;
        2) echo "Mostramos usuario" ;;
        3) echo "Salir"; break ;; # exit 0 sale del script, es mejor usar break
        *) echo "Opción errónea" ;;
    esac
    read -p "Pulsa cualquier tecla para continuar..." -n1
done
# printf

printf "Cadena: %s, Número entero: %d, Número flotante: %.2f" "Una cadena" 4 4,5678

# leer ficheros
OLD_IFS=$IFS
IFS=$'\n'

fichero=$1

#Leer un fichero
while IFS= read -r linea; do
    echo "$linea"
done < $fichero # Pasamos el fichero al while

#Leer un fichero y procesar linea por linea
while IFS= read -r linea; do
    echo "$linea"
    while IFS=',' read -r c1 c2 c3 c4; do
        echo "$c1;$c2;$c3;$c4"
    done <<< $linea # Como son datos de una variable, se deben pasar asi al while
done < $fichero

while IFS= read -r linea; do
    echo "$linea"
    while read -r -d ',' c1; do # Asi si cortaria por el delimitador ',' y lo almacenaria en la variable en cad vuelta 
        echo "$c1"
    done <<< $linea 
done < $fichero

readarray -t nomArr < "$fichero"

echo${nomArr[1]}
echo${nomArr[*]} #Imprime todo el array

