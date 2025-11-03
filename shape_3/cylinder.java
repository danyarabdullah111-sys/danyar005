
package shape_3;

import java.util.Scanner;


public class cylinder extends shape {
    private double height;
     private double area;
    public void setHeight(double height){
    this.height=height;
    }
    public double getHeight(){
    return height;
    }  
    public void setArea(){
    this.area=(2*3.14*super.getRadius()*super.getRadius())+this.height*(2*3.14*super.getRadius());
    }
    
    void input(){
        this.setArea();
        Scanner input=new Scanner(System.in);
        super.input();
        System.out.println("enter the height");
        double H=input.nextDouble();
        setHeight(H);
        
    }
    void display(){
    super.display();
        System.out.println("area of cylinder is "+getHeight());
    }
    
    
}
