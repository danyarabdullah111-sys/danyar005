
package week.pkg3;

import java.util.Scanner;

public class Week3 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        watch watch1=new watch(12,12,12);
        watch1.display();
        System.out.println("do you want update the time?");
        System.out.println("1.yes     2.no");
        int U=input.nextInt();
        if(U==1){
            System.out.println("give me the hour");
        int H1=input.nextInt();
            watch1.setHour(H1);
            System.out.println("give the min");
            int M1=input.nextInt();
            watch1.setMin(M1);
            System.out.println("give the sec");
            int S1=input.nextInt();
            watch1.setSec(S1);
            
            watch1.display();
         }
        if(U==2){
            System.out.println("chaktr");
        
        }
        else{
            System.out.println("jwan sairi bka chyt daghllkrdwa");
        }
        watch watch2=new watch(12,12);
        watch2.display();
        watch watch3=new watch(12);
        watch3.display();
        watch watch4=new watch();
        watch4.display();
        
        
        
        
        
        
        
        
        
    }
    
}
