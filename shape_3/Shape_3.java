
package shape_3;

import java.util.Scanner;


public class Shape_3 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      cylinder c1=new cylinder();
      circle c2=new circle();
       int chs=-1;
      while(chs!=0){
        System.out.println("please enter that case that you want");
       System.out.println("1.circle");
                System.out.println("2.cylinder");
                System.out.println("0.EXSIST");
       chs=input.nextInt();
                
                if(chs==1){
                c2.input();
                c2.display();
                    System.out.println("*********************************");
                }

if(chs==2){
c1.input();
c1.display();
    System.out.println("*********************************");
}
if(chs==0){
    System.out.println("exist");
}
else{
    System.out.println("check your case");

}

      }
    }
    
}
