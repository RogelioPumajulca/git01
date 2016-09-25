package com.upc.dto;

/**
 *
 * @author Henry Mendoza Puerta
 */
public class Pelicula {
    private int id;
    private String nombre;    
    private double precio;
    private int stock;  
    private String imagen;
    
    private Categoria cate;

    public Pelicula() {
    }

   

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Categoria getCate() {
        return cate;
    }

    public void setCate(Categoria cate) {
        this.cate = cate;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", imagen=" + imagen + ", cate=" + cate.getNombre() + '}';
    }
}
