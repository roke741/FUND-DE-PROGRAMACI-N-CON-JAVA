/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.demo.pruebas;

import com.certus.demo.modelo.daos.CursoDao;
import com.certus.demo.modelo.daos.impl.DaoFactory;
import com.certus.demo.modelo.entidades.Curso;
import com.certus.demo.util.Util;

/**
 *
 * @author cjava2019
 */
public class Prueba01 {
    public static void main(String[] args) {
        CursoDao dao = DaoFactory.getCursoDao(Util.opc);
        Curso curso = new Curso("c04", "Angular 14", 6);
        dao.create(curso);
        
        for(Curso c: dao.findAll()){
            System.out.println(c);
        }

    }
}
