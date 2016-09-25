package com.upc.entity;

public class cuadrado extends figura{

	double lado;
	
	public cuadrado(String nombre, int codigo, double lado) {
		super(nombre, codigo);
		setLado(lado);
		// TODO Auto-generated constructor stub
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if(lado>0){
		this.lado = lado;
		}else{
			throw new IllegalArgumentException("ingresa valor mayor a cero");
		}
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getLado()*getLado();
	}

	@Override
	public String toString() {
		return  super.toString()+" ||el lado es: "+getLado()+" ||area: "+area();
	}

	
	
}
