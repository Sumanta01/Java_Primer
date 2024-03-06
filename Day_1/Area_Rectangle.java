package Day_1;

public class Area_Rectangle {
    public static void main(String[] args) {
    
                
                if (args.length != 2) {
                    return;
                }
        
                
                try {
                    double length = Double.parseDouble(args[0]);
                    double breadth = Double.parseDouble(args[1]);
        
                
                    double area = length * breadth;
                    double perimeter = 2 * (length + breadth);
        
                    
                    System.out.println("Area of the rectangle: " + area);
                    System.out.println("Perimeter of the rectangle: " + perimeter);
                } catch (Exception e) {
                    System.out.println("Invalid input!" );
                }
        
    }
    
}
