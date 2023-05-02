
package petmanager;

import classes.clsDoctor;
import classes.clsVeterinary;

public class AbstractClass {
    public static void main(String[] args) {
        
        clsDoctor doctor = new clsDoctor("Maria Fernandez", "L1243");
        clsVeterinary veterinary = new clsVeterinary("Veterinari UDC", "036", "CLL 65 26 10", doctor);
        
        veterinary.setData(veterinary.getName() + " " + veterinary.getAdress());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: " + surgery);
    }
}
