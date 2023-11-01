package org.villablanca.escritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "";
		BufferedWriter out = null;
		
		try {
			out = new BufferedWriter(new FileWriter(ruta));
			out.write("""
					<?xml version=1.0 encoding="UTF-8"?>
					<!DOCTYPE alumnos[
					<!ELEMENT alumno (nombre, apellidos, nota)>
					<!ELEMENT nombre (#PCDATA)>
					<!ELEMENT apellidos (#PCDATA)>
					<!ELEMENT nota (#PCDATA)>
					]>
					<alumnos>
					    <alumno dni="" edad="">
					        <nombre></nombre>
					        <apellidos></apellidos>
					        <nota></nota>
					    </alumno>
					</alumnos>
					""");
		} catch(IOException ex) {
			System.out.println("Error E/S: " + ex.getMessage());
		} finally {
			try {
				out.close();
			} catch(IOException ex) {
				System.out.println("Error E/S: " + ex.getMessage());
			}
		}
	}

}
