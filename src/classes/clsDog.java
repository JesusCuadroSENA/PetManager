
package classes;

public class clsDog extends clsPet{
    private String breed;
    private boolean pedigree;
    
    public clsDog() {
        
    }

    public clsDog(String breed, int code, String name, int born_year, String color, String healthStatus, boolean pedigree) {
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
    /*<<<<<<< HEAD
    =======
    
    public clsDog() {
    }
    
    public clsDog(int code, String name, int born_year, String breed, String color, String healthStatus) {
    super(code, name, born_year, color, healthStatus);
    this.breed = breed;
    this.pedigree = pedigree;
    }
    
    >>>>>>> 4226acb8367c4b8356209aabac8b4a399d0d9182*/
}
