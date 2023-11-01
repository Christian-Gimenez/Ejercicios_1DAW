
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracterHexadecimal = '\u0061'; //Imprime una a, la barra u indica que aqui va un carácter unicode
		char caracterDecimal = 97; //Imptime una a
		//System.out.println(caracterHexadecimal);
		//System.out.println(caracterDecimal);
		//Imprimimos todas las letras del abcdario
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
		char caracter = 'h' + 'A' - 'a'; //Calculamos la distancia que hay entre mayusculas y menores

		
		//Devuelve true/false si una var tipo char es un DIGITO numerico
		Character.isDigit(caracter); //false porque 'a' no es un digito numerico
		
		caracter = '0';
		//caracter = 48;
		//caracter = \u0030;
		Character.isDigit(caracter); //true porque '0' es un digito numerico
		
		Character.isLetter(caracter); // true si es un caracter (letra)
		Character.isLetterOrDigit(caracter); //true si es un digito OR caracter
		
		Character.isUpperCase(caracter); //true si es mayusculas
		Character.isLowerCase(caracter); //true si es minusculas
		
		Character.isSpaceChar(caracter); //true si es un espacio en blanco
		
		Character.toLowerCase(caracter); //Convierte el caracter en minúsculas
		Character.toUpperCase(caracter); //Convierte el caracter a mayuscula
		
		/*CARCTERES DE ESCAPE \
		\n = Salto de línea
		\r = Retorno de carro
		\' = Comilla simple
		\" = Comilla doble
		\\ = Barra invertida
		*/
		
		String cadena1 = "Hola mundo!";
		String cadena2 = " mundo!";
		//System.out.println(cadena1.equals(cadena2)); //Compara 2 cadenas
		
		//.regionMatches busca en una cadena de caracteres si dentro de la cadena indicada está el contenido de la otra
		cadena1.regionMatches(4, cadena2, 0, 5); // true (desdeDonde, cadena2, desdeDonde2, cuantosChar)
		cadena1.regionMatches(true, 4, cadena2, 0, 5); // true, igual que antes pero el 1er argumento ignora mayus
		
		cadena1 = "Alondra";
		cadena2 = "Pingüino";
		cadena1.compareTo(cadena2); //Compara alfabeticamente: devuelve 0 si son iguales, -negativo si la cadena1 < cadena2, y +positivo si cadena1 > cadena2 (las Mayus van antes que las minus)
		String cadena3 = cadena1 + cadena2;

		
		cadena1.charAt(0); //Imprime el caracter del indice 0
		cadena1.length(); //Indica la longitud de la cadena = 7
		
		String laMancha = "En un lugar de la mancha";
		laMancha.substring(6, 11); //El primero que quiero, el último que no quiero
		laMancha.substring(6); //Sobrecargada con 1parametro desde donde indiquemos hasta el final
		laMancha.indexOf('n'); //devuelve la posición la primera ocurrencia de ese caracter, si no lo encuentra devuelve -1
		laMancha.indexOf('n', 2); //Para buscar la siguiente
		laMancha.indexOf("un"); //Podemos buscar cadenas
		laMancha.indexOf("n ", 2); //Para buscar la siguiente
		
		String cadenaVacia = "";
		cadenaVacia.isEmpty(); //Evalua si está vacia, da true
		laMancha.contains("lugar"); //Busca si contiene esa cadena, si la encuntra da true
		laMancha.startsWith("En"); //Devuelve true si empieza por "En"
		laMancha.endsWith("mancha"); //Si acaba en "mancha".
		cadena1.replaceAll("ondra", ""); //Reemplaza-Elimina la substring que indiquemos de la string
		
		cadena1.trim(); //Elimina todos los espacios del principio y del final de la cadena de caracteres, dejando solo los de en medio
	}

}
