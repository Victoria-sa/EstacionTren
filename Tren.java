package com.cursoceat.maquinaria;


import com.cursoceat.personal.Maquinista;

public class Tren {

	Locomotora locomotora;
	Maquinista responsable;
	private int numVagones;//numero de vagones que forman el tren
	Vagon vagones[];
	
	public Tren (Locomotora locomotora,Maquinista responsable) {
		this.locomotora =locomotora;
		this.responsable = responsable;	
		vagones = new Vagon[5];//creamos la tabla de 5 pero no objeto de tipo vagon	
	}
	public void enganchaVagon(int cargaMax, int cargaActual,String mercancia) {
			numVagones=Vagon.numIdent;
			if (numVagones<5) {
				Vagon v= new Vagon(cargaMax, cargaActual, mercancia); //incremento el id++
				vagones [numVagones]= v;			
			}
		}
	}
