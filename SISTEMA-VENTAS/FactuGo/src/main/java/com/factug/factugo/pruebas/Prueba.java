
package com.factug.factugo.pruebas;

import com.factug.factugo.entidades.Result;
import java.io.IOException;

/**
 *
 * @author Jhordie
 */
public class Prueba {
    public static void main(String[] args) throws IOException {
          PruebaApiRest api = new PruebaApiRest();

          
          Result rs = new Result();
          
          
          
          System.out.println(rs.getNombre());
    }
    
  
    
    
}
