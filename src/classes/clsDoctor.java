
package classes;

public class clsDoctor {
    private String nameDoctor;
    private String licence;

    public clsDoctor(String name, String licence) {
        this.nameDoctor = name;
        this.licence = licence;
    }

    clsDoctor(String nameDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
