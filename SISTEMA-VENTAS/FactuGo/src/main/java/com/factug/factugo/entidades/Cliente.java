
package com.factug.factugo.entidades;

/**
 *
 * @author Jhordie
 */
public class Cliente {
    private int dni;
    private String nombre;
    private String apePat;
    private String apeMat;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apePat, String apeMat) {
        this.dni = dni;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apePat=" + apePat + ", apeMat=" + apeMat + '}';
    }


    
    
    
}
