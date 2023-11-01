#!/bin/bash


# Case - Sintaxis:
case $var in
    patron1)
        comando1
        comando2
        ;;
    patron2)
        comando1
        comando2
        ;;
    patronN)
        comando1
        comando2
        ;;
    *)
        comando1
        comando2
        ;;
esac

case $1 in
    *.txt)
        echo "Es un fichero de texto"
        ;;

    *.png)
        echo "Es un fichero de imagen (png)"
        ;;

    *.jpg | *.jpeg)
        echo "Es un fichero de imagen (jpg)"
        ;;

    *)
        echo "Es un fichero desconocido"
esac

ext=${1##*.} # Coge del primer argumento y substrae solo la extension

case $ext in
    txt)
        echo "Es un fichero de texto"
        ;;

    png)
        echo "Es un fichero de imagen (png)"
        ;;

    jpg | jpeg)
        echo "Es un fichero de imagen (jpg)"
        ;;

    *)
        echo "Es un fichero desconocido"
esac

# For - Sintaxis
for var in lista; do
...;...;
done

for var in 1 2 3 4 5 6 7 8 9 10 a b ce deee;
do
    echo $var
done

# iterar del 1 hasta el 30
for var in $(seq 1 30); do
    echo $var
done

# iterar del 1 hasta el 30 de 10 en 10
for var in $(seq 1 10 30); do
    echo $var
done

# iterar del 100 hasta el 30 de 10 en 10
for var in $(seq 30 -10 100); do
    echo $var
done

# iterar de 2 en 2 desde 1 hasta el valor de $lim
for var in $(seq 1 2 $lim); do
    echo $var
done

for var in $(ls); do
    echo $var
done

#Variable del sistema que indica el separador por defecto
IFS=$'\n' # si tu pones esto ahora separa por \n


for (( i=1; i<=10; i++ ))
do
    echo $i
done




