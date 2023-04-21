
package classes;

import java.util.List;

public class clsVeterinary {
    private String name;
    private int phone;
    private String adress;
    private List<clsPet> clsPet;
    private clsDoctor clsDoctor;
    
    public void PetCare(){
        System.out.println("El veterinario esta cuidando a las mascotas");
    }

    public clsVeterinary(String name, int phone, String Adress, List<clsPet> clsPet, String nameDoctor, String licence) {
        this.name = name;
        this.phone = phone;
        this.adress = Adress;
        this.clsPet = clsPet;
        this.clsDoctor = new clsDoctor(nameDoctor, licence);
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public List<clsPet> getClsPet() {
        return clsPet;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAdress(String Adress) {
        this.adress = adress;
    }

    public void setClsPet(List<clsPet> clsPet) {
        this.clsPet = clsPet;
    }
    
}
