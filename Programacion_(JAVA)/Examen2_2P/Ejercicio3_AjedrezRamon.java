import java.util.Scanner;

public class Ejercicio3_AjedrezRamon {
	
	public static boolean valida(int x, int y) {
		boolean resultado = true;
		if(x > 8 || x < 1) {
			resultado = false;
		} else if (y > 8 || y < 1) {
			resultado = false;
		}
		
		return resultado;
	}
	
	public static boolean captura2Alfil(int posXAlfil, int posYAlfil, int posX, int posY) {
		boolean resultado = false;
		
		if (Math.abs(posXAlfil - posX) == Math.abs(posYAlfil - posY)) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public static boolean capturaAlfil(int posXAlfil, int posYAlfil, int posX, int posY) {
		boolean captura = false;
		//Avanzar alfil en diagonal principal
		int x = posXAlfil;
		int y = posYAlfil;
		
		while(valida(x, y)) {
			x++;
			y++;
			if(posX == x && posY == y) {
				captura = true;
			}
		}
		
		x = posXAlfil;
		y = posYAlfil;

		//Retroceder en diagonal principal
		while (valida(x, y)) {
			x--;
			y--;
			if(posX == x && posY == y) {
				captura = true;
			}
		}
		
		x = posXAlfil;
		y = posYAlfil;
		
		//Avanzar alfil en diagonal secundaria
		while (valida(x, y)) {
			x++;
			y--;
			if(posX == x && posY == y) {
				captura = true;
			}
		} 
		
		x = posXAlfil;
		y = posYAlfil;
		
		//Retroceder alfil en diagonal secundaria
		while (valida(x, y)) {
			x--;
			y++;
			if(posX == x && posY == y) {
				captura = true;
			}
		} 
		return captura;
	}
	
	public static boolean capturaTorre(int posXTorre, int posYTorre, int posX, int posY) {
		boolean captura = false;
		if(posXTorre == posX) {
			captura = true;
		} else if (posYTorre == posY) {
			captura = true;
		}
		
		return captura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posXAlfil, posYAlfil, posXTorre, posYTorre;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame posicion fila Alfil: ");
		posXAlfil = teclado.nextInt();
		
		System.out.print("Dame posicion columna Alfil: ");
		posYAlfil = teclado.nextInt();
		
		System.out.print("Dame posicion fila Torre: ");
		posXTorre = teclado.nextInt();
		
		System.out.print("Dame posicion columna Torre: ");
		posYTorre = teclado.nextInt();
		
	}

}
