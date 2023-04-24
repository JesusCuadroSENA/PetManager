
package classes;

public class clsPet {
    int code;
    String name;
    int born_year;
    String color;
    String healthStatus;
    
        public void eat(){
            System.out.println("Comer");
        }

        public void move(){
            System.out.println("EL ANIMAL ESTA MUERTOOOOOOO!!!");
        }
  
       public clsPet() {
        this.code = 0;
        this.name = "";
        this.born_year = 0;
        this.color = "";
        this.healthStatus = "";
        
    }

    public clsPet(int code, String name, int born_year, String color, String healthStatus) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.healthStatus = healthStatus;
        
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
    
    public void calcularMayor(int pet1,int pet2){
        if(pet1<pet2){
            System.out.println("La mascota 1 es mayor");
        } else { 
            if(pet1>pet2){
                System.out.println("La mascota 2 es mayor");
            } else {
                System.out.println("Las mascotas tienen la misma edad");
            }        
        }
    }
}

