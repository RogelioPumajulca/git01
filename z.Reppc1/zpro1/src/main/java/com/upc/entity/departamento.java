package com.upc.entity;

public class departamento {

	int codigo;
	String nombre;
	String localizacion;
	
	
	
	public departamento(int codigo, String nombre, String localizacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.localizacion = localizacion;
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
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
}
