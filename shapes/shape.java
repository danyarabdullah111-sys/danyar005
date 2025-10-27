
package shapes;


public class shape {
    private String name;
    private String color;
    private double length;
    private double area;
    double getArea;
    public void setArea(double area){
    this.area=area;
     }
    public void setName(String name){
    this.name=name;
     }
    public void setColor(String color){
    this.color=color;
     }
     public void setLength(double length){
    this.length=length;
     }
    public String getName(){
    return name;
    }
    public String getColor(){
    return color;
    }
    public double getLength(){
    return length;
    }
     public double getArea(){
    return area;
    }
    public void display(){
        System.out.println("shapes color :"+getColor());
        System.out.println("shapes name :"+getName());
        System.out.println("length is "+getLength());
    
    }
    
    
    
    
    
    
    
}
