#!/bin/bash

anchoRombo=2
alturaPiramide=0

function piramide {
    altura=$1
    base=$((2 * $altura - 1))
    for (( i=1;i<=altura;i++ )); do
        for (( j=1;j<=base;j++ )); do
            if (( (j * altura ) <= (altura * altura) )); then
                echo -n " "
            else
                echo -n "*"
            fi
        done
        printf "\n"
    done
}

function rombo {
    ancho=$1
    for (( i=ancho;i>=0;i-- )); do
        if (( i > ancho/2 )); then
            for (( j=ancho;j>=0;j-- )); do
                if (( (j * i) >= (j * j) )); then
                    echo -n "*"
                else
                    echo -n " "
                fi
            done
        else
            for (( j=ancho;j>=0;j-- )); do
                if (( (j * i) >= (j * j) )); then
                    echo -n " "
                else
                    echo -n "*"
                fi
            done
        fi
        printf "\n"
    done
}


echo "¿Qué figura deseas hacer?"
echo "1. ROMBO"
echo "2. PIRÁMIDE"
echo "3. Ninguna, salir del programa"
read -p "Introduce opción -> " opcion

case "$opcion" in
    "1")
        echo "Has seleccionado ROMBO"
        read -p "Introduce el ancho, debe ser IMPAR: " anchoRombo
        while (( $anchoRombo % 2 == 0 )); do
            if (( $anchoRombo % 2 == 0 )); then
                echo "¡Error, el número debe ser IMPAR!"
                read -p "Introduce el ancho, debe ser IMPAR: " anchoRombo
            fi
        done
        echo "Aquí tienes tu rombo de anchura = $anchoRombo :"
        rombo $anchoRombo
    ;;

    "2")
        echo "Has seleccionad PIRÁMIDE"
        read -p "Introduce la altura de la pirámide: " alturaPiramide
        echo "Aquí tienes tu PIRÁMIDE de altura = $alturaPiramide :"
        piramide $alturaPiramide
    ;;

    "3")
        echo "Fin del programa"
    ;;

    *)
    echo "Opción incorrecta"
    ;;
esac
