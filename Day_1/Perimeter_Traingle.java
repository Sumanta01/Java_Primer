package Day_1;


public class Perimeter_Traingle {
    static double findPerimeter(double a,double b,double c){
        return a+b+c;
    }
    static boolean isValid(double a,double b,double c){
        return a+b>c && b+c>a && c+a>b;
    }

    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("Invalid Input");
            return;
        }
        try{
        double a= Double.parseDouble(args[0]);
        double b= Double.parseDouble(args[1]);
        double c= Double.parseDouble(args[2]);

        if(isValid(a, b, c)){
            System.out.println("Perimeter of triangle is "+findPerimeter(a, b, c));
        }else{
            System.out.println("Invalid triangle");
        }
        }catch(NumberFormatException e){
    
        }
        
    }
    
}
