import java.util.Scanner;
public class PotenciaNdeFormaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(potenciaRecursiva(2, 5));
	}
	
	//caso base b⁰ = 1
	//b^n = b * b^n-1
	public static double potenciaRecursiva(double base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else {
			return base * potenciaRecursiva(base, exponente-1);
		}
	}
	

}
