package com.upc.test;

public class SoySinglenton {

	private String nombre;
	private static SoySinglenton soyUnico;

	// El constructor es privado, no permite que se genere un constructor por
	// defecto.
	private SoySinglenton(String nombre) {
		this.nombre = nombre;
		System.out.println("Mi nombre es: " + this.nombre);
	}

	public static SoySinglenton getSingletonInstance(String nombre) {
		if (soyUnico == null) {
			soyUnico = new SoySinglenton(nombre);
		} else {
			System.out.println(
					"No se puede crear el objeto " + nombre + " porque ya existe un objeto de la clase SoyUnico");
		}

		return soyUnico;
	}

	// metodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

}