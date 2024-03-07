package Day_3.Method;

public class Multiplier15 {
    static void multiply(int n,int mul){
        if(mul>10){
            return;
        }
        System.out.println(n+"*"+mul+"="+n*mul);
        multiply(n, mul+1);


    }
    
    public static void main(String[] args) {
        multiply(15,1);
    }
    
}
