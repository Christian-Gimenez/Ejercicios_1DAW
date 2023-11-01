package org.villablanca;

public class CalculadoraPrueba {
	
	//SUT de Calculadora metodo sumar
	public void testSumar() throws Exception {
		//A.A.A:

		//Inicializacion	-	Arrange
		Calculadora calculadora = new Calculadora();
		//Ejercitación	-	Act
		float resultadoObtenido = calculadora.sumar(5, 8.2f);
		float resultadoEsperado = 13.2f;
		//Aserción	-	Assert
		if(resultadoObtenido != resultadoEsperado) {
			throw new Exception("Error al sumar. He obtenido: '" + resultadoObtenido + "' y esperaba: '" + resultadoEsperado + "'");
		}	
	}
	
	//SUT de Calculadora metodo multiplicar
	public void testMultiplicar() throws Exception {
		//A.A.A:
		
		//Inicializacion	-	Arrange
		Calculadora calculadora = new Calculadora(); 
		//Ejercitación	-	Act
		float resultadoObtenido = calculadora.multiplicar(7, 9); 
		float resultadoEsperado = 63;
		//Aserción	-	Assert
		if(resultadoEsperado != resultadoObtenido) {
			throw new Exception("Error al multiplicar. He obtenido: '" + resultadoObtenido +
					"' y esperaba: '" + resultadoEsperado + "'");
		}
	}
	
	public static void main(String args[]) {
		CalculadoraPrueba prueba = new CalculadoraPrueba();
		
		try {
			prueba.testSumar();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			prueba.testMultiplicar();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
