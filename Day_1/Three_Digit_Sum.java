package Day_1;

import java.util.Scanner;
public class Three_Digit_Sum {
    static boolean isThreeDigit(int n){
        if(n>=100 && n<=999){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(isThreeDigit(n)){
            int first=n/100;
            int second=(n/10)%10;
            int third=n%10;
            sum=first+second+third;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
    
}
