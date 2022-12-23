
package com.factug.ejercicio_s11.servicios.impl;

import com.factug.ejercicio_s11.modelo.dao.CursoDao;
import com.factug.ejercicio_s11.modelo.dao.impl.DaoFactory;
import com.factug.ejercicio_s11.modelo.entidades.Curso;
import com.factug.ejercicio_s11.servicios.CursoService;
import com.factug.ejercicio_s11.util.Util;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public class CursoServiceImpl implements CursoService {
    
    private CursoDao dao ;
    
    public CursoServiceImpl(){
        dao = DaoFactory.getCursoDao(Util.OPC);
    }
    
    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        dao.update(curso);
    }

    @Override
    public void eliminar(String id) {
        dao.delete(id);
    }

    @Override
    public Curso buscar(String id) {
        return dao.find(id);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }

}
