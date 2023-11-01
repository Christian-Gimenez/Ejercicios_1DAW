import java.util.Scanner;
public class Mientras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int contador = 10;
		
		while(contador > 0) {
			System.out.println(contador);
			//contador -=1;
			//contador = contador -1;
			contador--;
		}
		System.out.println("Lanzamiento!!!!");
		*/
		Scanner teclado = new Scanner(System.in);
		
		String PIN_VALIDO = "1234";
		String pin = "";
		
		while (!PIN_VALIDO.equals(pin)) {
			System.out.print("Dame el PIN: ");
			pin = teclado.nextLine();
			
			if (!PIN_VALIDO.equals(pin)) {
				System.out.println("PIN IVALIDO!!!");
			}
			
		}
		System.out.println("Bienvenido!!!");
		
	}

}
