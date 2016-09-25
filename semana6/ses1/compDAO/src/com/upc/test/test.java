package com.upc.test;

import java.sql.SQLException;
import java.util.List;

import com.upc.dao.ICategoriadao;
import com.upc.dto.Categoria;
import com.upc.factory.Factory;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		ICategoriadao cdao=Factory.getInstance().getCategoriadao();
		
		Categoria c=new Categoria();
		
		List<Categoria> lista=cdao.getAll();
		
		for (Categoria ca : lista) {
			
			System.out.println(ca.getNombre());
		}
		
		try {
			c=cdao.get(7);
			System.out.println(c.getNombre());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
