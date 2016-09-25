package com.upc.entity;

public class Empleado {

	private int codigo;
	private String nombre;
	private double sueldo;
	private Departamento d; //ASOCIACION AGREGACION --> Rev classNotes
	
	
	
	public Empleado(int codigo, String nombre,double sueldo,Departamento d) {
		super();
		this.codigo=codigo;
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.d=d;
		
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
	public Departamento getD() {
		return d;
	}
	public void setD(Departamento d) {
		this.d = d;
	}
	
	
}
