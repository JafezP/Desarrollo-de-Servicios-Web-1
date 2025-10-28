package pe.company.dbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDb {
    
    public static Connection  getConnection(){
        Connection con = null;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/bd_veterinaria_v3?useSSL=false&useTimezone=true&serverTimezone=UTC";
            String usr = "root";
            String psw = "1234";
            con = DriverManager.getConnection(url, usr, psw);
        } catch(ClassNotFoundException e) {
            System.out.println("Error >>>> Driver no instalado" + e.getMessage());
        } catch (IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println("Error >>>> General: " + e.getMessage());
        }
        
        return con;
    };
}
