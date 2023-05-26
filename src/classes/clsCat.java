
package classes;

public class clsCat extends clsPet{
    
    private String breed;
    
    public clsCat() {
    }
    
    public clsCat(String breed,String code, String name, int bornyear, String color, String healthstatus) {
        super(code, name, bornyear, color, healthstatus);
        this.breed = breed;
    }

    public clsCat(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public void Sound(){
        System.out.println("Esta maullando " + this.name);
    }
    

    public String getAnimalType() {
        return "Gato";
    }

    public int getNumberOfBones() {
        return 230;
    }
}
