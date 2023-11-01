
public class Ejemplo3 {
	
	public static void miFuncion(int a2[], int b2[]) {
		a2[0] = 3 * 2 + 7;
		b2[0] = 5 + 2 * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [3];
		int b[] = new int [3];
		a[0] = 7;
		b[0] = 13;
		miFuncion(a, b);
		System.out.println(a);
		System.out.println(b);
	}

}
