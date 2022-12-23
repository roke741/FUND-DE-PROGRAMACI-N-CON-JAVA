
package com.mycompany.ejercicio_s08.dao;

import com.mycompany.ejercicio_s08.entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public class ProfesorDaoMemory {
    List<Profesor> lista;
    public ProfesorDaoMemory(){
        lista = new ArrayList<>();
    }
    public void create(Profesor profesor){
        lista.add(profesor);
    }
    public List<Profesor> findAll(){
        return lista;
    }
    public Profesor find(int id){
        for(Profesor profesor: lista){
            if(profesor.getId() == id){
                return profesor;
            }
        }
        return null;
    }
    public void update(Profesor objProfesor){
        //actualiza la lista con el indice
        for(int i = 0; i < lista.size() ; i ++){
            if(lista.get(i).getId() == objProfesor.getId() ){
                lista.set(i, objProfesor);
                break;
            }
        }
    }
    
    public void delete(Profesor profesor){
        lista.remove(profesor);
    }
    
    
    
}
