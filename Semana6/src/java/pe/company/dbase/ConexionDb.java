package pe.company.dbase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDb {
    
    // Solo debo cambiar el nombre de la bd, usuario y la contraseña
    
    public static Connection  getConnection(){
        Connection con = null;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/dbbicicleta?useSSL=false&useTimezone=true&serverTimezone=UTC";
            String usr = "root";
            String psw = "123456";
            con = DriverManager.getConnection(url, usr, psw);
        } catch(ClassNotFoundException e) {
            System.out.println("Error >>>> Driver no instalado" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error >>>> General: " + e.getMessage());
        }
        
        return con;
    };
}
