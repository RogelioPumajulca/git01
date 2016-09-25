package com.upc.dao;

import java.sql.SQLException;

import com.upc.dto.Usuario;

public interface IUsuariodao extends ICruddao<Usuario>,IRowmapper<Usuario>{
	 Usuario autentica(String correo, String password)throws SQLException; 
}
