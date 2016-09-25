package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.empleado;

public class gestorempleados {

	List<empleado> lemp;

	public gestorempleados() {
		lemp= new ArrayList<empleado>();
	}
	
	public void agregarempleados(empleado e){
		lemp.add(e);
	}
	
	public List<empleado> listarempleados(){
		return lemp;
	}
}
