
package assigment_1;


public class account {
    private int id;
    private double balance;
     public account(int id,double balance){
     this.id=id;
     if(balance>0){
     this.balance=balance;
     }
     else{
     this.balance=0;
     }
  }
    public int getID(){
    return id;
    }
    public double getBalance(){
    return balance;
    }
     public void setDeposit(double amount){
     if(amount>0){
      balance +=amount;
      System.out.println("deposit :"+amount);
     }
     else{
     
         System.out.println("you dont have any deposit");
     
     }
    }
    
        public void setdebit(double ammount){
        if (ammount >this.balance) {
            System.out.println("the ammount is bigger than balance");
            
        }
        else if (ammount > 0) {
            this.balance -=ammount;
            System.out.println("debited : "+ ammount);
        }
        else{
            System.out.println(" the ammount must be positive ");
    }

        }
    
       public void display(){
       
           System.out.println("ID :"+this.id);
       
           System.out.println("the balance is:"+this.balance);
      

       
       }
 
    
    
}
