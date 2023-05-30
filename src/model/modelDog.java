package model;

import classes.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class modelDog {
    
    DbData dbData;

    public modelDog() {
        this.dbData = new DbData();
    }

    public boolean CreatePet(clsDog dog) {

        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {
                System.out.println("Conectado");
            }

            String sql = "INSERT INTO tblpet ( CodePet, NamePet, BornYearPet, ColorPet, HealthStatusPet) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, dog.getCode());
            statementPet.setString(2, dog.getName());
            statementPet.setInt(3, dog.getBorn_year());
            statementPet.setString(4, dog.getColor());
            statementPet.setString(5, dog.getHealth_Status());
            
            statementPet.execute();
            
        } catch (SQLException e) {            
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean EditPet(clsDog dog) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean DeletePet(clsPet pet) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public clsDog SearchPet(String code) {
        clsDog dog = null;
        try {
            int intCode = Integer.parseInt(code);
            if (intCode == 1) {
                dog = new clsDog("Golden", "1", "Juanito", 2014, "Negro", "Sano", true);
            } else if (intCode == 2) {
                dog = new clsDog("Chihuahua", "2", "Firulais", 2020, "Azul", "Enfermo", false);
            } else {
                System.out.println("No se encontro al perro");
            }
            return dog;
        } catch (Exception e) {
            return dog;
        }
    }
}
