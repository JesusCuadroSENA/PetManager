
package model;

import classes.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class modelCat {
    
    DbData dbData;
    
    public modelCat(){
        this.dbData = new DbData();
    }
    
    public boolean CreatePet(clsCat cat){
        
        try (Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {
                System.out.println("Conectado");
            }

            String sqlPet = "INSERT INTO tblpet ( CodePet, NamePet, BornYearPet, ColorPet, HealthStatusPet) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = con.prepareStatement(sqlPet, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, cat.getCode());
            statementPet.setString(2, cat.getName());
            statementPet.setInt(3, cat.getBorn_year());
            statementPet.setString(4, cat.getColor());
            statementPet.setString(5, cat.getHealth_Status());
            
            statementPet.executeUpdate();
            
            ResultSet rs = statementPet.getGeneratedKeys();
            int id =-1;
            if(rs.next()){
                 id = rs.getInt(1);
            }
            
            String sqlCat = "INSERT INTO tblcat ( BreedCat, IDPet) VALUES (?,?)";
            
            PreparedStatement statementCat = con.prepareStatement(sqlCat);
            statementCat.setString(1, cat.getBreed());
            statementCat.setInt(2, id);
            
            statementCat.executeUpdate();

            
        } catch (SQLException e) {            
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
     public boolean EditPet(clsCat cat){
          try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {
                
                System.out.println("Conectado");
                
            }
            
            String sqlID = "SELECT tblpet.IDPet, tblcat.IDCat FROM tblpet INNER JOIN tblcat ON (tblpet.IDPet = tblcat.IDPet) WHERE CodePet= ?;";
            String sqlPet = "UPDATE tblpet SET CodePet = ?, NamePet = ?, BornYearPet = ?, ColorPet = ?, HealthStatusPet = ? WHERE IDPet = ?";
            String sqlCat = "UPDATE tblcat SET BreedCat = ? WHERE IDCat = ?";
            PreparedStatement statement = con.prepareStatement(sqlID);
                
            statement.setString(1, cat.getCode());
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                int id1 = rs.getInt(1);
                int id2 = rs.getInt(2);
                
                PreparedStatement statementPet = con.prepareStatement(sqlPet);
                
                statementPet.setString(1, cat.getCode());
                statementPet.setString(2, cat.getName());
                statementPet.setInt(3, cat.getBorn_year());
                statementPet.setString(4, cat.getColor());
                statementPet.setString(5, cat.getHealth_Status());
                statementPet.setInt(6, id1);

                statementPet.executeUpdate();
                
                PreparedStatement statementCat = con.prepareStatement(sqlCat);
                statementCat.setString(1, cat.getBreed());
                statementCat.setInt(2, id2);
                
                statementCat.executeUpdate();

            }
            return true;  
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean DeletePet(String code){
         try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {        
            if (con != null) {             
                System.out.println("Conectado");
            }
            
            String sqlID = "SELECT tblpet.IDPet, tblcat.IDCat FROM tblpet INNER JOIN tblcat ON (tblpet.IDPet = tblcat.IDPet) WHERE CodePet= ?;";
            String sqlPet = "DELETE FROM tblpet WHERE tblpet.IDPet = ?";
            String sqlCat = "DELETE FROM tblcat WHERE tblcat.IDPet = ?";
            
            PreparedStatement statement = con.prepareStatement(sqlID);
            statement.setString(1, code);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                int id1 = rs.getInt(1);
                int id2 = rs.getInt(2); 
                
                PreparedStatement statementDog = con.prepareStatement(sqlCat);
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
    
    public clsPet SearchPet(String code){
        clsCat cat = null;
        
        try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {          
                System.out.println("Conectado");
            }
        
            String sqlID = "SELECT CodePet, NamePet, ColorPet, BornYearPet, HealthStatusPet, BreedCat FROM tblpet INNER JOIN tblcat ON (tblpet.IDPet = tblcat.IDPet) WHERE CodePet= ?;";
            PreparedStatement statement = con.prepareStatement(sqlID);
            
            statement.setString(1, code);
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                cat = new clsCat();
    
                cat.setCode(code);
                
                cat.setName(rs.getString(2));
                cat.setColor(rs.getString(3));
                cat.setBorn_Year(rs.getInt(4));
                cat.setHealth_Status(rs.getString(5));
                cat.setBreed(rs.getString(6));

            }
            
            return cat;
        } catch (Exception e) {
            return cat;
        }
    }
}
