package com.upc.entity;

public class empleado {

	int codigo;
	String nombre;
	double sueldo;
	
	departamento departamento;


	public empleado(int codigo, String nombre, double sueldo, com.upc.entity.departamento departamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.departamento = departamento;
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

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
