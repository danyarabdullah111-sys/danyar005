
package shapess;


public class circle extends shape {
    private double area;
    private double permeter;
    public void setArea(){
    double r=super.getX();
    this.area=3.14*r;
    
    }
    public double getArea(){
    return area;
    }
    public void setPermeter(){
        double r=4;
        super.setX(r);
    this.permeter=2*3.14*r;
      }
    public double getPermeter(){
    return permeter;
    }
   

    
    public void area() {
        setArea();
        System.out.println("area of circle: "+getArea());  
     }

    
    public void permeter() {
        setPermeter();
        System.out.println("permiter of circle: "+getPermeter());
    }
     public void resize(){
    
    
    }
    
    
    
    
}
