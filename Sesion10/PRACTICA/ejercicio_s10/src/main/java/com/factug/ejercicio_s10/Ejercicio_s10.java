package com.factug.ejercicio_s10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jhordie
 */
public class Ejercicio_s10 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String url = "jdbc:mysql://localhost:3306/escuela?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user= "root";
        String password = "";
        //String sql = "select chrCurCodigo as id, vchCurNombre as curso, intCurCreditos as creditos from curso";
        String sql = "select * from curso";
        try (Connection cn = DriverManager.getConnection(url,user,password);
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql);
                ){
            ResultSetMetaData meta = rs.getMetaData();
            System.out.print(meta.getColumnLabel(1)+"\t");
            System.out.print(meta.getColumnLabel(2)+"\t");
            System.out.println(meta.getColumnLabel(3));
            while(rs.next()){
                System.out.print(rs.getString(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.println(rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println("Codigo de error: "+ex.getErrorCode());
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
