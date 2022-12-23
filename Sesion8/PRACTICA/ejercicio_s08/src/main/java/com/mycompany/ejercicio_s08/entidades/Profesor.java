
package com.mycompany.ejercicio_s08.entidades;

/**
 *
 * @author Jhordie
 */
public class Profesor extends Persona {
    
    private String categoria;
    private double sueldo;

    public Profesor() {
    }

    public Profesor(String categoria, int id, String nombre, boolean sexo, Curso curso) {
        super(id, nombre, sexo, curso);
        this.categoria = categoria;
    }

    
    public Profesor(String categoria, double sueldo) {
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public Profesor(String categoria, double sueldo, int id, String nombre, boolean sexo) {
        super(id, nombre, sexo);
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        if(null != this.categoria) switch (this.categoria) {
            case "A":
                this.sueldo = 3500;
                break;
            case "B":
                this.sueldo = 3000;
                break;
            case "C":
                this.sueldo = 2500;
                break;
            default:
                break;
        }
        return sueldo;
    }



    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "categoria=" + categoria + ", sueldo=" + getSueldo() + ", curso: "+ getCurso()+'}';
    }

    
    

}
