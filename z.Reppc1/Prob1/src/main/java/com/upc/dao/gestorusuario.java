package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.usuario;
import com.upc.service.Iusuario;

public class gestorusuario implements Iusuario{
	
	List<usuario> lusu;

	public gestorusuario() {
		lusu = new ArrayList<usuario>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return lusu.size();
	}

	public usuario obtenerelemento(int posicion) {
		// TODO Auto-generated method stub
		return lusu.get(posicion);
	}

	public void agregarelemento(usuario g) {
		// TODO Auto-generated method stub
		lusu.add(g);
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

	public void eliminarelemento(int posicion) {
		// TODO Auto-generated method stub
		lusu.remove(posicion);
	}


	public void modificarelemento(int posicion, String cad1, String cad2) {
		// TODO Auto-generated method stub
		usuario u = obtenerelemento(posicion);
		u.setNombre(cad1);
		u.setDireccion(cad2);
	}

	public void listarelementos() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < lusu.size(); i++) {
			usuario u= lusu.get(i);
			System.out.println(u.getNombre()+" "+u.getId()+" "+u.getDireccion());
		}
		System.out.println("\n");
	}
	
	
/*	
	public void agregarusuario(usuario u){
		lusu.add(u);
	}
	
	public List<usuario> pasarlistausu(){
		return lusu;
	}
	
	public usuario buscarusu(String id){
		for (usuario usuario : lusu) { 
			if (usuario.getId().equals(id)) {
			//	System.out.println("Encontrado: "+usuario.toString());
				return usuario;
			}
		}
		return null;
	}
	
	public void listarusuario(List<usuario> listusu){
		
		System.out.println("lista usuario");
		for (usuario usuario : listusu) {
			System.out.println(usuario.toString());
		}
	}
	
	
	public void modificarusuario(String id, String nombre, String direccion){
		usuario u = buscarusu(id);
		u.setNombre(nombre);
		u.setDireccion(direccion);
	}
	
	public void eliminarusuario(String id){
		usuario u = buscarusu(id);
		lusu.remove(u);
	}
*/	
	
	
	
	
}
