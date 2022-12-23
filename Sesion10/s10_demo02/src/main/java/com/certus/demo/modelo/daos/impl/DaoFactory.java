package com.certus.demo.modelo.daos.impl;

import com.certus.demo.modelo.daos.CursoDao;
import com.certus.demo.util.Util;

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

