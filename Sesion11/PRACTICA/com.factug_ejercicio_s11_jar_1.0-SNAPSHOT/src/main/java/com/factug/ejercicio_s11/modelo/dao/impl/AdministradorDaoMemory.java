
package com.factug.ejercicio_s11.modelo.dao.impl;

import com.factug.ejercicio_s11.modelo.dao.AdministradorDao;
import com.factug.ejercicio_s11.modelo.entidades.Administrador;

/**
 *
 * @author Jhordie
 */
public class AdministradorDaoMemory implements AdministradorDao{

    @Override
    public Administrador login(String us, String ps) {
        if(us.equalsIgnoreCase("admin") && ps.equalsIgnoreCase("admin"))
            return new Administrador("100", "admin", "admin", "juan", "perez");
        return null;
    }
}
    

