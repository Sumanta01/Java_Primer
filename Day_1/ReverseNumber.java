package Day_1;

import java.util.Scanner;
public class ReverseNumber {
    static boolean isThreeDigit(int n){
        if(n>=100 && n<=999){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    if(isThreeDigit(n)){
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
} 
    System.out.println("Revers of the 3 digit number is : " +rev);
    
}
}
