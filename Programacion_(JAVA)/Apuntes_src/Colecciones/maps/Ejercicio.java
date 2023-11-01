package org.villablanca.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio {

	public static void main(String[] args) {
		Map<String, Double> tabla = new HashMap<>();
		tabla = new LinkedHashMap<>();
		tabla = new TreeMap<>();
		tabla.put("Ana", 1.65);
		tabla.put("Marta", 1.72);
		tabla.put("Pedro", 1.71);
		tabla.put(null, 0.0);
		tabla.put("", 0.0);
		System.out.println(tabla);
		
		
		System.out.println(tabla.containsKey("Ana"));
		System.out.println(tabla.containsValue(1.65));
		tabla.remove("Ana");
		tabla.put("Ana", 1.94);

		Double altura = tabla.get("Ana");
		System.out.println(altura);
		
		Set<String> claves = tabla.keySet();
		Iterator<String> it = claves.iterator();
		while(it.hasNext()) {
			String elemento = it.next();
			System.out.println(elemento);
			if(elemento == null || elemento.equals("")) {
				it.remove();
			}
		}
		System.out.println(tabla);
		
		Collection<Double> valores = tabla.values();
	}

}
