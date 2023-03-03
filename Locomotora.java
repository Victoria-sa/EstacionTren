package com.cursoceat.maquinaria;

import com.cursoceat.personal.Mecanico;

public class Locomotora {

	String matricula;
	int potencia;
	int añoFabricacion;
	Mecanico mecanico;
	public Locomotora (String matricula, int potencia, int añoFabricacion,Mecanico mecanico) {
	this.matricula = matricula;
	this.añoFabricacion = añoFabricacion;
	this.potencia = potencia;
	this.mecanico = mecanico;
	
	}
}
