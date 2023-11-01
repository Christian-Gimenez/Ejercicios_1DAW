package org.madrid.educa.gimenezpuerma.christianmiguel;
import org.madrid.educa.gimenezpuerma.christian.calendario.*;

import java.util.Scanner;

public class ChristianMiguelGimenezPuerma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un mes: ");
		int dias, mes;
		mes = teclado.nextInt();
		dias = MesChristianGimenezPuerma.diasMesChristianGimenezPuerma(mes);
		System.out.println("El " + mes + "º mes del año tiene: " + dias + " dia/s");
	}
}
