
package com.mycompany.ejercicio1_s06.entidades;

/**
 *
 * @author Jhordie
 */
public class Alumno {
    private String id;
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private double promedio;
    private String estado;

    public Alumno(String id, String nombre, int nota1, int nota2, int nota3) {
        this.id = id;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        
        this.promedio = (this.nota1 + this.nota2 + this.nota3)/3;
        
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        if( promedio<= 13 ){
            this.estado = "Desaprobado";
        }else{
            this.estado = "Aprobado";
        }
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
