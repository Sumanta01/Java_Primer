import java.util.Scanner;

public class Average {

    void calculateAvg(double a ,double b,double c){
        double d=(a+b+c)/3;
        System.out.println("Avg: "+d);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        Average av=new Average();
        av.calculateAvg(a,b,c);

    }
}
