package com.upc.test;

import java.sql.SQLException;
import java.util.List;

import com.upc.dao.ICategoriadao;
import com.upc.dto.Categoria;
import com.upc.dto.Pelicula;
import com.upc.factory.Factory;
import com.upc.model.categoriaModel;
import com.upc.model.peliculaModel;

public class test {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		categoriaModel cdao=new categoriaModel();
		//ICategoriadao cdao = Factory.getInstance().getCategoriadao();
		
		peliculaModel pdao=new peliculaModel();

		try {
			List<Categoria> lista=cdao.Listarcategorias();
			
			for (Categoria ca : lista) {
				
				System.out.println(ca.getNombre());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			List<Pelicula> list=pdao.Listarpeliculas();
			for (Pelicula pelicula : list) {
				System.out.println(pelicula.getNombre());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//Categoria c=cdao.BuscarCategoria(7);
		//System.out.println(c.getNombre());

	}

}
