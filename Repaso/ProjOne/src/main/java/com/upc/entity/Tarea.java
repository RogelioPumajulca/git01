package com.upc.entity;

public class Tarea {

	
	private String Fecha;
	private int hora;
	private String descripcion;
	
	private Empleado e;
	private Proyecto p;
	
	public Tarea(String fecha, int hora, String descripcion,Empleado e,Proyecto p) {
		super();
		this.Fecha=fecha;
		this.hora=hora;
		this.descripcion=descripcion;
		this.e=e;
		this.p=p;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empleado getE() {
		return e;
	}

	public void setE(Empleado e) {
		this.e = e;
	}

	public Proyecto getP() {
		return p;
	}

	public void setP(Proyecto p) {
		this.p = p;
	}
	
	
	
}
