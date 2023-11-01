package org.villablanca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

//		List<Character> lista = new LinkedList<>();
//		lista.add('A'); lista.add('B'); lista.add('C');
//		//Podemos rellenar una lista no vacía sustituyendo todos sus elementos por el indicado
//		Collections.fill(lista, 'X');
//		System.out.println(lista); // [X, X, X]
		
//		Collection<Double> coleccion = new HashSet<>();
//		coleccion.add(1.56); coleccion.add(23.4); coleccion.add(-45.0);
//		//Podemos saber el máximo/minimo de una coleccion (Set o List)
//		System.out.println(Collections.max(coleccion)); //23.4
//		System.out.println(Collections.min(coleccion)); //-45.0
//		
//		Collection<Persona> personas = new TreeSet<>();
//		personas.add(new Persona("1234F","Pepe")); personas.add(new Persona("8974D","Alba"));
//		//También podemos pasarle un Comparator para cambiar el criterio
//		System.out.println(Collections.max(personas, new ComparadorPorNombre())); //Pepe
//		System.out.println(Collections.min(personas, new ComparadorPorNombre())); //Alba
		
//		List<Character> lista = new LinkedList<>();
//		lista.add('A'); lista.add('B'); lista.add('C');
//		//Podemos rotar hacia adelante (+n) o hacia atras (-n)
//		Collections.rotate(lista, 1); //[A,B,C] -> [C,A,B]
//		Collections.rotate(lista, -2); //[C,A,B] -> [A,B,C] -> [B,C,A]
		
//		List<Integer> lista = new ArrayList<>();
//		lista.add(1); lista.add(3); lista.add(1);
//		//Podemos sustituir todos los 1 por 99
//		Collections.replaceAll(lista, 1, 99);// [1,3,1] -> [99,3,99]
//		System.out.println(lista);
		
		/*
		 * List<Integer> lista = new ArrayList<>(); lista.add(3); lista.add(1);
		 * lista.add(5); //Ordenamos por orden natural Collections.sort(lista);//
		 * [3,1,5] -> [1,3,5] //Ordenamos bajo otro criterio, esta vez al revés
		 * Collections.sort(lista, Comparator.reverseOrder()); //[1,3,5] -> [5,3,1]
		 */		
