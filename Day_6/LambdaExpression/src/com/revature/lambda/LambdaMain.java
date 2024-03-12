package com.revature.lambda;

public class LambdaMain {
     static int perform(int a,int b,String op,LambdaExp lmb){
         System.out.println("Performing operations: "+op);
         return lmb.operation(a,b);

    }
    public static void main(String[] args) {
         int add= perform(54,21,"+",(a,b)->a+b);
        System.out.println("Addition: "+add);
        int sub=perform(54,77,"-",(a,b)->a-b);
        System.out.println("Subtraction:"+sub);
        int mul=perform(43,10,"*",(a,b)->a*b);
        System.out.println("Multiplication: "+mul);
        int div=perform(21,3,"/",(a,b)->(b!=0)? a/b: 0);
        System.out.println("Division: "+div);



    }
}
