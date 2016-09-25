package model.entity;

public class Curso {
    private String nombCurso;
    private String Descripcion;
    private String Precio;
    
    public Curso(){super();}

    public String getNombCurso() {
        return nombCurso;
    }

    public void setNombCurso(String nombCurso) {
        this.nombCurso = nombCurso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

}
