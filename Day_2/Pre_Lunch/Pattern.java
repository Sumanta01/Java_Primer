package Day_2.Pre_Lunch;

import java.util.Scanner;


/*Print the following patterns using loop :
a.
*
**
***
**** */


public class Pattern {
     static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
        
    }

    
}
