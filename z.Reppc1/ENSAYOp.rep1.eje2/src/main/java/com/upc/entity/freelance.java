package com.upc.entity;

public class freelance extends empleado{

	int valorhora;
	
	public freelance(int codigo, String nombre, double costoboni,int valorhora) {
		super(codigo, nombre, costoboni);
		this.valorhora=valorhora;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double calculasueldo() {
		// TODO Auto-generated method stub
		return valorhora*50;
	}
	
	
	
}
