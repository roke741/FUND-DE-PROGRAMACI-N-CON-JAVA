
package com.factug.ejercicio_s11.prueba;

import com.factug.ejercicio_s11.modelo.dao.CursoDao;
import com.factug.ejercicio_s11.modelo.dao.impl.DaoFactory;
import com.factug.ejercicio_s11.modelo.entidades.Curso;
import com.factug.ejercicio_s11.util.Util;

/**
 *
 * @author Jhordie
 */
public class Prueba03 {
    public static void main(String[] args) {
        //TODO Eliminars un curso de la de base de datos Escuela
        CursoDao dao = DaoFactory.getCursoDao(Util.OPC);
        //Curso curso = new Curso("c04", nombre, 0);
        
        dao.delete("c04");
        for(Curso c: dao.findAll()){
            System.out.println(c);
        }
    }
}
