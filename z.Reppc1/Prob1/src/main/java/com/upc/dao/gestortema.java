package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.tema;
import com.upc.service.Itema;

public class gestortema implements Itema{

	List<tema> ltem;
	
	public gestortema() {
		ltem=new ArrayList<tema>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return ltem.size();
	}

	public tema obtenerelemento(int posicion) {
		// TODO Auto-generated method stub
		return ltem.get(posicion);
	}

	public void agregarelemento(tema g) {
		// TODO Auto-generated method stub
		ltem.add(g);
	}

	public void eliminarelemento(int posicion) {
		// TODO Auto-generated method stub
		ltem.remove(posicion);
	}

	public void modificarelemento(int posicion, String cad1, String cad2) {
		// TODO Auto-generated method stub
		tema t=obtenerelemento(posicion);
		t.setNombre(cad1);
	}

	public void listarelementos() {
		// TODO Auto-generated method stub
		for (tema tema : ltem) {
			System.out.println(tema.getId()+" "+tema.getNombre());
		}
		System.out.println("\n");
	}

	public tema buscartema(String id) {
		// TODO Auto-generated method stub
		for (tema tema : ltem) {
			if (tema.getId().equals(id)) {
				return tema;
			}
		}
		return null;
	}

}
