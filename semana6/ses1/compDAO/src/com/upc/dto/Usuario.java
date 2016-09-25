package com.upc.dto;
/**
 *
 * @author Henry Mendoza Puerta
 */
public class Usuario {
    private int id;
    private String apellidos;
    private String nombres;
    private String correo;
    private String password;
    private String autorizacion;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", apellidos=" + apellidos + ", nombres=" + nombres + ", correo=" + correo + ", password=" + password + ", autorizacion=" + autorizacion + '}';
    }
}
