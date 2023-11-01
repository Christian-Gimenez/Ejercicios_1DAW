package org.villablanca;

import org.villablanca.animales.Gato;
import org.villablanca.animales.Perro;
import org.villablanca.animales.Salchicha;
import org.villablanca.animales.Sonido;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura1, figura2;
		figura1 = new Cuadrado(3, Color.ROJO);
		figura2 = new Circulo(3, Color.AZUL);
		
		System.out.println(figura1.area());
		System.out.println(figura2.area());
		
		System.out.println("----------------");
		
		Sonido perro1, perro2;
		Sonido gato;
		Sonido caracol;
		perro1 = new Salchicha();
		perro2 = new Perro();
		gato = new Gato();
		//caracol = new Caracol();
		System.out.println("----------------");
		perro1.voz();
		perro1.vozDormido();
		Sonido.bostezo();
		System.out.println("----------------");
		perro2.voz();
		perro2.vozDormido();
		System.out.println("----------------");
		gato.voz();
		
		gato.vozDormido();
		System.out.println(Gato.NUMERO);
		Sonido.bostezo();
		Gato.bostezo();
		System.out.println("----------------");
		
		//Clases anonimas, declaras y redefines
		Sonido sonido = new Sonido() {
			public void voz() {
				System.out.println("MOOOOOOCCCKKK!!! Bocinazo!!!");
			}
			
			public void vozDormido() {
				System.out.println("...");
			}
		};
		
		sonido.voz();
		Sonido[] elementos = new Sonido[4];
		elementos[0] = gato;
		elementos[1] = perro1;
		elementos[2] = perro2;
		elementos[3] = sonido;
		System.out.println("--------ARRAY ELEMENTOS--------");
		for(Sonido obj: elementos) { 
			obj.voz();
		}
	}

}
