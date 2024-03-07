package Day_1;

import java.util.Scanner;

public class NumberMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=(((n+8)/3)%5)*5;
        System.out.println(res);
        
    }
    
}
