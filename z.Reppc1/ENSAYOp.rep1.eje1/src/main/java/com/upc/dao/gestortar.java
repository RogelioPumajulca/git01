package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.tarea;

public class gestortar {

	List<tarea> ltar;
	
	public gestortar() {
		ltar = new ArrayList<tarea>();
	}

	public void agregarltar(tarea t){
		ltar.add(t);
	}
	
	public List<tarea>  listarltar(){
		return ltar;
	}
}
