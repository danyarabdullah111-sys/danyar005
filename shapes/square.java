
package shapes;


public class square extends shape {
    
   private double area;
   private double per;
   public void setArea(){
   this.area=super.getLength()*super.getLength();
   this.area=super.getArea;
   }
    public void setPer(){
   this.per=4*super.getLength();
   }
   
   public double getPer(){
   return per;
   }
   public void display1(){
        System.out.println("shapes Area :"+getArea());
        System.out.println("shapes Per :"+getPer());
    
    }
   
   
   
   
   
    
}
