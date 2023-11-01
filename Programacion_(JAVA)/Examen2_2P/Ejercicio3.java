import java.util.Scanner;

public class Ejercicio3 {
	
	public static int posicionPieza() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static String analizarJugada(int alfilFila, int  alfilColumn, int torreFila, int torreColumn) {
		String resultado="Ninguna captura";
		int posColAlfil=alfilColumn, posFilaAlfil=alfilFila;
		if (torreColumn == alfilColumn || torreFila == alfilFila) {
			resultado = "Torre captura";
		} else {
			for(int i = 1; i <= 8; i++) {
				
			}
			
			while (posColAlfil > 0 && posFilaAlfil > 0) {
				posColAlfil--;
				posFilaAlfil--;
				if (posColAlfil == torreColumn && posFilaAlfil == torreFila) {
					resultado = "Alfil captura";
				}
			}
			
			posColAlfil=alfilColumn;
			posFilaAlfil=alfilFila;
			while (posColAlfil < 8 && posFilaAlfil < 8) {
				posColAlfil++;
				posFilaAlfil++;
				
				if (posColAlfil == torreColumn && posFilaAlfil == torreFila) {
					resultado = "Alfil captura";
				}
			}
		}
		
		
		
		return resultado;
	}

	public static void main(String[] args) {
		//Tablero numeraadas de 1 a 8
		//Las piezas son alfil y torre.
		//
		int alfilFila=0, alfilColumn=0, torreFila=0, torreColumn=0;
		String resultadoJugada="";
		System.out.println("Actualmente queda en pie una torre y un alfil.");
		System.out.print("Fila alfil: ");
		alfilFila = posicionPieza();
		System.out.print("Columna alfil: ");
		alfilColumn = posicionPieza();
		
		System.out.print("Fila torre: ");
		torreFila = posicionPieza();
		System.out.print("Columna torre: ");
		torreColumn = posicionPieza();
		
		resultadoJugada = analizarJugada(alfilFila, alfilColumn, torreFila, torreColumn);
		
		System.out.println(resultadoJugada);
		
		
		

	}

}
