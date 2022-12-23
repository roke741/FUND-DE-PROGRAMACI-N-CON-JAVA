
package com.factug.proyecto6_roquejhordie.PAQUETE_Clases;

/**
 *
 * @author Jhordie
 */
public class Persona {
    String nombre;
    int edad;
    String sexo;
    String estadoCivil;
    double peso;
    double altura;

    public Persona() {
    }

    public Persona(
            String nombre, 
            int edad, 
            String sexo, 
            String estadoCivil, 
            double peso, 
            double altura
    ) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.peso = peso;
        this.altura = altura;
    }
    
}
