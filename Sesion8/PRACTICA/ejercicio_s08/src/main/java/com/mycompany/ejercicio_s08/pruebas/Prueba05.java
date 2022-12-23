
package com.mycompany.ejercicio_s08.pruebas;

import com.mycompany.ejercicio_s08.dao.AlumnoDaoMemory;
import com.mycompany.ejercicio_s08.entidades.Alumno;
import com.mycompany.ejercicio_s08.entidades.Curso;

/**
 *
 * @author Jhordie
 */
public class Prueba05 {
    public static void main(String[] args) {
        Curso curso = new Curso(1, "python", 1, 5);
        Alumno a1 = new Alumno(15,1, "Jordie" , true, curso);
        Alumno a2 = new Alumno(12, 2,  "Jose" , true);
        Alumno a3 = new Alumno(13, 3,"Mariio" , true);
        
        AlumnoDaoMemory dao = new AlumnoDaoMemory();
        dao.create(a1);
        dao.create(a2);
        dao.create(a3);
        
        
        dao.delete(a3);
        
        for(Alumno a: dao.findAll()){
            System.out.println(a);
        }       

    }
}
