package Day_1;

import java.util.Scanner;
public class Swap_ThirdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
    }
    
}
