package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.proyecto;

public class gestorpro {

	List<proyecto> lpro;
	
	public gestorpro() {
		lpro=new ArrayList<proyecto>();
	}

	public void agregarlpro(proyecto p){
		lpro.add(p);
	}
	
	public List<proyecto> listarlpro(){
		return lpro;
	}
}
