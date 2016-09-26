package com.upc.entity;

public class tarea {

	
	String fecha;
	int horas;
	String descripcion;
	
	empleado empleado;
	proyecto proyecto;
	
	public tarea(String fecha, int horas, String descripcion, com.upc.entity.empleado empleado,
			com.upc.entity.proyecto proyecto) {
		super();
		this.fecha = fecha;
		this.horas = horas;
		this.descripcion = descripcion;
		this.empleado = empleado;
		this.proyecto = proyecto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(empleado empleado) {
		this.empleado = empleado;
	}

	public proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	
	
}
