
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
    
    public boolean DeletePet(clsCat cat){
        try{
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    public clsPet SearchPet(String code){
        clsCat cat = null;
        try{
            return cat;
        } catch (Exception e){
            return cat;
        }
    }
}