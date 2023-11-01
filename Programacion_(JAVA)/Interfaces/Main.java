package org.villablanca;

import java.util.ArrayList;
import java.util.List;

import org.villablanca.ave.*;
import org.villablanca.aparato.*;
import org.villablanca.persona.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Hablar> hablan = new ArrayList<Hablar>();
		Loro loro = new Loro("Macho", 2, "Europa", "Azul");
		Piolin piolin = new Piolin("Macho", 6, "En la ducha", 10);
		Alumno alumno = new Alumno("Marta", 22, "Informatica", 3);
		Profesor profesor = new Profesor("Jesus", 35, "555-D", "txus@eside.deusto.e");
		Bedel bedel = new Bedel("Dani", 40, "Tarde", 10);
		Tv tv = new Tv(100, 30000, true, 28);
		Radio radio = new Radio(50, 15000, false, 25);
		hablan.add(loro);
		hablan.add(piolin);
		hablan.add(alumno);
		hablan.add(profesor);
		hablan.add(bedel);
		hablan.add(tv);
		hablan.add(radio);

		for(Hablar obj:hablan) {
			obj.hablar();
			System.out.println();
		}
		
		for(int i = 0; i < hablan.size(); i++) {
			hablan.get(i).hablar();
			System.out.println();
		}
	}

}
