
package shapess;

import java.util.Scanner;


public class Shapess {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("which shape do you want?\n1.rectangle\n2.circle");
        int chs=input.nextInt();
        if(chs==1){
     shape s=new cube();
            System.out.println("enter the length");
            int l=input.nextInt();
            System.out.println("enter the width");
            int w=input.nextInt();
     s.setX(l);
     s.setY(w);
      s.area();
      s.permeter();
        } 
       if(chs==2){
           shape c=new circle();
           System.out.println("enter the radius");
           int R=input.nextInt();
           c.setX(R);
       c.area();
       c.permeter();
       
       
       
       
       } 
        
       else{
           System.out.println("please check your order");
       }
    }
    
}
