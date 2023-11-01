package clases;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Persona persona1, persona2; //Apunta a null
		//persona1 = new Persona(); //Ahora apunta a la dir.memoria correspondiente
		//persona2 = persona1; //Ahora ambas apuntan a la misma dir.memoria
		
		//Accedemos a la propiedad 'nombre' del objeto 'persona1'
		//System.out.println(persona1.nombre); //Null porque no se le ha asignado valor
		
		/*
		persona1.nombre = "Christian";
		persona1.edad = 27;
		System.out.println(persona1.nombre);
		System.out.println(persona1.edad);
		System.out.println(persona1.altura); //0
		*/
		
		/*
		persona2 = persona1; //Si ahora modificamos persona2, aun asi estamos modificando persona1
		persona2.altura = 1.8;
		persona2.nombre = "Raul";
		System.out.println(persona1.nombre);
		System.out.println(persona1.edad);
		System.out.println(persona1.altura); //0
		
		persona1.saludar();
		persona1.aniversarioNacimiento();
		System.out.println(persona1.edad);
		*/
		
		//Una vez protejemos con private los atributos
		Persona persona1 = new Persona("Christian", 27, 1.91);
		persona1.describir();
		Persona persona2 = new Persona("Miguel", 45, 1.80);
		persona2.describir();
	
	}

}
