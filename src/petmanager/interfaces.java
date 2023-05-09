
package petmanager;

import classes.clsCat;
import classes.clsDog;

public class interfaces {
    public static void main(String[] args) {
        
        clsDog dog = new clsDog("Pomerania", "006", "Tomy", 2020, "Negro", "Sano", true);
        clsCat cat = new clsCat("Bengali", "007", "Michifu", 2018, "BlackWhite", "Enfermo");
        
        System.out.println(dog.getAnimalType());
        
        System.out.println("" + cat.getAnimalType());
       
        System.out.println(dog.getNumberOfBones());
        
        System.out.println("" + cat.getNumberOfBones());
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          