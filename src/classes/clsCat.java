
package classes;

public class clsCat extends clsPet{
    private String breed;
    
    public void SelfCleaning(){
        System.out.println("El gato se esta autolimpiando");
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
    
    public clsCat() {
    }

    public clsCat(int code, String name, int born_year, String breed, String color, String healthStatus) {
        super(code, name, born_year, breed, color, healthStatus);
        this.breed = breed;
    }
}
