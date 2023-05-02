
package classes;

public abstract class AbstHospital {
    
    public String data;
    
    public abstract String getPatientType();
    public abstract String Surgery();
    
    public String getHospitalInformation(){
        return this.getData();
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.data = data;
    }
}
