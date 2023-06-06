package model;

import classes.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


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

            String sqlPet = "INSERT INTO tblpet ( CodePet, NamePet, BornYearPet, ColorPet, HealthStatusPet) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = con.prepareStatement(sqlPet, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, dog.getCode());
            statementPet.setString(2, dog.getName());
            statementPet.setInt(3, dog.getBorn_year());
            statementPet.setString(4, dog.getColor());
            statementPet.setString(5, dog.getHealth_Status());
            
            statementPet.executeUpdate();
            
            ResultSet rs = statementPet.getGeneratedKeys();
            int id =-1;
            if(rs.next()){
                 id = rs.getInt(1);
            }
            
            String sqlDog = "INSERT INTO tbldog ( BreedDog, PedigreeDog, IDPet) VALUES (?,?,?)";
            
            PreparedStatement statementDog = con.prepareStatement(sqlDog);
            statementDog.setString(1, dog.getBreed());
            statementDog.setBoolean(2, dog.isPedigree());
            statementDog.setInt(3, id);
            
            statementDog.executeUpdate();

            
        } catch (SQLException e) {            
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean EditPet(clsDog dog) {
        
        try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {
                
                System.out.println("Conectado");
                
            }
            
            String sqlID = "SELECT tblpet.IDPet, tbldog.IDDog FROM tblpet INNER JOIN tbldog ON (tblpet.IDPet = tbldog.IDPet) WHERE CodePet= ?;";
            String sqlPet = "UPDATE tblpet SET CodePet = ?, NamePet = ?, BornYearPet = ?, ColorPet = ?, HealthStatusPet = ? WHERE IDPet = ?";
            String sqlDog = "UPDATE tbldog SET BreedDog = ?, PedigreeDog = ? WHERE IDDog = ?";
            PreparedStatement statement = con.prepareStatement(sqlID);
                
            statement.setString(1, dog.getCode());
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                int id1 = rs.getInt(1);
                int id2 = rs.getInt(2);
                
                PreparedStatement statementPet = con.prepareStatement(sqlPet);
                
                statementPet.setString(1, dog.getCode());
                statementPet.setString(2, dog.getName());
                statementPet.setInt(3, dog.getBorn_year());
                statementPet.setString(4, dog.getColor());
                statementPet.setString(5, dog.getHealth_Status());
                statementPet.setInt(6, id1);

                statementPet.executeUpdate();
                
                PreparedStatement statementDog = con.prepareStatement(sqlDog);
                statementDog.setString(1, dog.getBreed());
                statementDog.setBoolean(2, dog.isPedigree());
                statementDog.setInt(3, id2);
                
                statementDog.executeUpdate();

            }
            return true;  
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean DeletePet(String code) {
       try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {        
            if (con != null) {             
                System.out.println("Conectado");
            }
            
            String sqlID = "SELECT tblpet.IDPet, tbldog.IDDog FROM tblpet INNER JOIN tbldog ON (tblpet.IDPet = tbldog.IDPet) WHERE CodePet= ?;";
            String sqlPet = "DELETE FROM tblpet WHERE tblpet.IDPet = ?";
            String sqlDog = "DELETE FROM tbldog WHERE tbldog.IDPet = ?";
            
            PreparedStatement statement = con.prepareStatement(sqlID);
            statement.setString(1, code);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                int id1 = rs.getInt(1);
                int id2 = rs.getInt(2); 
                
                PreparedStatement statementDog = con.prepareStatement(sqlDog);
                statementDog.setInt(1, id1);

                statementDog.executeUpdate();
                
                PreparedStatement statementPet = con.prepareStatement(sqlPet);
                statementPet.setInt(1, id1);
                
                statementPet.executeUpdate();

            }
            return true;  

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public clsDog SearchPet(String code) {
        
        clsDog dog = null;
        
        try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {          
                System.out.println("Conectado");
            }
        
            String sqlID = "SELECT CodePet, NamePet, ColorPet, BornYearPet, HealthStatusPet, BreedDog, PedigreeDog FROM tblpet INNER JOIN tbldog ON (tblpet.IDPet = tbldog.IDPet) WHERE CodePet= ?;";
            PreparedStatement statement = con.prepareStatement(sqlID);
            
            statement.setString(1, code);
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                dog = new clsDog();
    
                dog.setCode(code);
                
                dog.setName(rs.getString(2));
                dog.setColor(rs.getString(3));
                dog.setBorn_Year(rs.getInt(4));
                dog.setHealth_Status(rs.getString(5));
                dog.setBreed(rs.getString(6));
                dog.setPedigree(rs.getBoolean(7));

            }
            
            return dog;
        } catch (Exception e) {
            return dog;
        }
    }
}
