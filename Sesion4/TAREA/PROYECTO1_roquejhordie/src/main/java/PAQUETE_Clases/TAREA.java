
package PAQUETE_Clases;

import java.util.Scanner;

/**
 *
 * @author Jhordie
 */
public class TAREA {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el monto: ");
        int monto = sc.nextInt();
            
        System.out.println("Distribucion del dinero en la Municipalidad de Lima");
        System.out.println("Mantenimiento 15%: S/." + (monto*0.15));
        System.out.println("Parques y jardines 50%: S/."+ (monto*0.50));
        System.out.println("Exploracioon 5%: S/." + (monto*0.05));
        System.out.println("Limpieza 30% : S/."+ (monto*0.30));
    }

}
