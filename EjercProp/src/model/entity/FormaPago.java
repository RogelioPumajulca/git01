package model.entity;

public class FormaPago {
    private String nombPago;
    private String descripcion;
    
    public FormaPago(){super();}

    public String getNombPago() {
        return nombPago;
    }

    public void setNombPago(String nombPago) {
        this.nombPago = nombPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
