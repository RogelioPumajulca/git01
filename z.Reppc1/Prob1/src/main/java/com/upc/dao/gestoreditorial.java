package com.upc.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.upc.entity.editorial;
import com.upc.service.Ieditorial;

public class gestoreditorial implements Ieditorial{

	
	List<editorial> ledit;
	
	public gestoreditorial() {
		ledit=new ArrayList<editorial>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return ledit.size();
	}

	public editorial obtenerelemento(int posicion) {
		// TODO Auto-generated method stub
		return ledit.get(posicion);
	}

	public void agregarelemento(editorial g) {
		// TODO Auto-generated method stub
		ledit.add(g);
	}

	public void eliminarelemento(int posicion) {
		// TODO Auto-generated method stub
		ledit.remove(posicion);
	}

	public void modificarelemento(int posicion, String cad1, String cad2) {
		// TODO Auto-generated method stub
		editorial e = obtenerelemento(posicion);
		e.setNombre(cad1);
		e.setDireccion(cad2);
	}

	public void listarelementos() {
		// TODO Auto-generated method stub
		for (editorial editorial : ledit) {
			System.out.println(editorial.getId()+" "+editorial.getNombre()+" "+
					editorial.getDireccion()+" "+editorial.getTelefono());
		}
		System.out.println("\n");
	}

	public editorial buscareditorial(String id) {
		// TODO Auto-generated method stub
		
		for (editorial editorial : ledit) {
			if (editorial.getId().equals(id)) {
				return editorial;
			}
		}
		return null;
	}

}
