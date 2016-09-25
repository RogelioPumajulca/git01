package com.upc.model;

import java.sql.SQLException;
import java.util.List;

import com.upc.dao.IPeliculadao;
import com.upc.dto.Pelicula;
import com.upc.factory.Factory;

public class peliculaModel {

	IPeliculadao pdao=null;
	
	public peliculaModel() {
		// TODO Auto-generated constructor stub
		pdao=Factory.getInstance().getPeliculadao();
	}
	
	public void RegistrarPelicula(Pelicula pel) throws SQLException {
		//TODO
	}

	public List<Pelicula> Listarpeliculas() throws SQLException {
		//TODO
		return null;
	}
}
