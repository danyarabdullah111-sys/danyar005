
package shapess;


public abstract class shape {
 private double x;
 private double y;
 
 
 
 public void setX(double x){
 this.x=x;
 }   
  public double getX(){
  return x;
  }  
   public void setY(double y){
 this.y=y;
 }   
  public double getY(){
  return y;
  }   
   void draw(){
       System.out.println("drawing.....");
   } 
   public abstract void area();
   
   
   public abstract void permeter();
   
    public abstract void resize();
           
           
           
           
           
           
}
