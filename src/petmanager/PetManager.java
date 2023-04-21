
package petmanager;

import classes.clsPet;

public class PetManager {
    public static void main(String[] args) {
        
        clsPet pet1 = new clsPet();
        pet1.setName("Tobi");
        pet1.setBorn_year(2010);
        pet1.setHealthStatus("Sano");
        pet1.setCode(1);
        pet1.setColor("Rojo");
        
        clsPet pet2 = new clsPet(2, "Chita", 2010, "Negro", "Saludable");
        
        System.out.println("La mascota uno es: " + pet1);
        System.out.println("La mascota dos es: " + pet2);
        
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
}
   
