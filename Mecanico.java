package com.cursoceat.personal;

public class Mecanico {

	String nombre;
	String telefono;
	enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}//ENUMERADO
	Especialidad especialidad;
	public Mecanico(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono= telefono;
		
		
	}
	
}
