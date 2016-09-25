package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.departamento;

public class gestordep {

	List<departamento> ldep;
	
	public gestordep() {
		ldep= new ArrayList<departamento>();
	}

	public void agregaldep(departamento d){
		ldep.add(d);
	}
	
	public List<departamento> listardep(){
		return ldep;
		
	}
	
}
