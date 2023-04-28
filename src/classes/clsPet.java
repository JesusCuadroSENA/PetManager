
package classes;

import interfaces.animal;
import interfaces.vertebrate;

public class clsPet implements animal, vertebrate{

    private int code;
    String name;
    private int born_year;
    private String color;
    private String healthStatus;
           
    public clsPet() {  
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
    
    public void WalkAround(int km){
        System.out.println(this.name + " ha caminado " + km + " kilometros");
    }
    
    public void WalkAround(boolean dogLeash){
        if(dogLeash){
            System.out.println(this.name + " esta caminando con correa");
        } else{
            System.out.println(this.name + " esta caminando sin correa");
        }
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
    
    @Override
    public void getAnimalType(String Tipo) {
        System.out.println(this.name+" es de tipo "+Tipo);
    }

    @Override
    public void getNumberOfBones(int Bones) {
        System.out.println(this.name+" tiene " + Bones + " huesos.");
    }
}

