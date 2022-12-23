
package com.factug.ejercicio_s11.modelo.dao.impl;

import com.factug.ejercicio_s11.modelo.dao.AdministradorDao;
import com.factug.ejercicio_s11.modelo.dao.CursoDao;
import com.factug.ejercicio_s11.util.Util;

/**
 *
 * @author Jhordie
 */
public class DaoFactory {
    public static CursoDao getCursoDao(int opc){
        switch (opc) {
            case Util.MEMORY:
                return new CursoDaoMemory();
            case Util.MYSQL:
                return new CursoDaoMySQL(); 
            default:
                return null;
        }
    }
    
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
