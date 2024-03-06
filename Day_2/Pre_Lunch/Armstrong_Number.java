package Day_2.Pre_Lunch;
/*8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.
 */

import java.util.Scanner;

public class Armstrong_Number {
    static int findArmstrong(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp);
        }
        return sum;

    }
        public static void main(String[] args) {
        for(int i=100;i<=500;i++){
            findArmstrong(i);
        }
        
    }
    
}
