
package com.factug.ejercicio_s11.prueba;

import com.factug.ejercicio_s11.modelo.dao.CursoDao;
import com.factug.ejercicio_s11.modelo.dao.impl.DaoFactory;
import com.factug.ejercicio_s11.modelo.entidades.Curso;
import com.factug.ejercicio_s11.util.Util;

/**
 *
 * @author Jhordie
 */
public class Prueba01 {
    public static void main(String[] args) {
    CursoDao dao = DaoFactory.getCursoDao(Util.OPC);
    Curso curso = new Curso("c04", "Angular 14", 6);
    
    dao.create(curso);
        
    for(Curso c: dao.findAll()){
        System.out.println(c);
    }
    }
}
