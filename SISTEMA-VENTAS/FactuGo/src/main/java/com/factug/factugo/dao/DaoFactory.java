
package com.factug.factugo.dao;

import com.factug.factugo.dao.impl.ProductoDaoMySQL;
import com.factug.factugo.dao.impl.UsuarioDaoMySQL;

/**
 *
 * @author Jhordie
 */
public class DaoFactory {
    public static UsuarioDao getUsuarioDao(){
        return new UsuarioDaoMySQL();
    }
    public static ProductoDao getProductoDao(){
        return  new ProductoDaoMySQL();
    }
}
