package polinomio;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polinomio polinomio = new Polinomio(2);
		polinomio.agregarCoeficiente(2, 3);
		polinomio.agregarCoeficiente(1, 4);
		polinomio.agregarCoeficiente(0, 2);
		System.out.println(polinomio.mostrarPolinomio());
		System.out.println("P(2) = " + polinomio.evaluar(2));
	}
}
