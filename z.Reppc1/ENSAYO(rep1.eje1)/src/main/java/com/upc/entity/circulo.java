package com.upc.entity;

public class circulo extends figura{

	private double radio;
	
	public circulo(String nombre, int codigo, double radio) {
		super(nombre, codigo);
		setRadio(radio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.1415*getRadio();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if(radio>0){
		this.radio = radio;}
		else{
			throw new IllegalArgumentException("ingresar valor mayor a cero");
		}
	}

	@Override
	public String toString() {
		return super.toString()+" ||radio: "+getRadio()+" ||Area: "+area();
	}
	
	
}
