public class Traingle {

    private int a;
    private int b;
    private int c;

    public Traingle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateArea(){
        double s=(a+b+c)/2;
        double area= Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    double calculatePerimeter(){
        return a+b+c;
    }

    public static void main(String[] args) {
        Traingle t1=new Traingle(2 ,3, 4);
        System.out.println("Area :"+t1.calculateArea());
        System.out.println("Perimeter: "+t1.calculatePerimeter());


    }
}
