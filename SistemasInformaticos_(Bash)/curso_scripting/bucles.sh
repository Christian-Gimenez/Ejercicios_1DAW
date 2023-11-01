#!/bin/bash
# Enseñanza sobre bucles

numeros=(1 2 3 4 5 6 7 8)
nombres=("Sauron" "Freyja" "Laura Molina" "Christian Gimenez")
rangos=({a..z} {10..100})

echo "===== FOR EACH  ====="
for num in ${numeros[*]}
do
	echo "Numero: $num"
done

echo "======= F O R ======="
for ((i=0; i<${#numeros[*]}; i++))
do
	echo "Numero: ${numeros[i]}"
done
