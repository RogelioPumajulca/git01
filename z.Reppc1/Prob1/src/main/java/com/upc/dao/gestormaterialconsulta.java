package com.upc.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.upc.entity.materialconsulta;
import com.upc.entity.usuario;
import com.upc.service.Imaterialconsulta;

public class gestormaterialconsulta implements Imaterialconsulta{

	List<materialconsulta> lmatcon;
	
	public gestormaterialconsulta() {
		lmatcon=new ArrayList<materialconsulta>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return lmatcon.size();
	}

	public materialconsulta obtenerelemento(int posicion) {
		// TODO Auto-generated method stub
		return lmatcon.get(posicion);
	}

	public void agregarelemento(materialconsulta g) {
		// TODO Auto-generated method stub
		lmatcon.add(g);
	}

	public void eliminarelemento(int posicion) {
		// TODO Auto-generated method stub
		lmatcon.remove(posicion);
	}

	public void modificarelemento(int posicion, String cad1, String cad2) {
		// TODO Auto-generated method stub
		materialconsulta m= obtenerelemento(posicion);
		m.setTitulo(cad1);
		m.setFecha(cad2);
	}

	public void listarelementos() {
		// TODO Auto-generated method stub
		for (materialconsulta ma : lmatcon) {
			System.out.println(ma.getId()+" "+ma.getTitulo()+" "+ma.getFecha()+" "
		+ma.getE().getNombre()+" "+ma.getA().getNombre()+" "+ma.getT().getNombre());
		}
		System.out.println("\n");
	}

	public materialconsulta buscarmaterial(String id) {
		// TODO Auto-generated method stub
		for (materialconsulta m : lmatcon) {
			if (m.getId().equals(id)) {
				return m;
			}
		}
		return null;
	}

	public void solicitar() {
		// TODO Auto-generated method stub
		
	}

}
