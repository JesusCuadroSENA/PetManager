
package classes;

public class clsDog extends clsPet{
    private String breed;
    private String pedigree;
    
    public void WalkAround(){
        System.out.println("El perro esta caminando");
    }

    public clsDog(String breed, String pedigree) {
        this.breed = breed;
        this.pedigree = pedigree;
    }

    public String getBreed() {
        return breed;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public clsDog() {
    }

    public clsDog(int code, String name, int born_year, String breed, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.pedigree = pedigree;
    }
    
}
