package adn;

public class Persons {
    private String Name;
    private String ADN;
    
    public Persons(){
        this.Name = "";
        this.ADN = "";
    }
    public Persons(String Name, String ADN){
        this.Name = Name;
        this.ADN = ADN;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setADN(String ADN){
        this.ADN = ADN;
    }
    
    public String getName() {
        return this.Name;
    }

    public String getADN() {
        return this.ADN;
    }
    
    
    
}
