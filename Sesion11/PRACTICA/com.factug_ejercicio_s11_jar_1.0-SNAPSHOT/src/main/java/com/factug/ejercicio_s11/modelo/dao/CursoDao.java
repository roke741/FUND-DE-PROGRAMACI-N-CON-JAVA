
package com.factug.ejercicio_s11.modelo.dao;

import com.factug.ejercicio_s11.modelo.entidades.Curso;
import java.util.List;


/**
 *
 * @author Jhordie
 */
public interface CursoDao {
    public void create(Curso curso);
    public void update(Curso curso);
    public void delete(String id);
    public Curso find(String id);
    public List<Curso> findAll();
}
