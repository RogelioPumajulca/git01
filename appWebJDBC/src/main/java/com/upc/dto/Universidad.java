package com.upc.dto;

public class Universidad {
	private int iduniversidad;
	private String nombre;

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Universidad [iduniversidad=" + iduniversidad + ", nombre=" + nombre + "]";
	}
	
	

}
