
package com.mycompany.ejercicio_s08.dao;

/**
 *
 * @author Jhordie
 */
public class DaoFactory {
    public static EntidadDao getAlumnoDao(int op){
        switch (op) {
            case 1:
                return new AlumnoDaoMemory();
            case 2:
                return new AlumnoDaoDataBase();
            case 3:
                return new AlumnoDaoMysql();
            default:
                return  null;
        }
    
    };
    
    
}
