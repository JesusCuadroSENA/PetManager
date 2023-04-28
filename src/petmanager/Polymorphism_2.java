
package petmanager;

import classes.clsCat;
import classes.clsDog;
import classes.clsPet;

public class Polymorphism_2{

    public static void main(String[] args) {
     
        clsDog dog_2 = new clsDog("Pinky", 003, "Juanito", 2014,"Negro", "Saludable", true);
        clsCat cat_2 = new clsCat("Siberiano", 004, "Gato", 2017, "Blanco y Negro", "Enfermo");
        
        dog_2.Sound();
        cat_2.Sound();
    }
     
}
