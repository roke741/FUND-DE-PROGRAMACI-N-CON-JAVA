
package com.factug.ejercicio_s11.prueba;

import com.factug.ejercicio_s11.modelo.entidades.Administrador;
import com.factug.ejercicio_s11.servicios.AdministradorService;
import com.factug.ejercicio_s11.servicios.impl.AdministradorServiceImpl;

/**
 *
 * @author Jhordie
 */
public class Prueba05 {
    public static void main(String[] args) {
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador adm = servicio.validar("admin", "admin");
        
        if(adm!=null){
            System.out.println("Bienvenido "+ adm.getNombre());
        }else{
            System.out.println("Error no ingreso");
        }
    }
}
