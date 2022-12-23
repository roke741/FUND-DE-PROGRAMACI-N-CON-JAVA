
package com.factug.factugo.servicios;

import com.factug.factugo.entidades.Producto;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public interface ProductoService {
    public void grabar(Producto curso);
    public void actualizar(Producto curso);
    public void eliminar(String id);
    public Producto buscar(String id);
    public List<Producto> listar();
}
