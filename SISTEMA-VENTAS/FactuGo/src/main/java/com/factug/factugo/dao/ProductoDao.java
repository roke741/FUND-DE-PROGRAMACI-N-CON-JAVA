
package com.factug.factugo.dao;

import com.factug.factugo.entidades.Producto;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public interface ProductoDao {
    public void create(Producto producto);
    public void update(Producto producto);
    public void delete(String id);
    public Producto find(String id);
    public List<Producto> findAll();
    
    /*
        public void create(Curso curso);
    public void update(Curso curso);
    public void delete(String id);
    public Curso find(String id);
    public List<Curso> findAll();
    */
}
