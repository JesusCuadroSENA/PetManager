
package petmanager;

import classes.clsPet;
import javax.swing.JOptionPane;

public class PetManager {
    public static void main(String[] args) {
        
        clsPet pet1 = new clsPet();
        pet1.setName("Tobi");
        pet1.setBorn_year(2010);
        pet1.setHealthStatus("Sano");
        pet1.setCode(1);
        pet1.setColor("Rojo");
        pet1.setBreed("Golden");
        
        clsPet pet2 = new clsPet(2, "Chita", 2010, "Chihuahua", "Negro", "Saludable");
        
        System.out.println("La mascota uno es: " + pet1);
        System.out.println("La mascota dos es: " + pet2);
        
        System.out.println(calcularMayor(pet1.getBorn_year(), pet2.getBorn_year()));
        
        if(pet1.getBorn_year()<pet2.getBorn_year()){
            System.out.println("La mascota 1 es mayor");
        } else { 
            if(pet1.getBorn_year()>pet2.getBorn_year()){
                System.out.println("La mascota 2 es mayor");
            } else {
                System.out.println("Las mascotas tienen la misma edad");
            }        
        } 
    }

    private static boolean calcularMayor(int born_year, int born_year0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
