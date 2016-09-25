package com.upc.entity;

public abstract class empleado {

	int codigo;
	String nombre;
	double costoboni;

	public empleado(int codigo, String nombre, double costoboni) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.costoboni = costoboni;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCostoboni() {
		return costoboni;
	}
	public void setCostoboni(double costoboni) {
		this.costoboni = costoboni;
	}
	
	public double calculaboni(){
		return costoboni*10;
	}
	
	public abstract double calculasueldo();
}
