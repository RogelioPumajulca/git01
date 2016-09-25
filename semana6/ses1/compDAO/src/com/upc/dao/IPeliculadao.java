package com.upc.dao;

import java.sql.SQLException;
import java.util.List;

import com.upc.dto.Pelicula;

public interface IPeliculadao extends ICruddao<Pelicula>, IRowmapper<Pelicula>{

    List<Pelicula> findByCategory(String nombrecategoria)throws SQLException;

}
