package Day_2.Pre_Lunch;

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
