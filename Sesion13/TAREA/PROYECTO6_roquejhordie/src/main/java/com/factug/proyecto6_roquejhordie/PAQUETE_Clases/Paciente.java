
package com.factug.proyecto6_roquejhordie.PAQUETE_Clases;
/**
 *
 * @author Jhordie
 */
public class Paciente extends Persona{
    int nroHistoria;
    String fechaPrimeraConsulta;

    public Paciente() {
    }

    public Paciente(int nroHistoria, String fechaPrimeraConsulta) {
        this.nroHistoria = nroHistoria;
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }

    public Paciente(
            int nroHistoria, 
            String fechaPrimeraConsulta, 
            String nombre, 
            int edad, 
            String sexo, 
            String estadoCivil, 
            double peso, 
            double altura
    ) {
        super(nombre, edad, sexo, estadoCivil, peso, altura);
        this.nroHistoria = nroHistoria;
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }
    
    public String calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        if (imc< 18.5) {
            return "Bajo de Peso";
        }else if (imc > 18.5 && imc < 24.9) {
            return "Normal";
        }else if (imc > 25.0 && imc < 29.9) {
            return "Sobrepeso";
        }else if (imc > 30.0) {
            return "Obeso";
        }
        return null;
    }
}
