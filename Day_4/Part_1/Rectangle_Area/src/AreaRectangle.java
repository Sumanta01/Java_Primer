import java.awt.geom.Area;

public class AreaRectangle {

    private double length;
    private double breath;

    public AreaRectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getArea(){
        return length*breath;
    }



    public static void main(String[] args) {
        AreaRectangle ar=new AreaRectangle(23,45);
        System.out.println(ar.getArea());


    }
}
