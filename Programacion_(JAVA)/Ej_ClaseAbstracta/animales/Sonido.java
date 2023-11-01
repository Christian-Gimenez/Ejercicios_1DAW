package org.villablanca.animales;

public interface Sonido {
	//static final int NUMERO = 1;
	int NUMERO = 1;
	//public abstract void voz();
	void voz();
	
	//public default void vozDormido() {...}
	default void vozDormido() {
		System.out.println("ZZzzZZZzzZzzZZzZZz");
	}
	
	private void faseREM() {
		System.out.println("ZzzzzZzzZZz");
	}
	
	private void profundo() {
		System.out.println("zzzzZZzz");
	}
	
	static void bostezo() {
		System.out.println("¡Aaaaaaauuuuhh!");
	}
}
