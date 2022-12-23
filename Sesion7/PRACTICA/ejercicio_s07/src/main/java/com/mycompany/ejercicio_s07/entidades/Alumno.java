
package com.mycompany.ejercicio_s07.entidades;

/**
 *
 * @author Jhordie
 */
public class Alumno {
    private int codigo;
    private String nombre;
    private String correo;
    private String sexo;
    private int promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String correo, String sexo, int promedio, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.sexo = sexo;
        this.promedio = promedio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + ", sexo=" + sexo + ", promedio=" + promedio + ", estado=" + estado + '}';
    }
    
    
    
}
