package com.upc.entity;

public class contratado extends empleado{
	
	String fechanaci;
	double sueldo;
	boolean escasado;
	int canthijos;

	public contratado(int codigo, String nombre, double costobonificacion,
			String fechanaci,double sueldo,boolean escasado,int canthijos) {
		super(codigo, nombre, costobonificacion);
		this.fechanaci=fechanaci;
		this.sueldo=sueldo;
		this.escasado=escasado;
		this.canthijos=canthijos;
	}

	@Override
	public double calcularsueldo() {
		// TODO Auto-generated method stub
		return getSueldo()*40;
	}

	

	@Override
	public String toString() {
		return super.toString()+" Contr y sueld frac: "+getSueldo()+" Monto sueld: "+calcularsueldo();
	}

	public String getFechanaci() {
		return fechanaci;
	}

	public void setFechanaci(String fechanaci) {
		this.fechanaci = fechanaci;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEscasado() {
		return escasado;
	}

	public void setEscasado(boolean escasado) {
		this.escasado = escasado;
	}

	public int getCanthijos() {
		return canthijos;
	}

	public void setCanthijos(int canthijos) {
		this.canthijos = canthijos;
	}

	
	
	
}
