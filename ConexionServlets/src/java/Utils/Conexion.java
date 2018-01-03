/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import java.sql.*;
/**
 *
 * @author Leiva
 */
public class Conexion {
        
    public static Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/cursojsp?user=root&password:");
            System.out.println("Conexion Existosa");
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return con;
    }
    
    public static void main(String[] args) {
        
        Conexion.getConexion();
        
    }
}
