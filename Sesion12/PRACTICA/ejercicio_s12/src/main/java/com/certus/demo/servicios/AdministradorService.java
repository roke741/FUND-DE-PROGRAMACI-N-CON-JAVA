
package com.certus.demo.servicios;

import com.certus.demo.modelos.entidades.Administrador;

/**
 *
 * @author Jhordie
 */
public interface AdministradorService {
    public Administrador validar(String usuario,String password);

}
