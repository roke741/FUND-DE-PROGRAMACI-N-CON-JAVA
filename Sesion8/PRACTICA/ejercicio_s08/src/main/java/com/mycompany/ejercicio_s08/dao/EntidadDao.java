
package com.mycompany.ejercicio_s08.dao;

import com.mycompany.ejercicio_s08.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public interface EntidadDao {
    
    public void create(Alumno alumno);
    
    public List<Alumno> findAll();
    
    public Alumno find(int id);
    
    public void update(Alumno objAlumno);
    
    public void delete(Alumno alumno);
}
