package com.upc.service;

public interface Igenerica<G> {

	int contar();
	void agregarelemento(G g);
	G obtenerelemento(int posicion);
	
}
