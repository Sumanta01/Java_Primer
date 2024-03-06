package Day_2.Pre_Lunch;
//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;

public class Check_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();

        if(length==breadth){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is a rectangle");
        }
    
    }
    
}
