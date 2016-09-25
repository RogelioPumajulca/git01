package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.Dbconexion;
import com.upc.dto.Docente;
import com.upc.dto.Universidad;
import com.upc.service.IDocenteservice;

public class Docenteserviceimpl implements IDocenteservice {

	@Override
	public void create(Docente o) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_docente(?,?,?)}";

		Connection cn = Dbconexion.connection();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		//TODO
		cs.setString(2, o.getNombre());
		cs.setInt(3, o.getUniversidad().getIduniversidad());

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new Exception(estado);
		}

	}

	@Override
	public void update(Docente o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Docente o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Docente get(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Docente> getAll() throws Exception {
		// TODO Auto-generated method stub
		List<Docente> lista = new ArrayList<>();
		String query = "{call sp_list_docente()}";

		Connection cn = Dbconexion.connection();

		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			lista.add(mapRow(rs));
		}

		return lista;
	}

	// select nombre,universidad
	@Override
	public Docente mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Docente d=new Docente();
		Universidad u=new Universidad();
		
		d.setIddocente(rs.getInt(1));
		d.setNombre(rs.getString(2));
		
		u.setIduniversidad(rs.getInt(3));
		u.setNombre(rs.getString(4));
		
		d.setUniversidad(u);
		
		return d;

	}

}
