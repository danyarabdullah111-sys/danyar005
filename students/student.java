package students;

public class student {
private String name;
private int id;

private final String dep="cs";
private int sem; 
 public void setName(String N){
    name=N;
    }
 public void setID(int I){
    id=I;
    }
 
 public void setSem(int S){
    sem=S;
    }

public student(String name,int id,int sem){
this.name=name;
this.id=id;
this.sem=sem;
}

void display(){
    System.out.println("name:"+name);
    System.out.println("ID:"+id);
    System.out.println("department: "+dep);
    System.out.println("semester: "+sem);
    
    


}





    
}
