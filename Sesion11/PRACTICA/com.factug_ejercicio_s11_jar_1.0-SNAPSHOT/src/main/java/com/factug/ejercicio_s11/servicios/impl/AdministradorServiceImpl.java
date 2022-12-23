
package com.factug.ejercicio_s11.servicios.impl;

import com.factug.ejercicio_s11.modelo.dao.AdministradorDao;
import com.factug.ejercicio_s11.modelo.dao.impl.DaoFactory;
import com.factug.ejercicio_s11.modelo.entidades.Administrador;
import com.factug.ejercicio_s11.servicios.AdministradorService;
import com.factug.ejercicio_s11.util.Util;

/**
 *
 * @author Jhordie
 */
public class AdministradorServiceImpl implements AdministradorService {
    private AdministradorDao dao;
    public AdministradorServiceImpl(){
        dao = DaoFactory.getAdministradorDao(Util.OPC);
    }
    
    @Override
    public Administrador validar(String usuario, String password) {
        return dao.login(usuario, password);
    }

}
