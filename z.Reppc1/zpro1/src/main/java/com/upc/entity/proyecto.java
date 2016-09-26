package com.upc.entity;

public class proyecto {

	int codigo;
	String nombre;
	int maxhoras;
	
	
	
	public proyecto(int codigo, String nombre, int maxhoras) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.maxhoras = maxhoras;
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
	public int getMaxhoras() {
		return maxhoras;
	}
	public void setMaxhoras(int maxhoras) {
		this.maxhoras = maxhoras;
	}
	
	
}
