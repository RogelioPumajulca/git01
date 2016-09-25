package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.Dbconexion;
import com.upc.dto.Docente;
import com.upc.dto.Universidad;
import com.upc.service.IUniversidadservice;

public class Universidadserviceimpl implements IUniversidadservice{

	@Override
	public void create(Universidad o) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_universidad(?,?)}";

		Connection cn = Dbconexion.connection();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, o.getNombre());
		

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new Exception(estado);
		}
	}

	@Override
	public void update(Universidad o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Universidad o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Universidad get(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Universidad> getAll() throws Exception {
		// TODO Auto-generated method stub
		List<Universidad> lista = new ArrayList<>();
		String query = "{call sp_list_universidad()}";

		Connection cn = Dbconexion.connection();

		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			lista.add(mapRow(rs));
		}

		return lista;
	}

	@Override
	public Universidad mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		
		Universidad u=new Universidad();
		
		
		
		u.setIduniversidad(rs.getInt(1));
		u.setNombre(rs.getString(2));

		
		return u;
	}

}
