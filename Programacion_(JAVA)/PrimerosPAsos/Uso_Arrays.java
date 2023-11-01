
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Declaramos el array de tipo int con 5 posiciones
		int [] mi_matriz = new int[5];
		//int mi_matriz[] = new int[5] Tambien se puede declarar asi
		
		//Ahora inicializamos y asignnamos valores
		//al array en cada una de sus posiciones
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		*/
		//Para imprimir un valor almacenado en un indice concreto del array
		//System.out.println(mi_matriz[3]); 
		
		//Iniciar y declarar a la vez el array
		int [] mi_matriz = {
				5, 38, -15, 92, 71,
				85, 65, 25, 14, 78,
				108, 2, -12, 58, 0,
				12, 3, 67, -45, 204
				};
		
		//Tambien podemos hacerlo asi:
		//for (int i = 0; i < 5; i ++) {}
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
		}
		
		}	
}
