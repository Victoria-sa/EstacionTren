package com.cursoceat.maquinaria;

public class Vagon {
	static int numIdent; //lo hacemos estatico para 1. autoincrementar 2. ese incremento sea utilizado por tren
	int cargaMax;
	int cargaActual;
	String mercancia;
	public Vagon(int cargaMax, int cargaActual, String mercancia) {		
		this.cargaMax= cargaMax;
		this.cargaActual = cargaActual;
		this.mercancia = mercancia;
		numIdent++;
	}

}
