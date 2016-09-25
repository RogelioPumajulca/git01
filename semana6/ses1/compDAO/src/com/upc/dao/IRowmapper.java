package com.upc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
*
* @author Henry Mendoza Puerta
*/
public interface IRowmapper<T> {
	
	T mapRow(ResultSet rs) throws SQLException;

}
