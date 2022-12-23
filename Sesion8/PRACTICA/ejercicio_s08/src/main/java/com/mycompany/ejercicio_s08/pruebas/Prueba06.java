
package com.mycompany.ejercicio_s08.pruebas;

import com.mycompany.ejercicio_s08.dao.ProfesorDaoMemory;
import com.mycompany.ejercicio_s08.entidades.Curso;
import com.mycompany.ejercicio_s08.entidades.Profesor;

/**
 *
 * @author Jhordie
 */
public class Prueba06 {
    public static void main(String[] args) {
        
        Curso curso = new Curso(1, "html", 1, 5);
        
        Profesor p1 = new Profesor("A", 1, "Pedro", true, curso);
        Profesor p2 = new Profesor("B", 2, "Luis", true, curso);
        Profesor p3 = new Profesor("C", 3, "Erick", true, curso);
        
        ProfesorDaoMemory dao = new ProfesorDaoMemory();
        dao.create(p1);
        dao.create(p2);
        dao.create(p3);
        
        //borramos el ultimo profesor
        dao.delete(p3);
        
        for (Profesor p : dao.findAll()) {
            System.out.println(p);
        }

    }
}
