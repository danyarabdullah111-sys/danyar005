
package students;

import java.util.Scanner;


public class Students {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
       student obj =new student("xxyy",12,2); 
       obj.display();
        System.out.println("enter your name");
        String N=input.nextLine();
        obj.setName(N);
        System.out.println("enter your semster");
        int S=input.nextInt();
        obj.setSem(S);
        
        obj.display();
        
        
       
    }
    
}
