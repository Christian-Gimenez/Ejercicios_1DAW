#!/bin/bash
ficheroCSV=""
ficheroHTML=""
tituloHTML="Sin titulo"
rutaHTML=""
encabezados="true"

function iniciarHTML {
    echo "<!DOCTYPE html>
    <html>
        <head>
            <meta charset="UTF-8"/>
            <title>"$1"</title>
        </head>
        <body style="f">
            <style>
            table, th, td {
                border: 1px solid black;
            }
            </style>
            <table>" > "$2"
}

function finalizarHTML {
    echo "
            </table>
        </body>
    </html>" >> "$1"
}

# Ejecución principal del programa
# Pedir datos al usuario
while [ ! -e "$ficheroCSV" ]; do
    read -e -p "Introduce la RUTA + NOMBRE FICHERO CSV a leer: " ficheroCSV
    if [ ! -e "$ficheroCSV" ]; then
        echo "Error, no existe el fichero: $ficheroCSV"
    fi
done

while [ ! -d "$rutaHTML" ]; do
    read -e -p "Introduce la RUTA del nuevo fichero HTML: " rutaHTML
        if [ ! -d "$rutaHTML" ]; then
            echo "Error, no existe la ruta: $ficheroHTML"
        fi
done

while [ ! -e "$ficheroHTML" ]; do
    read -p "Introduce el NOMBRE del nuevo HTML: " nombreHTML
    ficheroHTML=$rutaHTML$nombreHTML
    touch $ficheroHTML
    read -p "Titulo de tu tabla CSV: " tituloHTML
    if [ ! -e "$ficheroHTML" ]; then
        echo "UPS! Ha ocurrido un error al concatenar ruta con nombre"
    else
        echo "Fichero creado correctamente en la ruta: $ficheroHTML"
    fi
done

iniciarHTML "$tituloHTML" "$ficheroHTML"

#i=0
while IFS= read -r linea; do
    echo "<tr>" >> "$ficheroHTML"
    #i=$((i + 1))
    #echo "i= $i - Leida linea: $linea"
    if [ $encabezados == "true" ]; then
        #echo "$i Entra al if"
        #th=0
        while read -r -d ';' campo; do
            #th=$((j + 1))
            #echo "th= $th Leido el campo: $campo"
            echo "<th>$campo</th>" >> "$ficheroHTML"
        done <<< "$linea" 
        encabezados="false"   
    else
        #td=0
        while read -r -d ';' campo; do
            #td=$((td + 1))
            #echo "td= $td Leido el campo: $campo"
            echo "<td>$campo</td>" >> "$ficheroHTML"
        done <<< "$linea"
    fi
    echo "</tr>" >> "$ficheroHTML"
done < "$ficheroCSV"

finalizarHTML "$ficheroHTML"
