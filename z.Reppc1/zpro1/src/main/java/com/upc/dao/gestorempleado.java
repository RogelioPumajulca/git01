package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.empleado;

public class gestorempleado {

	List<empleado> lemp;

	public gestorempleado() {
		lemp= new ArrayList<empleado>();
	}
	
	public void agregarempl(empleado e){
		lemp.add(e);
	}
	
	public List<empleado> devolverlistemp(){
		return lemp;
	}
	
}
