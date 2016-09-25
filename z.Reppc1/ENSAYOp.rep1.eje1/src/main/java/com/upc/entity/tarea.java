package com.upc.entity;

public class tarea {

	String fecha;
	int hora;
	String descripcion;
	empleado emp;
	proyecto pro;
	
	public proyecto getPro() {
		return pro;
	}
	public void setPro(proyecto pro) {
		this.pro = pro;
	}
	public empleado getEmp() {
		return emp;
	}
	public void setEmp(empleado emp) {
		this.emp = emp;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
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
	
	
}
