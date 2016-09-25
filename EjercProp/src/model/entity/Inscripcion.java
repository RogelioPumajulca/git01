package model.entity;

public class Inscripcion {
    private String nombInscripcion;
    private String nombAlumno;
    private String telefono;
    
    private Curso oCurso;
    private FormaPago oFormaPago;
    
    public Inscripcion(){super();}

    public String getNombInscripcion() {
        return nombInscripcion;
    }

    public void setNombInscripcion(String nombInscripcion) {
        this.nombInscripcion = nombInscripcion;
    }

    public String getNombAlumno() {
        return nombAlumno;
    }

    public void setNombAlumno(String nombAlumno) {
        this.nombAlumno = nombAlumno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Curso getoCurso() {
        return oCurso;
    }

    public void setoCurso(Curso oCurso) {
        this.oCurso = oCurso;
    }

    public FormaPago getoFormaPago() {
        return oFormaPago;
    }

    public void setoFormaPago(FormaPago oFormaPago) {
        this.oFormaPago = oFormaPago;
    }
    

}
