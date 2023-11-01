package org.villablanca;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void incrementarSegundos(int cantidad) {
		for(int i = 0; i < cantidad; i++) {
			incrementarUnSegundo();
		}
	}
	
	private void incrementarUnSegundo() {
		this.segundo++;
		if(segundo > 59) {
			this.segundo = 0;
			this.minuto++;
			if(minuto > 59) {
				this.minuto = 0;
				this.hora++;
				if (this.hora > 23) {
					this.hora=0;
				}
			}
		}
	}

	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}
	
	
}
