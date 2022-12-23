
package com.certus.demo.modelos.daos;

import com.certus.demo.modelos.entidades.Administrador;

/**
 *
 * @author Jhordie
 */
public interface AdministradorDao {

    public Administrador login(String us, String ps);

}
