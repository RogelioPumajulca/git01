package com.upc.entity;

public class contratado extends empleado{

	String fechanac;
	double sueldo;
	boolean escasado;
	int canthijos;	
	
	public contratado(int codigo, String nombre, double costoboni,String fechanac,double sueldo,boolean escasado,int canthijos) {
		super(codigo, nombre, costoboni);
		this.fechanac=fechanac;
		this.sueldo=sueldo;
		this.escasado=escasado;
		this.canthijos=canthijos;
	}

	@Override
	public double calculasueldo() {
		// TODO Auto-generated method stub
		return sueldo*40;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
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
