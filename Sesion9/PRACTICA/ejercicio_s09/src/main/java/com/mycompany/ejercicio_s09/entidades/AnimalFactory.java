
package com.mycompany.ejercicio_s09.entidades;

import com.mycompany.ejercicio_s09.util.EAnimal;

/**
 *
 * @author Jhordie
 */
public class AnimalFactory {
    public static Animal getAnimal(EAnimal op){
        switch (op) {
            case PERRO:
                return new Perro();
            case GATO:
                return new Gato();
            case CONEJO:
                return new Conejo();
            case VACA:
                return new Vaca();
            default:
                return null;
        }
    }
}
