
public class EjercicioIII_3 {
	
	public static int minimo(int a, int b) {
		if (a <= b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void numEntreEllos(int a, int b) {
		int mayor = EjercicioIII_1.maximo(a, b);
		//int menor = (EjercicioIII_1.maximo(b, a) == a)? b : a;
		int menor = minimo(a, b);
		System.out.println("Los números entre " + menor + " y " + mayor + " son: ");
		for(int i = menor+1; i < mayor; i++) {
			System.out.print(i + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numEntreEllos(58, 45);
	}

}
