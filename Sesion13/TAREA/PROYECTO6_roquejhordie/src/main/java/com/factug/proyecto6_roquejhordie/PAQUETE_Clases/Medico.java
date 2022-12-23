
package com.factug.proyecto6_roquejhordie.PAQUETE_Clases;

/**
 *
 * @author Jhordie
 */
public class Medico extends Persona {
    int nroColegiatura;
    String especialidad;

    public Medico() {
    }

    public Medico(int nroColegiatura, String especialidad) {
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }

    public Medico(
            int nroColegiatura, 
            String especialidad, 
            String nombre, 
            int edad, 
            String sexo, 
            String estadoCivil, 
            double peso, 
            double altura
    ) {
        super(nombre, edad, sexo, estadoCivil, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }
    
    public int calcularPrecioConsulta(String especialidad){
        switch (especialidad) {
            case "otorrino":
                return 40;
            case "traumatologia":
                return 45;
            case "dermatologia":
                return 50;
            case "otro":
                return 65;
            default:
                throw new AssertionError();
        }
    }
    
}
