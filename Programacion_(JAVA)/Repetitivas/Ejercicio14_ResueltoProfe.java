public class Ejercicio14_ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma, impar;
		suma = 0;
		for(int i = 1; i <=10; i++) {
			impar = i * 2 - 1;
			suma = suma + impar;
			System.out.println(impar);
		}
		System.out.println("La suma de los numeros impares es " + suma);
	}

}
