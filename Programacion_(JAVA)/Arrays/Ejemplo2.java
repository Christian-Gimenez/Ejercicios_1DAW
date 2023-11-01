
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		int b[];
		int[] c = null;
		
		a = new int[5];
		a[0] = 7;
		b = a; //Enlazamos el array a con el b, ambos apuntan a la misma dir. de memoria (tienen lo mismo)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a[0]);
		System.out.println(b[0]);
		b[0] = 13;
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		b = new int[12];
	}

}
