package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.usuario;
import com.upc.service.Iusuario;

public class gestorusuario implements Iusuario{

	List<usuario> lusu;

	public gestorusuario() {
		lusu= new ArrayList<usuario>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return lusu.size();
	}

	public void agregarelemento(usuario g) {
		// TODO Auto-generated method stub
		lusu.add(g);
	}

	public usuario obtenerelemento(int posicion) {
		// TODO Auto-generated method stub
		
		return lusu.get(posicion);
	}

	public usuario buscarusuario(String id) {
		// TODO Auto-generated method stub
		for (usuario usuario : lusu) {
			if (usuario.getId().equals(id)) {
				return usuario;
			}
		}
		
		return null;
	}
	
	
}
