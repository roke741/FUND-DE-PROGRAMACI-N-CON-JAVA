
package com.factug.factugo.servicios;

import com.factug.factugo.entidades.Usuario;

/**
 *
 * @author Jhordie
 */
public interface UsuarioService {
    public Usuario validar(String username, String password);
}
