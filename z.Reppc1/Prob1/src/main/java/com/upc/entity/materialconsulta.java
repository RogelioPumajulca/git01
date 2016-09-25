package com.upc.entity;

public class materialconsulta {

	String id;
	String titulo;
	String fecha;
	
	editorial e;
	autor a;
	tema t;
	
	String categoria;
	String idioma;
	
	//boolean solicitado=false;
	
	public materialconsulta(String id, String titulo, editorial e, autor a, tema t, String fecha, String categoria,
			String idioma) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.e = e;
		this.a = a;
		this.t = t;
		this.fecha = fecha;
		this.categoria = categoria;
		this.idioma = idioma;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public editorial getE() {
		return e;
	}

	public void setE(editorial e) {
		this.e = e;
	}

	public autor getA() {
		return a;
	}

	public void setA(autor a) {
		this.a = a;
	}

	public tema getT() {
		return t;
	}

	public void setT(tema t) {
		this.t = t;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	

}
