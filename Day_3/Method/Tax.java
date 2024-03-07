package Day_3.Method;
import java.util.Scanner;

public class Tax {
    static double findTax(double g_Salary,double T_Saving){
        double tax=0;
        double taxIncome=Math.max(g_Salary-T_Saving, 0);
        if(taxIncome>1000000 && taxIncome<=2000000){
            tax+=0.10*(taxIncome-1000000);
        }
        if(taxIncome>2000000 && taxIncome<=5000000){
            tax+=0.20*(taxIncome-2000000);
        }
        if(taxIncome>5000000){
            tax+=0.30*(taxIncome-5000000);
        }
        return tax;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double g_Salary=sc.nextDouble();
        double T_Saving=sc.nextDouble();
        System.out.println(findTax(g_Salary, T_Saving));
    }
    
}
