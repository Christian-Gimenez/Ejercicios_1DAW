package poo;

public class Mi_Primera_Guitarra {

	public static void main(String[] args) {
		
		Guitarra Lucy = new Guitarra();
		
		Lucy.cambiarCuerpo(1);
		System.out.println("Mi guitarra es de cuerpo tipo " + Lucy.tipoCuerpo());
		
		Lucy.cambiarEscala(26.65);
		System.out.println("Su escala es " + Lucy.mostrarEscala());
		

	}

}
