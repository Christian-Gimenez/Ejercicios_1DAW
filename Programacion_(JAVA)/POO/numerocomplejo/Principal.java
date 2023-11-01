package numerocomplejo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo complejo1 = new Complejo(5, -8);
		Complejo complejo2 = new Complejo(7, 6);
		System.out.print("(" + complejo1.mostrarComplejo() + ") + (" + complejo2.mostrarComplejo() + ") = (");
		System.out.print(complejo1.suma(complejo2).mostrarComplejo() + ")\n");
		System.out.print("(" + complejo1.mostrarComplejo() + ") * (" + complejo2.mostrarComplejo() + ") = (");
		System.out.print(complejo1.producto(complejo2).mostrarComplejo() + ")\n");
	}

}
