public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que muestre la suma de los 10 primeros números impares
		int resultado = 0;
		
		for(int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				resultado += i;
				if(i == 19) {
					System.out.print(i);
				} else {
					System.out.print(i + " + ");
				}
				
			}
		}
		System.out.print(" = " + resultado);
	}

}
