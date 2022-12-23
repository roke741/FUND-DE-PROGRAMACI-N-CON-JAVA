
package com.certus.demo.modelos.daos.impl;

import com.certus.demo.modelos.daos.AdministradorDao;
import com.certus.demo.modelos.entidades.Administrador;

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
