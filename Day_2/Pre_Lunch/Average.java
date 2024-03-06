package Day_2.Pre_Lunch;
/*4. Take 10 integers from keyboard using loop and print their average value on the screen.
  */

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalNum=10;
        int sum=0;
        for(int i=1;i<=totalNum;i++){
            sum+=sc.nextInt();
        }
        double avg=(double)sum/totalNum;
        System.out.println("Average: " + avg);


    }
}
