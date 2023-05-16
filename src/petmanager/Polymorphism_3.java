
package petmanager;

import classes.clsCat;
import classes.clsDog;
import interfaces.animal;

public class Polymorphism_3 {
    
    public static void main(String[] args) {
     
        clsDog dog_3 = new clsDog("Bowser", "003", "Tobi", 2014,"Negro", "Saludable", true);
        clsCat dog_4 = new clsCat("Golden", "004", "Gato", 2017, "Blanco y Negro", "Enfermo");
        
        dog_3.WalkAround();
        dog_3.WalkAround(25);
        dog_3.WalkAround(true);
        
        dog_3.getAnimalType();
        dog_3.getNumberOfBones(30);
    }
}
