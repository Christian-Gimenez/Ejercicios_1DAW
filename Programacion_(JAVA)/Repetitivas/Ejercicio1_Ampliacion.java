
public class Ejercicio1_Ampliacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X),
		 * que muestre los números del 0-0-0-0-0 al 9-9-9-9-9,
		 * con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
		 * */
		
		//Declaramos las variables necesarias
		int dig1, dig2, dig3, dig4, dig5;
		String digito1 = "", digito2 = "", digito3 = "", digito4 = "", digito5 = "";
		
		/*En cada bucle iremos aumentando el valor de 0 a 9
		de manera que cada dígito aumentará y se reiniciará para mostrar desde el 0-0-0-0-0 al 9-9-9-9-9
		*/
		
		//Bucle para el digito más grande 'X'-x-x-x-x
		for(dig5 = 0; dig5 < 10 ; dig5++) {
			if (dig5 == 3) { //Cuando llegue a 3
				digito5 = "E"; //Cambia el 3 por una E
			} else {
				digito5 = "" + dig5; //Si no, deja el número correspondiente
			}
			
			//Bucle para el 2º digito más grande x-'X'-x-x-x
			for(dig4 = 0; dig4 < 10; dig4++) {
				if (dig4 == 3) {
					digito4 = "E";
				} else {
					digito4 = "" + dig4;
				}
				
				//Bucle para el digito 3er digito x-x-'X'-x-x
				for(dig3 = 0; dig3 < 10; dig3++) {
					if (dig3 == 3) {
						digito3 = "E";
					} else {
						digito3 = "" + dig3;
					}
					
					//Bucle para el 2º digito más pequeño x-x-x-'X'-x
					for(dig2 = 0; dig2 < 10; dig2++) {
						if (dig2 == 3) {
							digito2 = "E";
						} else {
							digito2 = "" + dig2;
						}
						
						//Bucle para el digito más pequeño x-x-x-x-'X'
						for(dig1 = 0; dig1 < 10; dig1++) {
							if (dig1 == 3) {
								digito1 = "E";
							} else {
								digito1 = "" + dig1;
							}
							
							/*Mostramos por pantalla el valor de cada dígito dentro del bucle más interno
							para que así se muestren en orden:
								0-0-0-0-0
								0-0-0-0-1
								0-0-0-0-3
								... hasta el 9-9-9-9-9*/
							System.out.println(digito5 + "-" + digito4 + "-" + digito3 + "-" + digito2 + "-" + digito1);
						}
					}
				}
			}
		}		
	}
}
