package com.upc.dto;;

/**
 *
 * @author Henry Mendoza Puerta
 */
public class Item {
    private int cantidad;
    private double importe;
    
    private Pelicula pel;

    public Item() {
    }

   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Pelicula getPel() {
        return pel;
    }

    public void setPel(Pelicula pel) {
        this.pel = pel;
    }

    @Override
    public String toString() {
        return "Item{" + "cantidad=" + cantidad + ", importe=" + importe + '}';
    }

   
}
