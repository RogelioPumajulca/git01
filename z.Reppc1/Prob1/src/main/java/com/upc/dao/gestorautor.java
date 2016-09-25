package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.autor;
import com.upc.service.Iautor;

public class gestorautor implements Iautor{

	List<autor> laut;
	
	public gestorautor() {
		laut = new ArrayList<autor>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return laut.size();
	}

	public autor obtenerelemento(int posicion) {
		// TODO Auto-generated method stub
		return laut.get(posicion);
	}

	public void agregarelemento(autor g) {
		// TODO Auto-generated method stub
		laut.add(g);
	}

	public void eliminarelemento(int posicion) {
		// TODO Auto-generated method stub
		laut.remove(posicion);
	}

	public void modificarelemento(int posicion, String cad1, String cad2) {
		// TODO Auto-generated method stub
		autor aut= obtenerelemento(posicion);
		
		aut.setNombre(cad1);
		aut.setNacionalidad(cad2);
	}

	public void listarelementos() {
		// TODO Auto-generated method stub
		for (int i = 0; i < laut.size(); i++) {
			autor aut= obtenerelemento(i);
			System.out.println(aut.getId()+" "+
			aut.getNombre()+" "+aut.getNacionalidad());
		}
		System.out.println("\n");
	}

	public autor buscarautor(String id) {
		// TODO Auto-generated method stub
		
		for (autor autor : laut) {
			if(autor.getId().equals(id)){
				return autor;
			}
		}
		return null;
	}

	
	
}
