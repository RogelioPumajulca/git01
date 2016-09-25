package com.upc.service;

public interface Igenerica<G> {

	int contar();
	G obtenerelemento(int posicion);
	public void agregarelemento(G g);

	public void eliminarelemento(int posicion);
	
	public void modificarelemento(int posicion,String cad1,String cad2);
	
	public void listarelementos();
	
}
