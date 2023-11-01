#!/bin/bash
# Autor: Christian M. Giménez Puerma - 1ºDAW

# Funciones
# Muestra el menu al usuario
mostrarMenu () {
	opcion=""
	echo -e "\tSelecciona una opción, por favor:"
	echo -e "\t---------------------------------"
	echo -e "\t1. Mostrar información de la tarjeta de red."
	echo -e "\t2. Mostrar información de memoria."
	echo -e "\t3. Mostrar información del disco."
	echo -e "\t4. Mostrar carga de la CPU."
	echo -e "\t5. Mostrar información de las cuentas de usuario."
	echo -e "\t6. Mostrar el nombre del host y el tiempo de funcionamiento."
	echo -e "\t0. Salir"
}

# Muestra la información de la tarjeta de red principal
infoRed () {
		echo "Información de la tarjeta de red: "
		tarjetaRed=$(ip a | grep "enp0s3")
		echo "$tarjetaRed"
}

# Muestra la memoria disponible actualmente
infoMemoria () {
		# NOTA: Pensé en cut (con -d: delimitador de espacio) y seleccionar la 7ª columna con -7f
		# memLibre=$(free -hm | grep "Memoria:" | cut -d' ' -f7)
		# La salida de free -hm | grep "Memoria:" si que era correcta:
		# Memoria:       3,8Gi       841Mi       1,4Gi        18Mi       1,6Gi       2,8Gi
		# Pero tras varias pruebas, la opcion de cut -f7 no funciona, sólo cuando selecciono la 1ª columna con -f1
		# Por lo que he optado por usar read y sacar la 7ª columna
		memLibre=$(free -hm | grep "Memoria:")
		IFS=' '
		read -r c1 c2 c3 c4 c5 c6 c7 <<< "$memLibre"
		echo "La cantidad libre de memoria es: $c7"
}

# Muestra la capacidad libre de /
infoParticion () {
		particionLibre=$(df -h | grep "/dev/sda1")
		read -r c1 c2 c3 c4 c5 <<< "$particionLibre"
		echo "La capacidad libre de la partición raíz es: $c4"
}

# Muestra la carga de trabajo de la CPU los últimos 15 minutos
infoCPU () {
		# Primero sacamos la carga de CPU los ultimos 15 min con uptime, y cortamos el dato necesario
		cargaCpu=$(uptime | cut -d' ' -f14)
		# Sustituimos la ',' por '.' para evitar problemas
		cargaCpu=${cargaCpu/,/.}
		# Luego sacamos con nproc la cantidad de nucleos del sistema
		numNucleos=$(nproc)
		# Y calculamos la carga en porcentaje, ya que uptime nos da la carga siendo
		# 1.0 la cantidad de procesos que se ejecutan/esperan es == a la cantidad de Núcleos del Sistema.
		# Por lo que debemos dividir ese dato / cantidad de nucleos * 100 para sacar el porcentaje deseado.
		cargaEnPorcentaje=$(echo "scale=2; $cargaCpu / $numNucleos * 100" | bc) 

		echo "La carga promedio de la CPU durante 15 minutos es: $cargaEnPorcentaje%"

		# NOTA INFORMATIVA: Me fallaba la operacion $(( $cargaCpu / $numNucleos * 100 ))
		# por lo que investigué es que me convertia el resultado a entero, entonces al pasar a ser 0
		# me salia del while  así que di con el comando bc, que poniendo en un echo el "scale=2"
		# no solo saca 2 decimales si no que permite hacer la operación sin eliminar los mismos.
}

# Muestra la cuenta actual, la cantidad de cuentas y cuales de ellas son de usuario
infoUsuarios () {
		echo "La cuenta actual del sistema es: $(whoami)"

		cuentasRegistradas=0
		usersTotales=0
		# Contamos todas las lineas de /etc/passwd y filtramos las que son solo de user UID >= 1000
		while IFS=':' read -r c1 c2 c3 c4 c5; do
			if [ "$c3" -ge 1000 ]; then
				usersTotales=$((usersTotales + 1))
				#echo "$c1 $c2 $c3" <- Descomentar para comprobar que funciona el filtro
			fi 
			cuentasRegistradas=$((cuentasRegistradas + 1))
		done < /etc/passwd

		echo "El número de cuentas actualmente registradas en el sistema es: $cuentasRegistradas"
		echo "El número total de usuarios en el sistema es: $usersTotales"

}

# Muestra el tiempo que lleva activo el equipo
infoTiempoActivo () {
		echo "'$(hostname)' lleva activo: $(uptime -p)"

}

# Ejecuta las funciones anteriores dependiendo de la opción que elija el usuario
ejecutarOpcion () {
	case "$1" in
		"1") infoRed
		;;

		"2") infoMemoria
		;;

		"3") infoParticion
		;;
		
		"4") infoCPU
		;;

		"5") infoUsuarios
		;;

		"6") infoTiempoActivo
		;;

		"0") break
		;;

		*)
		echo "Opción incorrecta."
		;;
	esac
	if [ "$1" != "0" ]; then
		echo -e "\n"
		read -p "Pulsa cualquier tecla para continuar..." -n1
	fi
}


# Ejecución principal del programa
while [ "$opcion" != "0" ]; do
	clear
	mostrarMenu
	read -p "Entra la seleccion [0-6] > " -n1 opcion
	echo -e "\n"
	# Convierto a entero la cadena de texto y elimino \n ya que me fallaba
	opcion=${opcion/\n/}
	ejecutarOpcion "$opcion"
done

clear
echo "Programa terminado"
