
package com.factug.ejercicio_s11.prueba;

import com.factug.ejercicio_s11.modelo.dao.AdministradorDao;
import com.factug.ejercicio_s11.modelo.dao.impl.DaoFactory;
import com.factug.ejercicio_s11.modelo.entidades.Administrador;
import com.factug.ejercicio_s11.util.Util;

/**
 *
 * @author Jhordie
 */
public class Prueba04 {
    public static void main(String[] args) {
        AdministradorDao dao = DaoFactory.getAdministradorDao(Util.OPC);
        Administrador adm = dao.login("admin", "admin");
        if (adm != null) {
            System.out.println("Bienvenido " + adm.getNombre());
            
        }else{
            System.out.println("Erro no pudo ingresar");
        }
    }
}
