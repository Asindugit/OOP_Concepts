
public abstract class Person {
    
    //Private variables --------------------------------
    private String name;
    private String pass;
    
    //Setters ------------------------------------------
    public void setName(String name){
        this.name=name;
    }
    
    public void setPass(String pass){
        this.pass=pass;
    }
    
    //Getters ------------------------------------------
    public String getName(){
        return name;
    }
    
    public String getPass(){
        return pass;
    }
    
    public abstract void PersonDetails();
    
}