//		
//		List<Persona> listPersonas = new LinkedList<>();
//		listPersonas.add(new Persona("1234F","Pepe")); 
//		listPersonas.add(new Persona("8974D","Alba"));
//		listPersonas.add(new Persona("2345A","Juan")); 
//		listPersonas.add(new Persona("3445K","Chema"));
//		//[Pepe,Alba,Juan,Chema] Cambia a Pepe por Juan 
//		Collections.swap(listPersonas, 0, 2);//-> [Juan,Alba,Pepe,Chema]
//
//		//Orden de entrada y con repetidos
//		List<Integer> arrayList = new ArrayList<>();
//		arrayList.add(2); arrayList.add(3); arrayList.add(3); arrayList.add(1); //[2,3,3,1]
//		List<Integer> linkedList = new LinkedList<>();
//		linkedList.add(2); linkedList.add(3); linkedList.add(3); linkedList.add(1);//[2,3,3,1]
//		
//		//SIN orden, SIN repetidos
//		Set<Integer> hashSet = new HashSet<>();
//		hashSet.add(2); hashSet.add(3); hashSet.add(3); hashSet.add(1);//[1,3,2]
//		
//		//CON orden natural ascendente, SIN repetidos
//		Set<Integer> treeSet = new TreeSet<>();
//		treeSet.add(2); treeSet.add(3); treeSet.add(3); treeSet.add(1);//[1,2,3]
//		
//		List<Integer> otraLista = new ArrayList<>();
//		otraLista.add(4); otraLista.add(5); otraLista.add(6);
//		Set<Integer> otroSet = new HashSet<>();
//		otroSet.add(7); otroSet.add(8); otroSet.add(9);
//		
//		//Es indiferente la colección, podemos añadir una a otra con addAll
//		linkedList.addAll(arrayList);//[2,3,3,1] -> [2,3,3,1,2,3,3,1]
//		arrayList.addAll(treeSet);//[2,3,3,1] -> [2,3,3,1,1,2,3]
//		//Pero los Set NO aceptan repetidos
//		hashSet.addAll(linkedList);//[3,1,2] SIN ORDEN
//		treeSet.addAll(hashSet);//[1,2,2] CON ORDEN
//		
//		//Por lo que añadiremos nuevas colecciones para ver que sí funciona:
//		hashSet.addAll(otraLista);//[3,1,2] -> [4,2,5,1,6] SIN orden/SIN repetidos
//		hashSet.addAll(otroSet);//[4,2,5,1,6,3] -> [9,4,2,5,7,1,6,3,8] SIN orden/SIN repetidos
//		treeSet.addAll(otraLista);//[1,2,3] -> [1,2,3,4,5,6] CON orden/SIN repetidos
//		treeSet.addAll(otroSet);//[1,2,3,4,5,6] -> [1,2,3,4,5,6,7,8,9] CON orden/SIN repetidos
//		
//		Collection<Persona> coleccion = new ArrayList<>();
//		
//		//Tenemos otra coleccion [2,3]
//		coleccion.add(2); coleccion.add(3);
//		//Por lo que en nuestras List/Set, quedaría:
//		arrayList.removeAll(coleccion);//[2,3,1,2,1] - [2,3] -> [1,1]
//		linkedList.removeAll(coleccion);//[2,3,1,2,1] - [2,3] -> [1,1]
//		hashSet.removeAll(coleccion);////[9,4,2,5,7,1,6,8] - [2,3] -> [4,8,6,1,9,5,7]
//		treeSet.removeAll(coleccion);//[1,2,4,5,6,7,8,9] - [2,3] -> [1,4,5,6,7,8,9]
//		
//		arrayList.size();//[1,1] = 2
//		linkedList.size();//[1,1] = 2
//		hashSet.size();//[4,8,6,1,9,5,7] = 7
//		treeSet.size();//[1,4,5,6,7,8,9] = 7
//		
//		//Calculamos la suma de los size de nuestras colecciones
//		int lengthTotal = arrayList.size()+linkedList.size()+hashSet.size()+treeSet.size();
//		//Creamos un array convencional de tipo Integer y tamaño = el de todas las colecciones
//		Integer[] arrayEnteros = new Integer[lengthTotal];
//		//Introducimos los datos de nuestras List y Set en el array
//		arrayEnteros = (Integer[]) arrayList.toArray();//[1,1]
//		arrayEnteros = (Integer[]) treeSet.toArray();//[1,1,1,4,5,6,7,8,9]
//		arrayEnteros = (Integer[]) linkedList.toArray();//[1,1,1,4,5,6,7,8,9,1,1]
//		arrayEnteros = (Integer[]) hashSet.toArray();//[1,1,1,4,5,6,7,8,9,1,11,4,5,6,7,8,9]
//		
//		//Podemos limpiar las colecciones y dejarlas sin elementos:
//		arrayList.clear();//[1,1] -> []
//		linkedList.clear();//[1,1] -> []
//		hashSet.clear();//[4,8,6,1,9,5,7] -> []
//		treeSet.clear();//[1,4,5,6,7,8,9] -> []
//		
//		List<Persona> listaPersonas = new ArrayList<>();
//
//		
//		coleccion.clear(); //Vaciamos la coleccion
//		coleccion.isEmpty();//Devuelve -> True
//		coleccion.add(new Persona("1234X", "Goku"));//Introducimos una Persona
//		coleccion.isEmpty();//Devuelve -> False
//		
//		coleccion.contains("1234X");//Devuelve -> True
//		coleccion.contains("dniInexistente");//Devuelve -> False
//		
//		Collection<Integer> coleccion = new ArrayList<>();
//		Collection<Integer> otraColeccion1 = new ArrayList<>();
//		Collection<Integer> otraColeccion2 = new ArrayList<>();
//		Collection<Integer> otraColeccion3 = new ArrayList<>();
//		
//		//coleccion = [1,9,2,8,3] 
//		//otraColeccion1 = [1,2,3]. otraLista2 [4,5,6], otraColeccion3 [1,9,0]
//		coleccion.containsAll(otraColeccion1);//true porque contiene 1,2,3
//		coleccion.containsAll(otraColeccion2);//false porque no contiene ni 4, ni 5, ni 6
//		coleccion.containsAll(otraColeccion3);//false porque aunque contiene 1 y 9, no contiene 0
//		
//		Iterator<Persona> it = coleccion.iterator();
//		while(it.hasNext()) {//Iterará hasta que no haya más elementos
//			System.out.println(it.next());//Podemos hacer lo que necesitemos
//		}
//		
//		//Sacará cada elemento de la lista a la instancia "persona"
//		for(Persona persona: listaPersonas) {//Iterará hasta que no haya más elementos
//			System.out.println(persona);//Podemos hacer lo que necesitemos
//		}
		
		//Ejmplos ID: Nombre, Dato: Altura
		
		//HashMap: NO los ordena.
		Map<String, Float> hashMap = new HashMap<>();
		hashMap.put("Ana", 1.70f); hashMap.put("Berto", 1.85f);
		hashMap.put("Carla", 1.59f);//NO añade repetidos
		
		//TreeMap: Los ordena por la ID, en este caso en alfabetico [Ana, Berto, Carla]
		Map<String, Float> treeMap = new TreeMap<>();
		hashMap.put("Ana", 1.70f); hashMap.put("Berto", 1.85f);
		hashMap.put("Carla", 1.59f);//NO añade repetidos
		
