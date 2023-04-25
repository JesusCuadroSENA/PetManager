
package petmanager;

import classes.clsCat;
import classes.clsDoctor;
import classes.clsDog;
import classes.clsVeterinary;


public class Polymorphism {
    public static void main(String[] args) {
        
        clsDog dog = new clsDog("Pastor Aleman", 001, "Angelo", 2005,"Negro", "Saludable", true);
        clsCat cat = new clsCat("Persa", 002, "Minino", 2016, "Blanco y Negro", "Enfermo");
        
        clsDoctor doctor = new clsDoctor ("Maria Fernandez", "GDFJK4736");
        clsVeterinary veterinary = new clsVeterinary ("Veterinaria mi perrito feliz", "3127463527", "Calle 24 #34-64", doctor);
        
        String careDog = veterinary.PetCare(dog);
            System.out.println("El estado de salud de " + dog.getName() + " es " + careDog);
            
        String careCat = veterinary.PetCare(cat);
            System.out.println("El estado de salud de " + cat.getName() + " es " + careCat);
    }
}
