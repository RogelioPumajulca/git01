package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.Dbconexion;
import com.upc.dto.Docente;
import com.upc.dto.Taller;
import com.upc.dto.Universidad;
import com.upc.service.ITallerservice;

public class Tallerserviceimpl implements ITallerservice {

	@Override
	public void create(Taller o) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_taller(?,?,?,?)}";

		// String insert="insert into taller values(?,?,?,?)....";

		// 1.
		Connection cn = Dbconexion.connection();

		// 2.
		CallableStatement cs = cn.prepareCall(insert);

		// 3.
		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, o.getNombre());
		cs.setString(3, o.getDescripcion());
		cs.setInt(4, o.getDocente().getIddocente());

		// 4
		cs.execute();
		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok"))
			throw new Exception(estado);

	}

	@Override
	public void update(Taller o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Taller o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Taller get(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Taller> getAll() throws Exception {
		// TODO Auto-generated method stub
		String query = "{call sp_list_taller()}";

		// 1.
		Connection cn = Dbconexion.connection();

		// 2.
		CallableStatement cs = cn.prepareCall(query);

		List<Taller> lista = new ArrayList<>();
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			lista.add(mapRow(rs));
		}
		return lista;
	}

	@Override
	public Taller mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Taller t=new Taller();
		Docente d=new Docente();
		
		t.setIdtaller(rs.getInt(1));
		t.setNombre(rs.getString(2));
		
		d.setIddocente(rs.getInt(3));
		d.setNombre(rs.getString(4));
		
		t.setDocente(d);
		
		
		return t;
	}

}
