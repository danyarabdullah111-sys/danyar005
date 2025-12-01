
package shapess;

public abstract class rectangle extends shape{
    private double area;
    private double permeter;

    
    
    

    public void setArea(){
        double L=super.getX();
    double W=super.getY();
   
     this.area=L*W;
     }
    public double getArea(){
    return area;
    }
    
    public void setPermeter(){
    double L=super.getX();
    double W=super.getY();
    
    this.permeter=2*(L+W);
    
    }
    
    
     public double getPermeter(){
    return permeter;
    }
    
    
    
    
    public void area() {
        setArea();
        System.out.println("Area: "+getArea()); 
    }

    public void permeter(){
        setPermeter();
        System.out.println("permetr : "+getPermeter());
    }
}

