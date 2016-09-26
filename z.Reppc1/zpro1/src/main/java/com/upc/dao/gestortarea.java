package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.tarea;

public class gestortarea {

	List<tarea> ltar;

	public gestortarea() {
		ltar = new ArrayList<tarea>();
	}
	
	public void agregartar(tarea t){
		ltar.add(t);
	}
	
	public List<tarea> devolvelisttar(){
		return ltar;
	}
}
