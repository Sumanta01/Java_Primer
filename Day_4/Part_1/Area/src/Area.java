import java.util.Scanner;

public class Area {

    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double returnArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();
        Area a=new Area(length ,breadth);
        System.out.println("Area : "+a.returnArea());
    }
}
