package com.upc.entity;

public class usuario {

	String nombre;
	String identificacion;
	String id;
	String categoria;
	String direccion;
	String telefono;
	String fecha;
	
	public usuario(String nombre, String identificacion, String id, 
			String categoria, String direccion, String telefono,
			String fecha) {
		//super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.id = id;
		this.categoria = categoria;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha = fecha;
	}
	

	@Override
	public String toString() {
		return "Nombre: "+getNombre()+" ID: "+getId()+" Direccion: "+getDireccion();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
}
