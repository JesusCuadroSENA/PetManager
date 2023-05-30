package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

//IMPORTANTE importar a "Libraries" el mysql-connector.jar en cualquiera de sus versiones
public class DbData {

    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3307/petmanager";

    Connection con;

    public String getDriver() {
        return driver;
    }

    public Connection getCon() {
        return con;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public DbData() {
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public boolean verificarConexion() {
        try {
            return !con.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        DbData conf = new DbData();
        if (conf.verificarConexion()) {
            System.out.println("La conexion es correcta");
        } else {
            System.out.println("La conexion no es correcta");
        }
    }
}
