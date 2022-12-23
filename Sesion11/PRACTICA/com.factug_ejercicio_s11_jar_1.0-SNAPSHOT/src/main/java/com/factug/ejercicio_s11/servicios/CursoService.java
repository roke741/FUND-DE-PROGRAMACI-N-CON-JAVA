
package com.factug.ejercicio_s11.servicios;

import com.factug.ejercicio_s11.modelo.entidades.Curso;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public interface CursoService {
    public void grabar(Curso curso);
    public void actualizar(Curso curso);
    public void eliminar(String id);
    public Curso buscar(String id);
    public List<Curso> listar();
}
