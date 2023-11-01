#!/bin/bash

# <- Esto es un comentario

# Variables - Sensibles a mayus y minus, pueden empezar por "_" o una letra pero no un numero
saludo="Hola, mundo"

# Variables locales a una funcion
local saludo2="ola mundo"

# Constantes
declare -r saludo3="Epa, mundo"
readonly saludo4="Hey, mundo"

# Extraer valor Variables
echo $saludo
echo "Valor variable: $saludo" # Funciona igual que sin " "
echo 'Valor variable: $saludo' # Literalidad de lo que pongamos, no imprime el valor de la variable
echo 'Valor variable: '$saludo # Asi si imprime el valor de la variable
saludo3="adios, mundo" # No deja de funcionar pero te advierte de que NO puedes cambiar el valor de la constante

# Re-Asignar variables
saludo="Este es otro $saludo2"
saludo=$saludo3

# Agregar valor a la variable
saludo=$saludo$saludo2

# Para concatenar y que no confunda el nombre de la variable
saludo=${saludo}VER

# Variables del sistema 0-254, son variables que contienen los argumentos que se le pasan al script
echo "Argumento 0: $0, argumento1: $1, argumento 10: ${10}" # A partir del 10 hay que ${10}
echo "Numero de argumentos: $#" # Numero de argumentos que me pasan
echo "Todos los argumentos: $@" # Todos los argumentos
echo "Mi PID: $$" # PID del script
echo "usuario: $USER" # Usuario que ejecutó el script
echo "HOME: $HOME" # Directorio home del usuario que ejecutó el script

# Guardar salida comando
echo "El resultado de ls -all es:"
salida=$(ls -all)
salida=`ls -all`
echo $salida

# Pasar argumento al ls
salida=$(ls -all $1)
echo $salida

var1=1
var2=2

# Numeros y expresiones aritmeticas
num1=5
num2=2
suma1=$((num1 + num2))
suma2=$(expr $num1 + $num2)
suma3=`expr $num1 + $num2`
division=$((num1 / num2))
exp=$((num1 ** num2))
mod=$((num1 % num2))
num+=$((num1 += num1)) # Pero hace lo mismo que $((num1 + num1))
$((num1 += 1)) # Asigna +1 a num1

echo "Suma1: $suma1"
echo "Suma2: $suma2"
echo "Suma3: $suma3"
echo "Division: $division"
echo "Exp: $exp"
echo "Modulo: $mod"
echo $num1

let "num3 = $((num1 + num2))" # Hace el echo0 pero sin imprimirlo, es una forma de pasar por string una operacion, pasando por argumento una expresion en una string

# Cadenas
cadena="Unas cadenas"
echo "Length: ${#cadena}"
echo "minusculas: ${cadena,,}"
echo "MAYUSCULAS: ${cadena^^}"
echo "Primera letra minusculas: ${cadena,}"
echo "Primera letra MAYUSCULAS: ${cadena^}"
echo "letras a partir de n: ${cadena:5}"
echo "m letras a partir de n: ${cadenas:5:3}"
echo "letras a partir de n (pa'tras): ${cadena:(-3)}"
echo "sustituir: ${cadena/cad/doc}"
