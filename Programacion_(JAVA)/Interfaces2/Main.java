package org.villablanca;

import java.util.ArrayList;

import org.villablanca.serie.Serie;
import org.villablanca.videojuego.Videojuego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entregable> entregables = new ArrayList<Entregable>();
		entregables.add(new Serie());
		entregables.add(new Videojuego());
		entregables.add(new Serie("Big Bang Theory", "Mark Cendrowski"));
		entregables.add(new Videojuego("Super Mario Bros", 180));
		entregables.add(new Serie("Aggretsuko", 4, "Anime", "Rarecho"));
		entregables.add(new Videojuego("Pokémon Esmeralda", 300, "GameFreak"));
		
		entregables.get(0).entregar();
		entregables.get(1).entregar();
		
		int entregados = 0;
		for(Entregable obj: entregables) {
			if(obj.isEntregado()) {
				entregados++;
			}
		}
		System.out.println("Hay " + entregados + " Videojuegos/Series entregados.\n");
		System.out.println("Y sin entregar están los siguientes:");
		for(Entregable obj: entregables) {
			if(!obj.isEntregado()) {
				System.out.println(obj + "\n");
			}
		}
		
		Videojuego juegoMasHoras = null, videojuego = null;
		Serie serieMasTemporadas = null, serie = null;
		boolean primerJuego = true;
		boolean primeraSerie = true;
		
		for(int i = 0; i < entregables.size(); i++) {
			if(entregables.get(i) instanceof Videojuego) {
				if(primerJuego) {
					primerJuego = false;
					juegoMasHoras = (Videojuego)entregables.get(i);
				}
				videojuego = (Videojuego)entregables.get(i);
				if (videojuego.getHorasEstimadas() > juegoMasHoras.getHorasEstimadas()) {
					juegoMasHoras = videojuego;
				}
				
			} else if(entregables.get(i) instanceof Serie) {
				if(primeraSerie) {
					primeraSerie = false;
					serieMasTemporadas = (Serie)entregables.get(i);
				}
				serie = (Serie)entregables.get(i);
				if(serie.getNumTemporadas() > serieMasTemporadas.getNumTemporadas()) {
					serieMasTemporadas = serie;
				}
			}
		}
		
		if(juegoMasHoras != null) {
			System.out.println("El videojuego con más horas de juego estimadas es:");
			System.out.println(juegoMasHoras);
		} else {
			System.out.println("No hay ningún Juego en la lista de Entregables");
		}
		
		System.out.println();
		
		if(serieMasTemporadas != null) {
			System.out.println("La serie con más temporadas es:");
			System.out.println(serieMasTemporadas);
		} else {
			System.out.println("No hay ningúna Serie en la lista de Entregables");
		}
	}

}
