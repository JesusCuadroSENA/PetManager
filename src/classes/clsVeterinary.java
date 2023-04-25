
package classes;

import java.util.List;

public class clsVeterinary {
    private String name;
    private String phone;
    private String adress;
    //private List<clsPet> clsPet;
    private clsDoctor doctor;

    public clsVeterinary(String name, String phone, String adress, clsDoctor doctor) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        //this.clsPet = clsPet;
        this.doctor = doctor;
    }
    
    public String PetCare(clsPet pet){
        System.out.println("Atendiendo a la mascota " + pet.getName());
        return pet.getHealthStatus();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }
    /*
    public List<clsPet> getClsPet() {
    return clsPet;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String Adress) {
        this.adress = adress;
    }
    /*
    public void setClsPet(List<clsPet> clsPet) {
    this.clsPet = clsPet;
    }*/
    public clsDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }
    
    
    
}
