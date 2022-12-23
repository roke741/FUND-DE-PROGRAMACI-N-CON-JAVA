
package com.mycompany.ejercicio_s09.pruebas;

import com.mycompany.ejercicio_s09.entidades.Animal;
import com.mycompany.ejercicio_s09.entidades.AnimalFactory;
import com.mycompany.ejercicio_s09.entidades.Perro;
import com.mycompany.ejercicio_s09.util.EAnimal;
import com.mycompany.ejercicio_s09.util.Util;

/**
 *
 * @author Jhordie
 */
public class Prueba02 {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(EAnimal.VACA);
        System.out.println(animal.pedirAyuda());
    }
}
