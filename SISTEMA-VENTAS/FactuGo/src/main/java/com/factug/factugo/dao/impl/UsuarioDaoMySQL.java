
package com.factug.factugo.dao.impl;

import com.factug.factugo.dao.UsuarioDao;
import com.factug.factugo.entidades.Usuario;
import com.factug.factugo.util.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jhordie
 */
public class UsuarioDaoMySQL implements UsuarioDao {
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public Usuario login(String us, String ps) {
        Usuario usuario = null;
        try {
            cn = ConexionSQL.getConnection();
            this.ps = cn.prepareStatement(" select * from usuarios where username=? and password=?");
            this.ps.setString(1, us);
            this.ps.setString(2, ps);
            rs = this.ps.executeQuery();
            if(rs.next()){
                usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(4));
                /*usuario = new Usuario(rs.getString(1),
                                                rs.getString(2),
                                               rs.getString(3),
                                            rs.getString(4),
                                                    rs.getString(5));*/
            }
        } catch (SQLException ex) {
            System.out.println("Error de conexion");
        }
        return usuario;
    }
    
}
