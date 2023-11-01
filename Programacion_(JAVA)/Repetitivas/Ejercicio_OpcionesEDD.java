import java.util.Scanner;
public class Ejercicio_OpcionesEDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("1-Archivo\n"
					+ "2-Buscar\n"
					+ "3-Salir");
			System.out.print("Opción: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("ARCHIVO\n");
				break;
			case 2:
				System.out.println("BUSCAR\n");
				break;
			case 3:
				//System.out.println("SALIR\n");
				break;
			default:
				System.out.println("¡Opción Incorrecta!\n");
				break;
			}
		} while (opcion != 3);
		
	}

}
