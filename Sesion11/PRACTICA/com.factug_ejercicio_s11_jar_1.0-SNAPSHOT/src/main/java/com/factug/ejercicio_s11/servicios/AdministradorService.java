
package com.factug.ejercicio_s11.servicios;

import com.factug.ejercicio_s11.modelo.entidades.Administrador;

/**
 *
 * @author Jhordie
 */
public interface AdministradorService {
    public Administrador validar(String usuario,String password);
}
