
package classes;

public class clsDoctor {
    private String nameDoctor;
    private String licence;

    public clsDoctor(String name, String licence) {
        this.nameDoctor = name;
        this.licence = licence;
    }

    public String getName() {
        return nameDoctor;
    }

    public String getLicence() {
        return licence;
    }

    public void setName(String name) {
        this.nameDoctor = nameDoctor;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
    
}
