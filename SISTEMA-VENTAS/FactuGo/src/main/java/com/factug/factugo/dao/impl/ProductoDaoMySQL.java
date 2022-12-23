
package com.factug.factugo.dao.impl;

import com.factug.factugo.dao.ProductoDao;
import com.factug.factugo.entidades.Producto;
import com.factug.factugo.util.ConexionSQL;
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
public class ProductoDaoMySQL implements ProductoDao {
    private List<Producto> lista;
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
     public ProductoDaoMySQL(){
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Producto producto) {
        try {
            cn = ConexionSQL.getConnection();
            ps = cn.prepareStatement("insert productos values(NULL,?, ?, ?)");
            ps.setString(1, producto.getDescripcion());
            ps.setDouble(2,producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.executeUpdate();
            System.out.println("Producto Grabado");
        } catch (SQLException ex) {
            System.out.println("error de conexion: "+ex);
        }
    }

    @Override
    public void update(Producto producto) {
        try {
            cn = ConexionSQL.getConnection();
            ps = cn.prepareStatement("update productos set descripcion=?, precio=? , stock=? where id=?");
            ps.setString(1, producto.getDescripcion());
            ps.setDouble(2,producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getId());
            ps.executeUpdate();
            System.out.println("Producto actualizado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
    }

    @Override
    public void delete(String id) {
        try {
            cn = ConexionSQL.getConnection();
            ps = cn.prepareStatement("delete from productos where id=?");
            ps.setString(1,id);
            ps.executeUpdate();
            System.out.println("Producto Eliminado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }

    }

    @Override
    public Producto find(String id) {
        try {
            cn = ConexionSQL.getConnection();
            ps = cn.prepareStatement("select * from productos where id=?");
            ps.setString(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                 //return new Producto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                /*return new Producto(rs.getString(1),
                        rs.getString(2),
                rs.getInt(3));*/
            }

        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }  
        return null;
    }

    @Override
    public List<Producto> findAll() {
        try {
            cn = ConexionSQL.getConnection();
            ps = cn.prepareStatement("select * from productos ");
            rs = ps.executeQuery();
            lista.clear();
            while(rs.next()){
                lista.add(new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
                /*lista.add(new Curso(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3)));*/
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("error de conexion");
            return null; 
        }  
    }
    
    /*
        private List<Curso> lista;
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public CursoDaoMySQL(){
        lista = new ArrayList<>();
    }
    
    @Override

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
    */

}
