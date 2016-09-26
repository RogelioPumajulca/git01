package com.upc.entity;

public abstract class empleado {

	int codigo;
	String nombre;
	double costobonificacion;
	
	public empleado(int codigo, String nombre, double costobonificacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.costobonificacion = costobonificacion;
	}
	
	public double calcularbonificacion(){
		return costobonificacion*10;
	}
	
	public abstract double calcularsueldo();

	@Override
	public String toString() {
		return " Empleado: "+getNombre()+" costoBoni: "+getCostobonificacion()+" BBonificacion= "+calcularbonificacion();
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

	public double getCostobonificacion() {
		return costobonificacion;
	}

	public void setCostobonificacion(double costobonificacion) {
		this.costobonificacion = costobonificacion;
	}


	
	
}
