package com.upc.dao;

import java.sql.SQLException;

import com.upc.dto.Categoria;

public interface ICategoriadao extends ICruddao<Categoria>, IRowmapper<Categoria> {
	Categoria findByNombre(String nombrecategoria) throws SQLException;
}
