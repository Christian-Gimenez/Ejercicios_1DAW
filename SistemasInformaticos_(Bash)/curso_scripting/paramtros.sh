#!/bin/bash
# Ejemplificación de variables y parametros dinámicos

nombre=$1
apellido=$2
ubicacion=$(pwd)
echo "Hola mi nombre es $nombre $apellido y mi ubicación en el sistema es $ubicacion"
echo "La cantidad de parámetros enviados es: $#"
echo "Los parámetros enviados por el usuario son: $*"
