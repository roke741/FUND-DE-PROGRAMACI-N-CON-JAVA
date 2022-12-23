

package com.factug.ejercicio_s11.modelo.dao.impl;

import com.factug.ejercicio_s11.modelo.dao.CursoDao;
import com.factug.ejercicio_s11.modelo.entidades.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public class CursoDaoMemory implements CursoDao {
    
    List<Curso> lista;
    public CursoDaoMemory() {
        lista = new ArrayList<>();
    }

    @Override
    public void create(Curso curso) {
        if(find(curso.getId())==null)
            lista.add(curso);
    }

    @Override
    public void update(Curso curso) {
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getId().equals(curso.getId())){
                lista.set(i, curso);
                break;
            }
        }
    }

    @Override
    public void delete(String id) {
        for(Curso curso:lista){
            if(curso.getId().equals(id)){
                lista.remove(curso);
                break;
            }
        } 
    }

    @Override
    public Curso find(String id) {
        for(Curso curso: lista){
            if(curso.getId().equals(id)){
                return curso;
            } 
        }
        return null;        
    }

    @Override
    public List<Curso> findAll() {
        return lista;

    }
}
