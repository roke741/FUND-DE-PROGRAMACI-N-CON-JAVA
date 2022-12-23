
package com.mycompany.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Jhordie
 */
public class Ejercicios01 {
    public static void main(String [] args){
        
        int promedioAlumno = 0;
        int promedioMayor = 0;
        int a = 0;
        var listaA = "Lista alumnos";
        
        while(a <= 3 ){
                System.out.println("ingrese el nombre del estudiante");
                Scanner nombre = new Scanner (System.in);
                var nombreA = nombre.next();

                System.out.println("ingresa nota 1");
                Scanner pc1 = new Scanner (System.in);
                int pc1A = pc1.nextInt();

                System.out.println("ingresa nota 2");
                Scanner pc2 = new Scanner (System.in);
                int pc2A = pc2.nextInt();

                System.out.println("ingresa nota 3");
                Scanner pc3 = new Scanner (System.in);
                int pc3A = pc3.nextInt();
                
                promedioAlumno = (pc1A + pc2A + pc3A)/3;
                System.out.println("El promedio del alumno es: "+ promedioAlumno);
                
                if(promedioAlumno > promedioMayor){
                    promedioMayor = promedioAlumno;
                    System.out.println("El promedio mayor es: " + promedioMayor);
                }else{
                    System.out.println("El promedio mayor es: " + promedioMayor);

                };
                if (promedioAlumno > 12 ){
                    System.out.println(nombreA+" esta Aprobado");
                    listaA += nombreA+" esta Aprobado";
                }else{
                    System.out.println(nombreA+" esta Desaprobado");
                    listaA += nombreA+" esta Desaprobado";
                }
                
                a += 1;
        }
      
        
    }
}
