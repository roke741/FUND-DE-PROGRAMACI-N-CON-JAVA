
package com.certus.demo.servicios.impl;

import com.certus.demo.modelos.daos.AdministradorDao;
import com.certus.demo.modelos.daos.impl.DaoFactory;
import com.certus.demo.modelos.entidades.Administrador;
import com.certus.demo.servicios.AdministradorService;
import com.certus.demo.util.Util;

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
