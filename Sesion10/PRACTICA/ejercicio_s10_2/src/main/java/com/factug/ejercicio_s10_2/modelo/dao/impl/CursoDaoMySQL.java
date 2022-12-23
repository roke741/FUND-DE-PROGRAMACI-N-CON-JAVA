
package com.factug.ejercicio_s10_2.modelo.dao.impl;

import com.factug.ejercicio_s10_2.modelo.dao.CursoDao;
import com.factug.ejercicio_s10_2.modelo.entidades.Curso;
import com.factug.ejercicio_s10_2.util.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhordie
 */
public class CursoDaoMySQL implements CursoDao {
    
    
    private List<Curso> lista;
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public CursoDaoMySQL(){
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Curso curso) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert Curso values(?,?,?)");
            ps.setString(1,curso.getId());
            ps.setString(2, curso.getNombre());
            ps.setInt(3,curso.getCreditos());
            ps.executeUpdate();
            System.out.println("Curso Grabado");
        } catch (SQLException ex) {
            System.out.println("error de conexion: "+ex);
        }
    }

    @Override
    public void update(Curso curso) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("update curso set vchCurNombre=?,intCurCreditos=? where chrCurCodigo=?");
            ps.setString(3,curso.getId());
            ps.setString(1, curso.getNombre());
            ps.setInt(2,curso.getCreditos());
            ps.executeUpdate();
            System.out.println("Curso actualizado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
    }

    @Override
    public void delete(String id) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("delete from curso where chrCurCodigo=?");
            ps.setString(1,id);
            ps.executeUpdate();
            System.out.println("Curso Eliminado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }

    }

    @Override
    public Curso find(String id) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from curso where chrCurCodigo=?");
            ps.setString(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Curso(rs.getString(1),
                        rs.getString(2),
                rs.getInt(3));
            }

        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }  
        return null;  
    }

    @Override
    public List<Curso> findAll() {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from curso ");
            rs = ps.executeQuery();
            lista.clear();
            while(rs.next()){
                lista.add(new Curso(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3)));
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("error de conexion");
            return null; 
        }  
        
    }
    
}
