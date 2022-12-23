
package com.factug.ejercicio_s10_2.modelo.dao.impl;

import com.factug.ejercicio_s10_2.modelo.dao.CursoDao;
import com.factug.ejercicio_s10_2.util.Util;

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
}
