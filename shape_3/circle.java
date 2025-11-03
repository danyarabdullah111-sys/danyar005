
package shape_3;


public class circle extends shape {
    private double area;
    
    public void setArea(){
    this.area=super.getRadius()*super.getRadius()*3.14;
    }
    public double getArea(){
    return area;
    }
    void input(){
    super.input();
    this.setArea();
    }
    void display(){
        super.display();
        System.out.println("the area of circle is "+getArea());
    }
    
    
    
}
