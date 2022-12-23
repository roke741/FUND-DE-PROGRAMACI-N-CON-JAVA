
package com.factug.proyecto5_roquejhordie.PAQUETE_Clases;

/**
 *
 * @author Jhordie
 */
public class Empleado {
    int codigo;
    String nombre;
    String apellido;
    String cargo;
    double sueldoBruto;
    double descuento;
    double sueldoNeto;

    public Empleado() {
    }
    public Empleado(int codigo, String nombre, String apellido, String cargo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
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
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSueldoBruto() {
        switch (this.cargo) {
            case "Jefe":
                return sueldoBruto = 7000;
            case "DBA":
                return sueldoBruto = 5000;
            case "Analista":
                return sueldoBruto = 4000;
            case "Programador":
                return sueldoBruto = 3000;
                
            case "Soporte":
                return sueldoBruto = 2000;
            default:
                throw new AssertionError();
        }

    }
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public double getDescuento() {
        return this.descuento = this.sueldoBruto * 0.122;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getSueldoNeto() {
        return this.sueldoNeto = this.sueldoBruto - this.descuento;
    }
    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }
  
}
