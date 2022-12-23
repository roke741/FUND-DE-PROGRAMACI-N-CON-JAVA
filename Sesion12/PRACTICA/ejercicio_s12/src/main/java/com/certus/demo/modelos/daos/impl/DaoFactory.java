
package com.certus.demo.modelos.daos.impl;

import com.certus.demo.modelos.daos.AdministradorDao;
import com.certus.demo.util.Util;

/**
 *
 * @author Jhordie
 */
public class DaoFactory {

    public static AdministradorDao getAdministradorDao(int opc){
        switch (opc) {
            case Util.MEMORY:
                return new AdministradorDaoMemory();
            case Util.MYSQL:
                return new AdministradorDaoMySQL();
            default:
                return null;
        }
        
    }
}
