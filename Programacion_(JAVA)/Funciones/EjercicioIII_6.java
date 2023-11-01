
public class EjercicioIII_6 {
	
	public static int sumaImpares(int n) {
		int resultado = 0;
		int contador = n;
		
		for(int i = 1; i <= n*2; i+=2) {
			resultado += i;
		}
		
		/*
		for(int i = 1; i<=n;i++) {
			resultado += (2*i)-1;
		}
		*/
		
		return resultado;
	}

	public static void main(String[] args) {
		//Escribir una funcion que sume los n primeros numeros impares
		System.out.println(sumaImpares(5));
	}

}
