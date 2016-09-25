package com.upc.dao;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.shape;

public class gestorshape {
	
	List<shape> lshape;

	public gestorshape() {
		lshape = new ArrayList<shape>();
	}

	public void agregarshape(shape s){
		lshape.add(s);
	}
	
	public List<shape> listarshape(){
		return lshape;
	}
	

}
