package week.pkg3;

public class watch {
    private int hour;
    private int min;
    private int sec;
    public void setHour(int H){
    hour=H;
    }
    public void setMin(int M){
    min=M;
    }
    public void setSec(int S){
    sec=S;
    }
    public watch(int hour,int min,int sec){
   this.hour=hour;
   this.min=min;
   this.sec=sec;
    }
    public watch(int H,int M){
    this(H,M,0);
    }
    public watch(int H){
    this(H,0,0);
    }
    public watch(){
    this(0,0,0);
    }
    public int getHour(){
    return hour;
    }
     public int getMin(){
    return min;
    }
    public int getSec(){
    return sec;
    }
    void display(){
        System.out.println(hour+":"+min+":"+sec);
    }
     
     
     
    
    
}
