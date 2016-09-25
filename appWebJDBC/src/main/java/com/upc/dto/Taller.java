package com.upc.dto;

public class Taller {
	private int idtaller;
	private String nombre;
	private String descripcion;

	private Docente docente;

	public int getIdtaller() {
		return idtaller;
	}

	public void setIdtaller(int idtaller) {
		this.idtaller = idtaller;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

}
