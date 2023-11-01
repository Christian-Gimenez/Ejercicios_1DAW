#!/bin/bash

# Pide al usuario que ingrese su edad
# Si la edad es menor a 18, imprime un mensaje de salida y termina el script
# Si la edad es mayor o igual a 18, imprime un mensaje de bienvenida y un saludo personalizado

# Pide al usuario que ingrese un número entre 1 y 10
# Si el número ingresado no está en ese rango, imprime un mensaje de error y termina el script
# Si el número ingresado está en el rango, genera un número aleatorio entre 1 y 10 y compáralo con el número ingresado por el usuario
# Si los números son iguales, imprime un mensaje diciendo que el usuario ha ganado
# Si los números son diferentes, imprime un mensaje diciendo que el usuario ha perdido

# Utiliza las estructuras de control if y while

# Variables
edad=0
nombre=""

# Funciones
function ganador {
	if (( $1 > $2 )); then
		echo "¡ENHORABUENA! ¡¡¡Has ganado el juego!!!"
	else
		echo "GAME OVER... Has perdido el juego :("
	fi
}

function validarNumero {
	if echo "$1" | grep -q -v '^[0-9]\+$'; then
		return 1
	else
		return 0
	fi
}

function pedirNumero {
	read -p "Ingresa un número entre 1 y 10: " numero
	if (( numero >= 1 && numero <= 10 )); then
		echo "$numero"
	else
		echo "Error, el numero no está en el rango [1-10]"
	fi
}

juegoNumero () {
	read -p "Ingresa tu nombre: " nombre
	read -p "Ingresa tu edad: " edad
	if [ $edad -lt 18 ]; then
		echo "Eres menor de edad. Programa finalizado"
		return
	elif [ $edad -ge 18 ]; then
		echo "Bienvenido $nombre"
	fi
	puntuacionUser=0
	puntuacionCPU=0
	echo -e "\n"
	echo "*****QUE COMIENCE EL JUEGO*****"
	while (( puntuacionUser < 5 && puntuacionCPU < 5 )); do
		numUser=$(pedirNumero)
		if validarNumero "$numUser"; then
			numAleatorio=$(( (RANDOM % 10) + 1 ))
			# numAleatorio=5 Descomentar solo para comprobar si el user puede ganar
			echo "Tu numero = $numUser | Numero CPU = $numAleatorio"
			if (( numAleatorio != numUser )); then
				echo "Ha ganado la máquina este turno..."
				puntuacionCPU=$(( puntuacionCPU + 1 ))
			else
				echo "$nombre has ganado este turno!"
				puntuacionUser=$(( puntuacionUser + 1 ))
			fi
			echo "Puntuacion actual: "
			echo "CPU: $puntuacionCPU"
			echo "$nombre: $puntuacionUser"
		else
			echo "$numUser"
		fi
	echo -e "\n"
	done
	ganador "$puntuacionUser" "$puntuacionCPU"
}

# Ejecutar el juego
juegoNumero
