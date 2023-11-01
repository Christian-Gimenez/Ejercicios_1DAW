package repaso.examen.arrays;

public class Ej4_IntercambiarMinYMax {
	
	public static int elMenor(int[] array) {
		int menor = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		return menor;
	}
	
	public static int elMayor(int[] array) {
		int mayor = array[0];
		for(int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	public static void intercambiar(int este, int porEste, int array[]) {
		for(int i = 0; i < array.length; i++) {
			if (array[i] == este) {
				array[i] = porEste;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
	}
	
	public static void main(String[] args) {
		int[] a = { -10, 445, 700, 9, 234, 700, -10, 230};
		int[] b = 	{ 34, 12 ,142, 1, 556, 8, 556, 3 }; 
		System.out.println("Los arrays originalmente eran:");
		System.out.print("A: ");
		printArray(a);
		System.out.print("\nB: ");
		printArray(b);
		
		int elMinDeA = elMenor(a);
		int elMaxDeB = elMayor(b);
		System.out.println("\nEl Mínimo de A es: [" + elMinDeA + "]");
		System.out.println("El Máximo de B es: [" + elMaxDeB + "]");
		
		intercambiar(elMinDeA, elMaxDeB, a);
		intercambiar(elMaxDeB, elMinDeA, b);
		
		System.out.println("Y después de intercambiar los mínimos de A \npor los Máximos de B (y viceversa) quedan:");
		System.out.print("A: ");
		printArray(a);
		System.out.print("\nB: ");
		printArray(b);

	}
}
