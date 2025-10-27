
package shapes;


public class cube extends square{
    private double volume;
    private double per;
    public void setVolume(){
   this.volume=6*super.getArea()*super.getArea();
   }
     public void setPer1(){
   this.per=12*super.getArea();
   }
    
    public double getPer1(){
   return per;
   }
     public double getVolume(){
   return volume;
   }
     public void display2(){
        System.out.println(getVolume());
        System.out.println(getPer1());
    
    }
     
     
     
     
    
    
}
