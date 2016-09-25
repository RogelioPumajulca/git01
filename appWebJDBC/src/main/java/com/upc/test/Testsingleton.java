package com.upc.test;

public class Testsingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoySinglenton hamp = SoySinglenton.getSingletonInstance("Henry A. Mendoza Puerta");
		SoySinglenton dr = SoySinglenton.getSingletonInstance("Don Ramón ");

		// hamp y dv son referencias a un único objeto de la clase
		// SoyUnico
		System.out.println(hamp.getNombre());
		System.out.println(dr.getNombre());

	}

}
