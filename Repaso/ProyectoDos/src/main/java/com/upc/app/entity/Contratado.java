package com.upc.app.entity;

public class Contratado extends Empleado {
	
	public double sueldo;

	public Contratado(int codigo, String nombre, double costo, double sueldo) {
		super(codigo, nombre, costo);
		this.sueldo=sueldo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return this.getSueldo()*40;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
}
