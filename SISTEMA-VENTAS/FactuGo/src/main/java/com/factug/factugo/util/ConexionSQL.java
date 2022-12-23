
package com.factug.factugo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jhordie
 */
public class ConexionSQL {
        private static String driver= "com.mysql.cj.jdbc.Driver";
        private static String usuario = "root";
        private static String password = "";
        private static String url = "jdbc:mysql://localhost:3306/factugo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";   
        static{
            try{
                Class.forName(driver);
            }catch (ClassNotFoundException e) {
                System.out.println(e);
            }
        }

    /**
     * Obtiene una conexi�n a la Base de Datos.
     * @return
     */
    public static Connection getConnection() {
        Connection connection=null;
        try{
            connection = DriverManager.getConnection(url,usuario,password);
        }
        catch(SQLException e){
            //Error en base de datos no se puede lograr la conexion
            System.out.println("Error:"+e);
        }
        return connection;
    }
}
