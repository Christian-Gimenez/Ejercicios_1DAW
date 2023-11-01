package org.villablanca.biblioteca;

import java.util.ArrayList;

public abstract class Material implements Comparable {
	
	private String codigo;
	private String titulo;
	private Bibliotecario bibliotecario;

	public Material(String codigo, String titulo, Bibliotecario bibliotecario) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.bibliotecario = bibliotecario;
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}



	public String getTitulo() {
		return titulo;
	}



	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}
	
	/*La sentencia "<Material extends Comparable<? super Material>>"
	 * se encuentra en la definición del método "ordenarMateriales",
	 * y se utiliza para restringir el tipo de objetos que pueden
	 * ser ordenados por el método.
	 * La palabra clave "extends" se utiliza para indicar que "Material"
	 * debe ser un subtipo de la interfaz "Comparable",
	 * lo que significa que debe implementar el método "compareTo".
	 * El uso del comodín "?" y la palabra clave "super"
	 * se utilizan para permitir que "Material" pueda ser
	 * comparado con cualquier tipo que sea un supertipo de "Material",
	 * lo que hace que la definición del método sea más flexible.
	 * 
	 * En resumen, la sentencia "<Material extends Comparable<? super Material>>"
	 * establece que cualquier objeto de tipo "Material"
	 * que se pase al método debe implementar la interfaz "Comparable"
	 * y debe poder compararse con cualquier objeto que sea un supertipo de "Material".
	 * De esta forma, se asegura que el método solo se pueda utilizar
	 * para ordenar objetos que sean comparables entre sí.
	 * */
	public static <Material extends Comparable<? super Material>> void ordenarMateriales(ArrayList<Material> materiales) {
		boolean desorden = true;
		for(int i = 0; i < materiales.size()-1 && desorden; i++) {
			desorden = false;
			for(int j = 0; j < materiales.size()-1-i; j++) {
				Material a = materiales.get(j);
				Material b = materiales.get(j+1);
				if(a.compareTo(b) > 0) {
					desorden = true;
					materiales.set(j, b);
					materiales.set(j+1, a);
				}
			}
		}
	}
	
	
	
}