//		
//		TreeMap<Integer, String> map = new TreeMap<Integer, String>(Comparator.reverseOrder());
//		TreeSet<Double> set = new TreeSet<Double>(Comparator.reverseOrder());
//		
		//Da igual si es Hash/Tree
		//lo importante es que coincidan <tipoDatoID, tipoDatoElemento> 
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		HashMap<Integer, String> otroMap = new HashMap<Integer,String>();
		map.putAll(otroMap); //Añade a map todos los elementos de otroMap
		
		Integer valorID_aEliminar = new Integer(2);
		
		//Podemos eliminar un elemento del Map por su ID
		map.remove(valorID_aEliminar);//Busca el ID y elimina el elemento compelto
		
		
		map.put(1, "Pepe");
		//Remplazaría el VALOR del elemento con ID '1' por "Lucius" 
		map.replace(1, "Lucius");//El ID 1 pasaría a pertenecer de "Pepe" a "Lucius"
		
		Collection<String> otraColeccion = new ArrayList<>();
		
		//Devuelve todos los VALORES (sin los ID) en forma de colección
		Collection<String> coleccion = map.values();
		//Podemos apoyarnos en el .addAll de List/Set 
		otraColeccion.addAll(map.values());//Para meter el Map en una coleccion
		
		//Si la coleccion es: [ID:145, Valor:"Chris"][ID:982, Valor:"Laura"]
		int tamanioMap = coleccion.size();//Devuelve -> 2
		
		//Devuelve si contiene un elemento con el ID indicado
		map.containsKey(145);//true
		
		//Devuelve si contiene un elemento el Valor indicado
		map.containsValue("Laura");//true
		
//		List<Integer> lista = new ArrayList<>();
//		
//		//Si la lista es [1,4,1,5,2,3,7,1] -> Tiene 3 unos
//		int frecuenciaDeUnos = Collections.frequency(lista, 1); //Devuelve -> 3
//		
//		//Barajea la lista, la desordena
//		Collections.shuffle(lista);//
//		
//		//Invierte el orden de la lista, no por orden natural, si no por el orden actual
//		Collections.reverse(lista);//[1,3,5] -> [5,3,1]
		
		List<Persona> lista = new ArrayList<>();
		
		//Devuelve el elemento de la lista con el índice indicado
		Persona persona = lista.get(2);
		
		//Si en el indice 4 estaba "Pepe" lo sustituye por "Juan"
		Persona quitada = lista.set(4, new Persona("Juan"));//Y Devuelve "Pepe"
		
		//Si en el indice 4 estaba "Juan", mueve "Juan" al 5
		lista.add(4, new Persona("Luis")); //He inserta "Luis" en el 4
		
		//Si en el indice 5 estaba "Juan" lo elimina
		quitada = lista.remove(5);//Y devuelve el que quita ("Juan")
		
		//Busca por el .equals(), en este caso el Nombre y Devuelve el indice
		int indiceDeLuis = lista.indexOf("Luis");//Si no está, devuelve -1
		
		List<Character> listaChar = new LinkedList<>();
		
		//Si la List es: ['X','G','X','K','P','W','X','H']
		int ultimoIndiceValor_X = listaChar.lastIndexOf('A');//Devuelve el indice 6 
		
		//Este replaceAll es complejo, se debe hacer una funcion Lambda
		//valor tomará el valor de cada posicion, y si esta es 'X'
		//La sustituirá por el valor 'Z', si no por el valor '_'
		listaChar.replaceAll(valor -> valor == 'X'?'Z':'_');
		
		
		
	}

}
