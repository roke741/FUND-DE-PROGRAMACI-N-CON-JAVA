
package com.mycompany.ejercicio_s08.pruebas;

import com.mycompany.ejercicio_s08.dao.DaoFactory;
import com.mycompany.ejercicio_s08.dao.EntidadDao;
import com.mycompany.ejercicio_s08.entidades.Alumno;

/**
 *
 * @author Jhordie
 */
public class Prueba07 {
    public static void main(String[] args) {
        EntidadDao dao = DaoFactory.getAlumnoDao(1);
         Alumno a1 = new Alumno(15, 100, "juan", true);
        Alumno a2 = new Alumno(10, 200, "carlos", true);
        Alumno a3 = new Alumno(18, 300, "Maria", false);
        dao.create(a1);
        dao.create(a2);
        dao.create(a3);
        
        for(Alumno a: dao.findAll()){
            System.out.println(a);
        }
    }

}
