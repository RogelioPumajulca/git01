package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.proyecto;

public class gestorproyecto {

	List<proyecto> lpro;

	public gestorproyecto() {
		lpro= new ArrayList<proyecto>();

	}
	

	public void agregarpro(proyecto p){
		lpro.add(p);
	}
	
	public List<proyecto> deolverlistpro(){
		return lpro;
	}
}
