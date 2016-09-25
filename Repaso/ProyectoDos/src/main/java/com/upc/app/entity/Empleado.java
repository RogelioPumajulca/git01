package com.upc.app.entity;

	public abstract class Empleado 
{
	
	private int codigo;
	private String nombre;
	private double costo;
	
	
	
	public Empleado(int codigo,String nombre,double costo) {
		super();
		this.codigo=codigo;
		this.nombre=nombre;
		this.costo=costo;
	}
	
	public double calcularBonificacion(){
		
		return this.getCosto()*10;
	}
	
	public abstract double calcularSueldo();
	
	
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
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	
}
