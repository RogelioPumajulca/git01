package com.upc.entity;

public class empleado {

	int codigo;
	String nombre;
	double sueldo;
	departamento depa;
	
	public departamento getDepa() {
		return depa;
	}
	public void setDepa(departamento depa) {
		this.depa = depa;
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
	
	
}
