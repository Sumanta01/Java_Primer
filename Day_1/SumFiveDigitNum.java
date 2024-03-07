package Day_1;
import java.util.*;
public class SumFiveDigitNum {
    static boolean isFiveDigit(int n){
        if(n>=10000 && n<=99999){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(isFiveDigit(n)){
            int first=n/10000;
            int secondLast=(n/10)%10;
            sum=sum+first+secondLast;
        }
        System.out.println("Sum of first and second last digit is: "+sum);
    }
    
}
