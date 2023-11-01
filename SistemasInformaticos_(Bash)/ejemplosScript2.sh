#!/bin/bash

#test condicion; -> aunque se puede hacer tambien [ condicion ]
#test evalua si la expresion es 0 (true) o no

#if condicion; then
#    true -> 0 El programa ha funcionado, si no lanza otro (podemos mirarlo con         echo $?)
# else
#    false
#fi

if [ condicion ]; then
    echo "true"
else
    echo "false"
fi

#ejemplo
var1=1
if test $var1 -eq 1; then
    echo "true"
else
    echo "false"
fi

if [ $var1 -eq 1 ]; then
    echo "true"
else
    echo "false"
fi

if [ $var1 -eq 1 ]; then
    echo "true"; ls; grep;
elif [ expresion ]; then

fi

if [ condicion ]
then
    echo "true"
fi

if [ -e "$variable" ]; then  #Ponemos entre comillas "" la variable para asegurarnos de que el script no falla y sigue ejecutandose
fi

# ficheros
if [ -e "$fichero" ]; then #-e comprueba si existe el fichero
    ls -all $fichero
else
    echo "No existe el fichero $fichero"
fi

if [ -d "$directorio" ]; then #-f comprueba si el directorio
    ls -all $directorio
fi

#-f si existe y si es un fichero regular o e texto
#-h comprueba si es un enlace duro
#-r si se puede leer
#-w si se puede escribir
#-x si se puede ejecutar

#cadenas

cad1="Hola"
cad2="hola"

if [ "$cad1" = "$cad2" ]; then
    echo "Iguales"
else
    echo "Distintas"
fi

# Podemos convertirlas a minúsculas para poderlas comparar
if [ ${cad1,,} = ${cad2,,} ]; then
    echo "Iguales"
else
    echo "Distintas"
fi

# O a mayusculas
if [ ${cad1^^} = ${cad2^^} ]; then
    echo "Iguales"
else
    echo "Distintas"
fi

# Comparar si NO son iguales
if [ "$cad1" != "$cad2" ]; then
    echo "No son iguales"
else
    echo "Son iguales"
fi

# Ver si la cadena es vacía
if [ -z $cad1 ]; then
    echo "no vacia"
else
    echo "vacia"
fi

# Enteros > -gt | < -lt | = -eq | >= -ge | <= -le | != -ne
ent1=1
ent2=2
if [ $ent1 -eq $ent2 ]; then
    echo "Iguales"
else
    echo "Distintos"
fi

# Operador logico && -a
if [ $ent1 -eq $ent2 -a $? -ne 2 ]; then
    echo "ok"
else
    echo "no ok"
fi

# Operador logico || -o
if [ $ent1 -eq $ent2 -o $? -ne 2 ]; then
    echo "ok"
else
    echo "no ok"
fi

# Operador logico ! !
if [ $ent1 -eq $ent2 -a ! $? -ne 2 ]; then
    echo "ok"
else
    echo "no ok"
fi

# Si queremos usar && y || podemos usar una variable
res= [ $ent1 -eq $ent2 ] && [ $? -new 2 ]
# O ponerlo:
if [ $ent1 -eq $ent2 ] && [ $? -new 2 ]; then
    echo "ok"
else
    echo "no ok"
fi

# test con expresiones regulares
if [[ $ent1 -eq $ent2 ]]; then
    echo "Ok" #true es 0
else
    echo "No ok" #false es cualquier otra cosa
fi

# así si podemos usar == != < > >= <= pero SOLO para expresiones matemáticas
if (( $ent1 == $ent2 )); then
    echo "Ok" #true es 1
else
    echo "No ok" #false es 0
fi
