import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<>();
		LinkedList<String> lista2 = new LinkedList<>();
		lista.add("Ana");
		lista.add("Pedro");
		lista.add("Miguel");
		
		for(String elemento:lista) {
			System.out.println(elemento);
		
		}
		
		//lista.clear(); -> Elimina todos
		lista.remove(0);
		lista.remove(0);
		for(int i = 0; i < lista.size(); i++) {
			String elemento = lista.get(i);
			System.out.println(elemento);
		}
		
		
	}

}
