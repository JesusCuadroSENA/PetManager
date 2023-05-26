
package classes;

import interfaces.animal;
import interfaces.vertebrate;

public class clsPet implements animal, vertebrate{

    private String code;
    String name;
    private int born_year;
    private String color;
    private String health_status;
    private clsVeterinary veterinary;
           
    public clsPet() {
    }

    public clsPet(String code, String name, int born_year, String color, String health_status) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.health_status = health_status;
        
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

    public String getCode() {
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

    public String getHealth_Status() {
        return health_status;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorn_Year(int born_year) {
        this.born_year = born_year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHealth_Status(String health_status) {
        this.health_status = health_status;
    }
    
    public String getAnimalType() {
        return "Perro";
    }

    @Override
    public void getNumberOfBones(int Bones) {
    }

    @Override
    public void getAnimalType(clsPet Tipo) {
    }
    
}

