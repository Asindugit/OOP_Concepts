
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Student extends Person {
    
    private String address;
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public String getAddress(){
        return address;
    }
    
    
    //File Writer ---------------------------------------
    
    public void registerStudent(Student p){
        
        try{
            FileWriter writer= new FileWriter("student.txt", true);
            String line = getName()+","+
                    getPass()+","+
                    getAddress()+"\n";
            
            writer.write(line);
            writer.close();
            
            PersonDetails();
                    
        } catch(IOException e){
            
        }
        
        
        
    }
    
    @Override
    public void PersonDetails(){
        JOptionPane.showMessageDialog(null, "Student Registartion Successfully!",
                 "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
