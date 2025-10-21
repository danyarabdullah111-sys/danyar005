
package act3;


public class employee {
    private String firstname;
    private String lastname;
    private double msalary;
    public void setFirstname(String firstname){
    this.firstname=firstname;
    }
    public void setLastname(String lastname){
    this.lastname=lastname;
    }
    public void setMsalary(double msalary){
    this.msalary=msalary;
    }
    public String getFirstname(){
    return firstname;
    }
     public String getLastname(){
    return lastname;
    }
     public double getMsalary(){
    return msalary;
    }
    public employee(String firstname,String lastname,double msalary){
    this.firstname=firstname;
    this.lastname=lastname;
    
    if(msalary>0){
    this.msalary=msalary;
    }
   
    }
   void display(double percent){
       
       msalary=msalary+(msalary*percent/100);
       
       System.out.println(firstname+" "+lastname+" "+"awa ma3ashakata: "+msalary);
   
   
   
   
   }  
     
     
     
     
     
    
    
    
    
    
    
    
    
    
}
