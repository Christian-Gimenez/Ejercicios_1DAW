import java.util.Scanner;
public class Calendario_MalHecho {
	
	public static int diaSemana(int m, int a, int d) {
		int resultado;
		
		resultado = ((a - 1)%7 + ((a - 1)/4 - (3*((a - 1)/100 + 1)/4))%7 + m + d%7)%7;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ESCRIBIR UN PROGRAMA, QUE HACIENDO USO DE FUNCIONES, VISUALICE UN CALENDARIO DE LA FORMA:
		 * L  M  X  J  V  S  D
		 *       1  2  3  4  5
		 * 6  7  8  9  10 11 12
		 * 13 14 15 16 17 18 19
		 * 20 21 22 23 24 25 26
		 * 27 28 29 30
		 * 
		 * LA FORMULA QUE PERMITE CONOCER EL DIA DE LA SEMANA CORRESPONDIENTE A UN MES Y UN AÑO ES:
		 * Para meses enero y febrero:
		 * n = a + 31*(m-1) + d*(a-1) div 4 - 3 * ((a+99)div 100 + 11) div 4
		 * 
		 * Resto Meses:
		 * n = a + 31*(m-1) + d - (4*m + 23) div 10 + a div 4 - (3*(a div 100 + 1)) div 4
		 * */
		Scanner teclado = new Scanner(System.in);
		int mes, anyo, dia;
		
		
		System.out.print("Introduce el mes en formato numérico: ");
		mes = teclado.nextInt();
		
		System.out.print("Introduce el año: ");
		anyo = teclado.nextInt();
		
		
		printCalendario(mes, anyo);
	}
	
	public static void printCalendario(int mes, int anyo) {
		//int i = 0;
		String l="", m="", x="", j="", v="", s="", d="";
		int mesMax = 0, empiece2Semana, lun, mar, mier, juev, vier, sab, dom, dia;
		
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			mesMax = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			mesMax = 30;
			break;
		case 2:
			if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {
				mesMax = 29;
			} else {
				mesMax = 28;
			}
			break;
		}
		
		System.out.println("L  M  X  J  V  S  D");
		
		if (diaSemana(mes, anyo, 1) == 0) {
			l = "" + 1;
			m = "" + 2;
			x = "" + 3;
			j = "" + 4;
			v = "" + 5;
			s = "" + 6;
			d = "" + 7;
			empiece2Semana = 8;
		} else if (diaSemana(mes, anyo, 1) == 1) {
			l = "  ";
			m = "" + 1;
			x = "" + 2;
			j = "" + 3;
			v = "" + 4;
			s = "" + 5;
			d = "" + 6;
			empiece2Semana = 7;
		} else if (diaSemana(mes, anyo, 1) == 2) {
			l = "  ";
			m = "  ";
			x = "" + 1;
			j = "" + 2;
			v = "" + 3;
			s = "" + 4;
			d = "" + 5;
			empiece2Semana = 6;
		} else if (diaSemana(mes, anyo, 1) == 3) {
			l = "  ";
			m = "  ";
			x = "  ";
			j = "" + 1;
			v = "" + 2;
			s = "" + 3;
			d = "" + 4;
			empiece2Semana = 5;
		} else if (diaSemana(mes, anyo, 1) == 4) {
			l = "  ";
			m = "  ";
			x = "  ";
			j = "  ";
			v = "" + 1;
			s = "" + 2;
			d = "" + 3;
			empiece2Semana = 4;
		} else if (diaSemana(mes, anyo, 1) == 5) {
			l = "  ";
			m = "  ";
			x = "  ";
			j = "  ";
			v = "  ";
			s = "" + 1;
			d = "" + 2;
			empiece2Semana = 3;
		} else if (diaSemana(mes, anyo, 1) == 6) {
			l = "  ";
			m = "  ";
			x = "  ";
			j = "  ";
			v = "  ";
			s = "  ";
			d = "" + 1;
			empiece2Semana = 2;
		} else {
			l = "  ";
			m = "  ";
			x = "  ";
			j = "  ";
			v = "  ";
			s = "  ";
			d = "  ";
			empiece2Semana = 1;
		}
		System.out.println(l + " " + m + " " + x + " " + j + " " + v + " " + s + " " + d);
		
		switch (empiece2Semana) {
		case 1:
			dia = 7;
			break;
		case 2:
			dia = 6;
			break;
		case 3:
			dia = 5;
			break;
		case 4:
			dia = 4;
			break;
		case 5:
			dia = 3;
			break;
		case 6:
			dia = 2;
			break;
		case 7:
			dia = 1;
			break;
		default:
			dia = 0;
			System.err.println("fuera de empiece2Semana");
			break;
			
		}
		
		
		for (int i = empiece2Semana; i <= mesMax; i++) {
			if (dia != 0) {
				for (int k = 1; k <= dia; k++) {
					System.out.println(i + "  ");
				}
				dia = 7;
				System.err.println("fuera de bucle imprimir");
			}
			
		}	
	}
	
	

}
