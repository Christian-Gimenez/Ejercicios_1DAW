
public class EjercicioIII_5_Ramon {
	
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
	
	public static void calendario(int mes, int anio) {
		System.out.println(" L  M  X  J  V  S  D");
		for(int i=1; i<=31;i++) {
			if(i<=9) {
				System.out.print(" ");
			}
			System.out.print(i + " ");
			if(i % 7 == 0) {
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
