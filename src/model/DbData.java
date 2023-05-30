package model;

import java.sql.Connection;

//IMPORTANTE importar a "Libraries" el mysql-connector.jar en cualquiera de sus versiones
public class DbData {

    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3307/petmanager";

    public String getDriver() {
        return driver;
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
}
