
package classes;

public class clsPet {

    private int code;
    private String name;
    private int born_year;
    private String color;
    private String healthStatus;
           
    public clsPet() {  
    int code;
    String name;
    int born_year;
    String color;
    String healthStatus;
    }

    public clsPet(int code, String name, int born_year, String color, String healthStatus) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.healthStatus = healthStatus;
        
    }
    
    public void Eat(){
        System.out.println("El animal " + this.name + " esta alimentandose");
    }

    public void Move(){
        System.out.println("El animal " + this.name + " esta moviendose");
    }
    
    public void Sound(){
        System.out.println("El animal " + this.name + " esta haciendo un ruido");
    }
    
    public void WalkAround(){
        System.out.println("El animal " + this.name + " esta dando una vuelta");
    }
    
    public void SelfCleanning(){
        System.out.println("El animal " + this.name + " se esta acicalando");
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getBorn_year() {
        return born_year;
    }

    public String getColor() {
        return color;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}

