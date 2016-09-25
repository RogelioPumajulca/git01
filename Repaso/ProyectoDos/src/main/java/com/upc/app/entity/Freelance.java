package com.upc.app.entity;

public class Freelance extends Empleado {

	private int valor_hora;
	
	public Freelance(int codigo, String nombre, double costo, int valor_hora) {
		super(codigo, nombre, costo);
		this.valor_hora=valor_hora;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return this.getValor_hora()*50;
	}

	public int getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(int valor_hora) {
		this.valor_hora = valor_hora;
	}
	

	
}
