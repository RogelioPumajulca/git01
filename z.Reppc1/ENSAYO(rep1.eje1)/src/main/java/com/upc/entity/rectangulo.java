package com.upc.entity;

public class rectangulo extends figura{

	
	private double ancho,largo;
	
	public rectangulo(String nombre, int codigo,double ancho,double largo) {
		super(nombre, codigo);
		setAncho(ancho);
		setLargo(largo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getAncho()*getLargo();
	}

	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho>0){
		this.ancho = ancho;
		}else{throw new IllegalArgumentException("ingr val may a cero");
		}
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		
		if(ancho>0){
			this.largo = largo;
			}else{throw new IllegalArgumentException("ingr val may a cero");
			}		
	}

	@Override
	public String toString() {
		return super.toString()+" ||ancho: "+getAncho()+" ||largo: "+getLargo()+" ||Area: "+area();
	}
		
	
	
}
