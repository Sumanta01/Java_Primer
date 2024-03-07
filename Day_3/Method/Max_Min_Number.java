package Day_3.Method;

import java.util.Scanner;

public class Max_Min_Number {
    static void maxNumber(int a ,int b, int c){
        if(a>b && a>c){
            System.out.println("Max number is "+a);
        }else if(b>a && b>c){
            System.out.println("Max number is "+b);
        }else{
            System.out.println("Max number is "+c);
        }

    }
    static void minNumber(int a ,int b, int c){
        if(a<b && a<c){
            System.out.println("Min number is "+a);
        }else if(b<a && b<c){
            System.out.println("Min number is "+b);
        }else{
            System.out.println("Min number is "+c);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        maxNumber(a,b,c);
        minNumber(a,b,c);
        
    }
    
}
