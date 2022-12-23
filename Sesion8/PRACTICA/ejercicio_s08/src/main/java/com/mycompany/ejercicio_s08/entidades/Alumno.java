
package com.mycompany.ejercicio_s08.entidades;

import com.mycompany.ejercicio_s08.util.Util;

/**
 *
 * @author Jhordie
 */
public class Alumno extends Persona {
    private double promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(double promedio, int id, String nombre, boolean sexo, Curso curso) {
        super(id, nombre, sexo, curso);
        this.promedio = promedio;
    }


    public Alumno(double promedio, int id, String nombre, boolean sexo) {
        super(id, nombre, sexo);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        this.estado = (this.promedio>=Util.PROMEDIO)?Util.MSGAPROBADO:Util.MSGDESAPROBADO;
        return estado;
    }


    @Override
    public String toString() {
        return "Alumno{" + super.toString() + "promedio=" + promedio + ", estado=" + getEstado() + ", curso:"+ getCurso()+ '}';
    }
    
    


    
}
