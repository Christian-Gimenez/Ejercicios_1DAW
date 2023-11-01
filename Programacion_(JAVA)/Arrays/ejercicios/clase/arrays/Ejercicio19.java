package ejercicios.clase.arrays;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] par = { 2, 4, 6, 8 };
		int[] impar = { 3, 5, 7 };
		boolean nohaymas = false;
		for(int i = 0; i < par.length + impar.length && !nohaymas; i++) {
			if (i < par.length) {
				System.out.println(par[i] + " es Par.");
			}
			
			if (i < impar.length) {
				System.out.println(impar[i] + " es Impar.");
			} else {
				nohaymas = true;
			}

		}
	}

}
