
package com.factug.factugo.servicios.impl;

import com.factug.factugo.dao.DaoFactory;
import com.factug.factugo.dao.UsuarioDao;
import com.factug.factugo.entidades.Usuario;
import com.factug.factugo.servicios.UsuarioService;

/**
 *
 * @author Jhordie
 */
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDao dao;
    
    public UsuarioServiceImpl(){
        dao = DaoFactory.getUsuarioDao();
    }
    
    @Override
    public Usuario validar(String username, String password) {
        return dao.login(username, password);
    }
    
    
    
     /*private AdministradorDao dao;
    public AdministradorServiceImpl(){
        dao = DaoFactory.getAdministradorDao(Util.OPC);
    }
    
    @Override
    public Administrador validar(String usuario, String password) {
        return dao.login(usuario, password);
    }*/

}
