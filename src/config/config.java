
package config;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

//IMPORTANTE importar a "Libraries" el mysql-connector.jar en cualquiera de sus versiones

public class config {
    
    Connection con;

    public config(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/PetManager","root","");   
        } catch(ClassNotFoundException | SQLException e){
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public boolean verificarConexion(){
        try{
            return !con.isClosed();
        } catch(SQLException e){
            return false;
        }
    }
    
    public static void main(String[] args) {
        config conf = new config();
        if(conf.verificarConexion()){
            System.out.println("La conexion es correcta");
        } else {
            System.out.println("La conexion no es correcta");
        }
    }
}
