
package com.certus.demo.pruebas;

import com.certus.demo.modelo.daos.CursoDao;
import com.certus.demo.modelo.daos.impl.DaoFactory;
import com.certus.demo.modelo.entidades.Curso;
import com.certus.demo.util.Util;

public class Prueba03 {
    public static void main(String[] args) {
        //TODO Eliminars un curso de la de base de datos Escuela
        
                
        CursoDao dao = DaoFactory.getCursoDao(Util.opc);
          for(Curso c: dao.findAll()){
            System.out.println(c);
        }
    }
}
