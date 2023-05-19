
package controller;

import classes.*;
import model.*;


public class ctlPet {
    
    private modelDog modelDog;
    private modelCat modelCat;
    
    public ctlPet(){
        this.modelDog = new modelDog();
        this.modelCat = new modelCat();
    }
    
    public boolean CreatePet(clsPet pet){
     
        try{
            switch (pet.getAnimalType()){
                case "Gato":
                this.modelCat.CreatePet((clsCat)pet);
                break;
                case "Perro":
                this.modelDog.CreatePet((clsDog)pet);
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
                this.modelCat.EditPet((clsCat)pet);
                break;
                case "Perro":
                this.modelDog.EditPet((clsDog)pet);
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
                this.modelCat.DeletePet((clsCat)pet);
                break;
                case "Perro":
                this.modelDog.DeletePet((clsDog)pet);
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
                this.modelCat.SearchPet(code);
                break;
                case "Perro":
                this.modelDog = new modelDog();
                pet = this.modelDog.SearchPet(code);
                
                break;
            }
            return pet;
        } catch (Exception e){
            return pet;
        }
    }
    
}
