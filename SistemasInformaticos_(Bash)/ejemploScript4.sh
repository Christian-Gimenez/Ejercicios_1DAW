#!/bin/bash

# while y until
while condicion = true; do
    comandos
done

until condicion != true; do
    comandos
done

contador=0
while [ $contador -lt 3 ]; do
    echo "res=$contador"
    contador=$((contador + 1))
done

contador=0
until [ $contador -gt 3 ]; do
    echo "res=$contador"
    contador=$((contador + 1))
done

contador=0
contador2=0
while [ $contador -lt 3 -a $contador2 -gt 0 ]; do
    echo "res=$contador"
    contador=$((contador + 1))
    contador2=$((contador2 - 1))
done

contador=0
contador2=3
until [ $contador -ge 3 -o $contador2 -le 0 ]; do
    echo "res=$contador"
    contador=$((contador + 1))
    contador2=$((contador2 - 1))
done

continue #Para saltar la siguiente iteracion de un for
break #Salir del bucle

# Funcion
# La funcion tiene que declararse antes de usarse
function nom_func {
    comandos
}

nom_func() {
    comandos
} < datos

# Como no se puede devolver, hay que llamarla metiendo su valor en una variable
#el cual sera el valor que de el ultimo 'echo'
resultado=$(nom_func)


function f {
    echo "$1"
    return 100
}
echo "$1"

f "Sin sustitucion"

echo "return=$?,retorno=$r"

r=$(f "con sustitucion")

# $? guarda lo del return, pero solo sirve para int positivos < 200 y pico
echo "return=$?,retorno=$r"

# Funcion que devuelve el numero mayor
function mayor {
    if [ "$1" -gt "$2" ]; then
    local var=30 # podemos hacer variables locales con "local"
        echo $1
    elif
        echo $2
    fi
}

resultado=$(mayor 23 4)

echo "El mayor es " $resultado
