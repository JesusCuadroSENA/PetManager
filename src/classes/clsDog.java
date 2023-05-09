
package classes;

public class clsDog extends clsPet{
    private String breed;
    private boolean pedigree;
    
    public clsDog() {
    }

    public clsDog(String breed, String code, String name, int born_year, String color, String healthStatus, boolean pedigree) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    @Override
    public void Sound(){
        System.out.println("Esta ladrando " + this.name);
    }
    
    public String getAnimalType() {
        return "Domestico";
    }

    public int getNumberOfBones() {
        return 0;
    }
}
