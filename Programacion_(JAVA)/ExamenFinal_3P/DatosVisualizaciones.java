package org.villablanca;

import java.time.LocalDate;

/**
 * Datos visualizaciones de un Cliente, el mismo tendrá un listado con estas
 * Los datos se representan por el Material visualizado y la fecha en la que se visualizó el mismo.
 * @author Christian
 *
 */
public class DatosVisualizaciones {
	private Material materialVisualizado;
	private LocalDate fechaVisualizacion;
	
	public DatosVisualizaciones(Material materialVisualizado, LocalDate fechaVisualizacion) {
		this.materialVisualizado = materialVisualizado;
		this.fechaVisualizacion = fechaVisualizacion;
	}

	public Material getMaterialVisualizado() {
		return materialVisualizado;
	}

	public LocalDate getFechaVisualizacion() {
		return fechaVisualizacion;
	}
	
	
}
