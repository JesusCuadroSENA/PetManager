
package model;

import classes.*;

public class modelDog {
    
    public boolean CreatePet(clsDog dog){
        
        try{
            return true;
        }catch(Exception e){
            return false;
        }   
    }
    
     public boolean EditPet(clsDog dog){
        try{
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean DeletePet(clsPet pet){
        try{
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    public clsDog SearchPet(String code){
        clsDog dog = null;
        try{
            int intCode = Integer.parseInt(code);
            if(intCode == 1){
                dog = new clsDog("Golden", "1", "Juanito", 2014,"Negro", "Sano", true);
            } else if(intCode == 2){
                dog = new clsDog("Chihuahua", "2", "Firulais", 2020,"Azul", "Enfermo", false);
            }else{
                System.out.println("No se encontro al perro");
            }
            return dog;
        } catch (Exception e){
            return dog;
        }
    }
}
