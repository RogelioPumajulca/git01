package com.upc.entity;

public abstract class figura {
	
	String nombre;
	int codigo;
	
	public figura(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return " Nombre: "+this.nombre+" codigo:"+this.codigo;
	}
	
	public abstract double area();
	
		
}
