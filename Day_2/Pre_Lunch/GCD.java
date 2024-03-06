package Day_2.Pre_Lunch;
/*Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
  */

import java.util.Scanner;

public class GCD {
    static int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is: "+findGcd(a,b));
        
    
}
}
