
package shapes;

import java.util.Scanner;


public class Shapes {

    

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
     square sqr=new square();
    cube cu=new cube();
        System.out.println("enter the length");
        double L=input.nextDouble();
        sqr.setColor("red");
        sqr.setName("danyar");
sqr.setLength(L);
sqr.setArea();
sqr.setPer();
cu.setVolume();
cu.setPer1();
cu.display2();










    }
    
}
