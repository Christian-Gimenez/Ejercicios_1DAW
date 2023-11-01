
public class manipula_cadenas_2 {
	public static void main(String[] args) {
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		String frase_resumen = frase.substring(0, 23)  + " para conseguir un curro cojonudo tras " + frase.substring(29, 57);
		//int ultimoCaracter = frase.length();
		//String frase_resumen = frase.substring(29, ultimoCaracter);
		System.out.println(frase_resumen);
		
		String lenguajeFrase = frase.substring(53, 57);
		
		String lenguajeAprender = "Java";
		
		if (lenguajeFrase.equals(lenguajeAprender)) {
			System.out.println("Efectivamente, debo aprender " + lenguajeAprender);
		} else {
			System.out.println("Si no quieres aprender Java, puedes aprender otro");
		}
				
	}
}
