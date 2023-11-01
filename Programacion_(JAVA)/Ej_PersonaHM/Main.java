import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<>();
		Persona hombre = new Hombre("Pepe", "01/01/2001");
		
		personas.add(hombre);
		Persona hombre2 = new Hombre("Juan", "11/12/2004");
		personas.add(hombre2);
		personas.add(new Mujer("Maria", "11/07/1998"));
	}

}
