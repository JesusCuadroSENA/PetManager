
package model;

import classes.*;

public class modelCat {
    public boolean CreatePet(clsCat cat){
        
        try{
            return true;
        }catch(Exception e){
            return false;
        }   
    }
    
     public boolean EditPet(clsCat cat){
        try{
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean DeletePet(String code){
        try{
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    public clsPet SearchPet(String code){
        clsCat cat = null;
        try{
            int intCode = Integer.parseInt(code);
            if(intCode == 1){
                cat = new clsCat("Persia", "1", "Michifu", 2020,"Rosa", "Sano");
            } else if(intCode == 2){
                cat = new clsCat("Siberiano", "2", "Pelusa", 2022,"Blanco con negro", "Enfermo");
            }else{
                System.out.println("No se encontro al gato");
            }
            return cat;
        } catch (Exception e){
            return cat;
        }
    }
}
