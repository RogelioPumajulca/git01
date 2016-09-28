package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.Dbconexion;
import com.upc.dto.Departamento;
import com.upc.service.IDepartamentoservice;

public class Departamentoserviceimpl implements
IDepartamentoservice{

	@Override
	public void create(Departamento o) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_departamento(?,?)}";

		Connection cn = Dbconexion.connection();

		CallableStatement cs = cn.prepareCall(insert);
		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, o.getNombre());

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;
		if (!estado.equals("ok")) {
			throw new SQLException();
		}	
	}

	@Override
	public void update(Departamento o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Departamento o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departamento get(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> getAll() throws Exception {
		// TODO Auto-generated method stub
		String query = "{call sp_list_departamento()}";
		List<Departamento> lista=new ArrayList<>();

		Connection cn = Dbconexion.connection();

		CallableStatement cs = cn.prepareCall(query);
		
		ResultSet rs=cs.executeQuery();
		while(rs.next()){
			lista.add(mapRow(rs));
		}
		return lista;
	}

	@Override
	public Departamento mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Departamento d=new Departamento();
		d.setIddepartamento(rs.getInt(1));
		d.setNombre(rs.getString(2));
				
		return d;
	}
	
	
}
