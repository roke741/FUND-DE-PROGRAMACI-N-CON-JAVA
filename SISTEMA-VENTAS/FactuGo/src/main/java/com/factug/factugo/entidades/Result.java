
package com.factug.factugo.entidades;

/**
 *
 * @author Jhordie
 */
public class Result {
    public String dni;
    public String paterno;
    public String materno;
    public String nombre;
    public String nacimiento;
    public String codigo_verificacion;

    public Result() {
    }

    public Result(String dni, String paterno, String materno, String nombre, String nacimiento, String codigo_verificacion) {
        this.dni = dni;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.codigo_verificacion = codigo_verificacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCodigo_verificacion() {
        return codigo_verificacion;
    }

    public void setCodigo_verificacion(String codigo_verificacion) {
        this.codigo_verificacion = codigo_verificacion;
    }
}
