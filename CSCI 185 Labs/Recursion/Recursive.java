public class Recursive {
    public static int GCD(int m,int n){
        if(m%n==0){
            return n; 
        }
        else{
            return GCD(n,m%n);
        }
    }

public static void main(String[] args) {
    int x=10;
    int y=5;
    System.out.println("GCD of "+x+" and "+y+" is "+GCD(x,y));
    
    
}
}