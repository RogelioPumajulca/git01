package com.upc.entity;

public class freelance extends empleado{

	int valorhora;
	
	public freelance(int codigo, String nombre, double costobonificacion, int valorhora) {
		super(codigo, nombre, costobonificacion);
		this.valorhora=valorhora;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularsueldo() {
		// TODO Auto-generated method stub
		return valorhora*50;
	}

	@Override
	public String toString() {
		return super.toString()+" trab free x hor: "+getValorhora()+" monto sueldo: "+calcularsueldo();
	}

	public int getValorhora() {
		return valorhora;
	}

	public void setValorhora(int valorhora) {
		this.valorhora = valorhora;
	}

	
	
}
