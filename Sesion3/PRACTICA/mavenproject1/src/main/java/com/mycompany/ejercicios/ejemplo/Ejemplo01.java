
package com.mycompany.ejercicios.ejemplo;

import com.mycompany.ejercicios.ejemplo.gui.MiVentana;


/**
 *
 * @author Jhordie
 */
public class Ejemplo01 {
        public static void main(String[] args) {
        //TODO abrir una ventana
        System.out.println(args[0]);
        MiVentana v1 = new MiVentana(args[0]);
        v1.setVisible(true);
        
    }
}
