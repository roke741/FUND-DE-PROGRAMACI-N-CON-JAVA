
package com.mycompany.ejercicio_s09.pruebas;

import com.mycompany.ejercicio_s09.entidades.Animal;
import com.mycompany.ejercicio_s09.entidades.Gato;
import com.mycompany.ejercicio_s09.entidades.Perro;

/**
 *
 * @author Jhordie
 */
public class Prueba01 {

    public static void main(String[] args) {
        Animal animal = new Perro();
        System.out.println(animal.pedirAyuda());
    }

}
