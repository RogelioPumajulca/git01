package com.upc.dao;

import java.sql.SQLException;
import java.util.List;

/**
*
* @author Henry Mendoza Puerta
*/
public interface ICruddao<T> {
	void create(T o) throws SQLException;

	void update(T o) throws SQLException;

	void delete(int id) throws SQLException;

	T get(int id) throws SQLException;

	List<T> getAll() throws SQLException;

}
