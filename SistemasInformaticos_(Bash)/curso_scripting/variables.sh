#!/bin/bash
# Variables en scripting

christian="Hola mi nombre es Christian, estoy dentro del script"
numA=15
numB=5



echo $CHRISTIAN #VARIABLE DE ENTORNO
echo $christian #VARIABLE DE USUARIO
echo "======================================"
echo "Operadores Aritméticos entre $numA y $numB"
echo "$numA + $numB = " $((numA + numB))
echo "$numA - $numB = " $((numA - numB))
echo "$numA * $numB = " $((numA * numB))
echo "$numA / $numB = " $((numA / numB))
echo "$numA % $numB = " $((numA % numB))
echo "${numA}^$numB = " $((numA ** numB))

echo "======================================"
echo "Operadores Relacionales entre $numA y $numB, 0=false y 1=true"
echo "$numA > $numB" = $((numA > numB))
echo "$numA < $numB" = $((numA < numB))
echo "$numA >= $numB" = $((numA >= numB))
echo "$numA <= $numB" = $((numA <= numB))
echo "$numA == $numB" = $((numA == numB))
echo "$numA != $numB" = $((numA != numB))

echo "======================================"
echo "Operadores de Asignación entre $numA y $numB"
echo "$numA += $numB = " $((numA += numB))
echo "$numA -= $numB = " $((numA -= numB))
echo "$numA *= $numB = " $((numA *= numB))
echo "$numA /= $numB = " $((numA /= numB))
