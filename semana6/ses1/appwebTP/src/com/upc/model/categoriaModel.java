package com.upc.model;

import java.sql.SQLException;
import java.util.List;

import com.upc.dao.ICategoriadao;
import com.upc.dto.Categoria;
import com.upc.factory.Factory;

public class categoriaModel {
	ICategoriadao cdao = null;

	public categoriaModel() {
		//REFERENCIAR FACTORY y pedir una interfaz
		cdao = Factory.getInstance().getCategoriadao();

	}

	public void RegistrarCategoria(Categoria cate) throws SQLException {
		//TODO
		cdao.create(cate);
	}

	public void EliminarCategoria(int id) throws SQLException {
		//TODO
		cdao.delete(id);
	}

	public void ActualizarCategoria(Categoria cate) throws SQLException {
		//TODO
		cdao.update(cate);
	}

	public Categoria BuscarCategoria(int id) throws SQLException {
		//TODO
		return cdao.get(id);
	}

	public List<Categoria> Listarcategorias() throws SQLException {

		//TODO
		return cdao.getAll();
	}
}
