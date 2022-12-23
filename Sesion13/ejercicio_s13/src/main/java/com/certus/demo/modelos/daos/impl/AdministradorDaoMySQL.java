
package com.certus.demo.modelos.daos.impl;

import com.certus.demo.modelos.daos.AdministradorDao;
import com.certus.demo.modelos.entidades.Administrador;
import com.certus.demo.util.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jhordie
 */
public class AdministradorDaoMySQL implements AdministradorDao{
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public Administrador login(String us, String ps) {
        Administrador administrador = null;
        try {
            this.cn = DbConn.getConnection();
            this.ps = cn.prepareStatement(" select * from administrador where chrAdmLogin=? and chrAdmPassword=?");
            this.ps.setString(1, us);
            this.ps.setString(2, ps);
            rs = this.ps.executeQuery();
            if(rs.next()){
                administrador = new Administrador(rs.getString(1),
                                                rs.getString(2),
                                               rs.getString(3),
                                            rs.getString(4),
                                                    rs.getString(5));
            }
        } catch (SQLException ex) {
            System.out.println("Error de conexion");
        }
        return administrador;
    }

}
