
package classes;

public class clsDoctor {
    private String nameDoctor;
    private String licence;

    public clsDoctor(String nameDoctor, String licence) {
        this.nameDoctor = nameDoctor;
        this.licence = licence;
    }

    public String getName() {
        return nameDoctor;
    }

    public String getLicence() {
        return licence;
    }

    public void setName(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
    
}
