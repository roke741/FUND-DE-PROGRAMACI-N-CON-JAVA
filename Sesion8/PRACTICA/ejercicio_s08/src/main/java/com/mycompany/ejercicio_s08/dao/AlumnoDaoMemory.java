
package com.mycompany.ejercicio_s08.dao;

import com.mycompany.ejercicio_s08.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public class AlumnoDaoMemory implements EntidadDao {
    
    List<Alumno> lista;
    public AlumnoDaoMemory(){
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Alumno alumno){
        lista.add(alumno);
        
    }
    
    @Override
    public List<Alumno> findAll(){
        return lista;
    }
    
    @Override
    public Alumno find(int id){
        for(Alumno alumno : lista){
            if(alumno.getId() == id){
                return alumno;
            }
        }
        return null;
    }
    
    @Override
    public void update(Alumno objAlumno){
        //actualiza la lista con el indice
        for(int i = 0; i < lista.size() ; i ++){
            if(lista.get(i).getId() == objAlumno.getId() ){
                lista.set(i, objAlumno);
                break;
            }
        }
    }
    
    @Override
    public void delete(Alumno alumno){
        lista.remove(alumno);
    }
    
    
}
