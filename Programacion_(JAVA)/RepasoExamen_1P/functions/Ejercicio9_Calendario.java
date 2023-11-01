package examen.functions;

public class Ejercicio9_Calendario {
	
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
    
    public static boolean esBisiesto(int year) {
    	if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public static int cantidadDias(int month, int year) {
    	int dias=-1;
    	switch(month) {
    	case 4, 6, 9, 11:
    		dias = 30;
    		break;
    	case 2:
    		if(esBisiesto(year)) {
    			dias = 29;
    		} else {
    			dias = 28;
    		}
    		break;
    	default:
    		dias = 31;
    		break;
    	}
    	return dias;
    }
    
    public static void printCalendar(int month, int year) {
    	int diasMes = cantidadDias(month, year);
    	int diaSem = diaSemana(1, month, year);
    	int cuenta = diaSem;
    	
    	//Imprimimos la cabecera
    	System.out.println(" L  M  X  J  V  S  D");
    	//Hacemos un bucle para los " " desde el 1ºDia de la semana
    	for(int i = 1; i <= diaSem; i++) {
    		System.out.print("   ");
    	}
    	
    	//Hacemos el bucle principal que imprimira hasta los diasMes
    	for(int i = 1; i <= diasMes; i++) {
    		//Si el dia es < 10, imprime un " " extra para cuadrarlo mejor
    		if (i <= 9) {
    			System.out.print(" ");
    		}
    		//Imprimimos el dia en si + " "
    		System.out.print(i + " ");
    		cuenta++;
    		//Si el dia de la semana por el que vaya i es 6, imprimimos \n
    		if (cuenta == 7) {
    			System.out.print("\n");
    			cuenta = 0;
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printCalendar(2, 2022);

	}

}
