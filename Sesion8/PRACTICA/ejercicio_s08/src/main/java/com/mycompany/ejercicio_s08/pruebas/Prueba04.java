
package com.mycompany.ejercicio_s08.pruebas;

import com.mycompany.ejercicio_s08.entidades.Alumno;
import com.mycompany.ejercicio_s08.entidades.Curso;

/**
 *
 * @author Jhordie
 */
public class Prueba04 {
    public static void main(String[] args) {
        Curso curso = new Curso(1, "java", 5, 3);
        Alumno alumno = new Alumno(5, 100, "Juan", true);
        alumno.setCurso(curso);
        System.out.println(alumno.getCurso().getNombre());
    }
}
