package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.Dbconexion;
import com.upc.dto.Departamento;
import com.upc.dto.Empleado;
import com.upc.service.IEmpleadoservice;

public class Empleadoserviceimpl implements IEmpleadoservice {

	@Override
	public void create(Empleado o) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_empleado(?,?,?)}";

		Connection cn = Dbconexion.connection();

		CallableStatement cs = cn.prepareCall(insert);
		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, o.getNombre());
		cs.setInt(3, o.getDep().getIddepartamento());

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;
		if (!estado.equals("ok")) {
			throw new SQLException();
		}	
	}

	@Override
	public void update(Empleado o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Empleado o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleado get(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> getAll() throws Exception {
		// TODO Auto-generated method stub
		String query = "{call sp_list_empleado()}";
		List<Empleado> lista=new ArrayList<>();

		Connection cn = Dbconexion.connection();

		CallableStatement cs = cn.prepareCall(query);
		
		ResultSet rs=cs.executeQuery();
		while(rs.next()){
			lista.add(mapRow(rs));
		}
		return lista;
	}

	@Override
	public Empleado mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Empleado e=new Empleado();
		Departamento d=new Departamento();
		
		e.setNombre(rs.getString(1));
		d.setNombre(rs.getString(2));
		e.setDep(d);
		return e;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
