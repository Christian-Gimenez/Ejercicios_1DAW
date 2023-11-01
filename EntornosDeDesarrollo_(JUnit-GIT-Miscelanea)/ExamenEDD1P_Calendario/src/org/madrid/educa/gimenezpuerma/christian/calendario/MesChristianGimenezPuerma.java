package org.madrid.educa.gimenezpuerma.christian.calendario;

public class MesChristianGimenezPuerma {
	
	public static int diasMesChristianGimenezPuerma(int mes) {
		int dias = 0;
		switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
		break;
		case 4, 6, 9, 11:
			dias = 30;
			break;
		case 2:
			dias = 28;
			break;
		}
		return dias;
	}
}
