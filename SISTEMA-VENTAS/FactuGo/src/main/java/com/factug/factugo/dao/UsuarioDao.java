
package com.factug.factugo.dao;

import com.factug.factugo.entidades.Usuario;

/**
 *
 * @author Jhordie
 */
public interface UsuarioDao {
    public Usuario login(String us, String ps);
}
