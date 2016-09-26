package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.departamento;

public class gestordepartamento {

	List<departamento> ldep;

	public gestordepartamento() {
		ldep= new ArrayList<departamento>();
	}
	
	public void agregardepa(departamento d){
		ldep.add(d);
	}
	
	public List<departamento> devolverlistdep(){
		return ldep;
	}
}
