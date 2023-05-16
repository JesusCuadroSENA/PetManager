
package controller;

import classes.clsPet;


public class ctlPet {
    
    public ctlPet(){
    }
    
    public boolean CreatePet(clsPet pet){
     
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                break;
                case "Perro":
                break;
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    public boolean EditPet(clsPet pet){
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                break;
                case "Perro":
                break;
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean DeletePet(clsPet pet){
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                break;
                case "Perro":
                break;
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    public clsPet SearchPet(String code, String type){
        clsPet pet = null;
        try{
            switch(type){
                case "Gato":
                    break;
                case "Perro":
                    break;
            }
            return pet;
        } catch (Exception e){
            return pet;
        }
    }
    
}
