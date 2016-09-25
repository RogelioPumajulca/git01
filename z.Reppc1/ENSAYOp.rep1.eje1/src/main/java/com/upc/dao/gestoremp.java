package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.empleado;

public class gestoremp {

	List<empleado> lemp;
	
	public gestoremp() {
			lemp=new ArrayList<empleado>();
	}

	public void agregarlemp(empleado e){
		lemp.add(e);
	}
	
	public List<empleado> listarlemp(){
		return lemp;
	}
}
