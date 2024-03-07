package Day_1;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int total=sub1+sub2+sub3;
        double perc=(total/300.0)*100;
        System.out.println("Total marks: "+total);
        System.out.println("Percentage: %.2ff% "+ perc);
    }
    
}
