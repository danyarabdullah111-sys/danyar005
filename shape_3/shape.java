
package shape_3;

import java.util.Scanner;


public class shape {
 private String color;
 private double radius;
 public void setColor(String color){
 this.color=color;
     }
  public String getColor(){
  return color;
  }  
   public void setRadius(double radius){
 this.radius=radius;
     }  
    
    public double getRadius(){
    return radius;
    
    }
    void input(){
      Scanner input=new Scanner(System.in);
        System.out.println("please enter color");
       String C=input.nextLine();
       setColor(C);
        System.out.println("please enter the radius");
    double R=input.nextDouble();
    setRadius(R);
    
    }
    
    
    
    
    
    void display(){
        System.out.println("color is "+getColor());
        System.out.println("radius is "+getRadius());
    
    }
    
    
    
    
    
}
