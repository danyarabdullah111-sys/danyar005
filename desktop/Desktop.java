
package desktop;

import java.util.Scanner;


public class Desktop {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ram obj=new ram(); 
        System.out.println("enter laptop's brand");
        String B=input.nextLine();
        obj.setBrand(B);
        System.out.println("enter laptop's processor");
        String P=input.nextLine();
        obj.setBrand(P);
        System.out.println("enter laptop's RAM");
        double R=input.nextDouble();
        obj.setRam(R);
        System.out.println("do you want upgrade your RAM");
        System.out.println("1.yes");
        System.out.println("2.no");
        System.out.println("");
        int i=input.nextInt();
        
        if(i==2){
            System.out.println(B);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
        
    
}
