
public class EjercicioIII_5 {

	public static int diaSemana(int dia, int mes, int anio) {
		int resultado;
		if (mes < 3) {
			resultado = anio;
			resultado = resultado + (31 * (mes-1));
			resultado = resultado + (int)(dia * (anio -1)/ 4);
			resultado = resultado - (int)(3 * ((int)((anio + 99)/100))/4);
			
		} else {
			resultado = anio;
			resultado = resultado + (31 * (mes-1));
			resultado = resultado + (dia - (int)((4 * mes + 23)/10));
			resultado = resultado + (int)(anio / 4);
			resultado = resultado - (int)(3*(int)(anio/100) + 1)/4;
			resultado = resultado - 1;
		}
		resultado = (resultado + 6) % 7;

		return resultado;
	}
	
	public static boolean esBisiesto(int anio) {
		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public static int diasDelMes(int mes, int anio) {
		int cantidadDias;
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			cantidadDias = 31;
			break;
		case 4, 6, 9, 11:
			cantidadDias = 30;
			break;
		case 2:
			if (esBisiesto(anio)) {
				cantidadDias = 29;
			} else {
				cantidadDias = 28;
			}
				break;
		default:
			cantidadDias = -1;
			break;
			}
		
		return cantidadDias;
	}
	
	
	
	public static void printCalendario(int mes, int anio) {
		int primerDia = diaSemana(1, mes, anio);
		int cantidadDias = diasDelMes(mes, anio);
		
		System.out.println(" L  M  X  J  V  S  D");
		for(int i = 1; i <= primerDia; i++) {
			System.out.print("   ");
		}
		for(int i = 1; i <= cantidadDias; i++) {
			if(i<=9) {
				System.out.print(" ");
			}
			System.out.print(i + " ");
			if(diaSemana(i, mes, anio) == 6) {
				System.out.print("\n");
			}
		}	
	}
	
	public static void main(String[] args) {
		/*Definir una funcion llamada diaSemana que reciba un dia, un mes y un año
		 * */
		printCalendario(2, 2020);
	}

}
