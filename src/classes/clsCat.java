
package classes;

public class clsCat extends clsPet{
    
    private String breed;
    
    public clsCat() {
        
    }
    
    public clsCat(String breed,int code, String name, int born_year, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
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
    /*<<<<<<< HEAD
    =======
    
    public clsCat() {
    }
    
    public clsCat(int code, String name, int born_year, String color, String healthStatus) {
    super(code, name, born_year, color, healthStatus);
    this.breed = breed;
    }
    >>>>>>> 4226acb8367c4b8356209aabac8b4a399d0d9182*/
}
