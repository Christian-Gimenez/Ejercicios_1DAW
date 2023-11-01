
public class EjercicioIII_8 {
	
	public static void borrarPantalla() {
		System.out.print("\033[H\033[J");
		System.out.flush();
	}
	
	public static void retardo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
