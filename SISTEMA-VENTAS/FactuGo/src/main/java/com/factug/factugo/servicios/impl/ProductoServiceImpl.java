
package com.factug.factugo.servicios.impl;

import com.factug.factugo.dao.DaoFactory;
import com.factug.factugo.dao.ProductoDao;
import com.factug.factugo.entidades.Producto;
import com.factug.factugo.servicios.ProductoService;
import com.factug.factugo.util.Util;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public class ProductoServiceImpl implements ProductoService{
    private ProductoDao dao ;
    
    public ProductoServiceImpl(){
        dao = DaoFactory.getProductoDao();
    }
    @Override
    public void grabar(Producto producto) {
        dao.create(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        dao.update(producto);
    }

    @Override
    public void eliminar(String id) {
        dao.delete(id);
    }

    @Override
    public Producto buscar(String id) {
        return dao.find(id);
    }

    @Override
    public List<Producto> listar() {
        return dao.findAll();
    }
    
    /*
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
    */
}
