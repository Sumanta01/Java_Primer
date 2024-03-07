package Day_3.Method;
import java.util.Scanner;

public class Tax {
    static double taxCalculator(double g_Salary,double T_Saving){
        double tax=0;
        double taxIncome=Math.max(g_Salary-T_Saving, 0);
        if(taxIncome>100000 && taxIncome<=200000){
            tax+=0.10*(taxIncome-100000);
        }
        if(taxIncome>200000 && taxIncome<=500000){
            tax+=0.20*(taxIncome-200000);
        }
        if(taxIncome>500000){
            tax+=0.30*(taxIncome-500000);
        }
        return tax;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double g_Salary=sc.nextDouble();
        double T_Saving=sc.nextDouble();
        System.out.println(taxCalculator(g_Salary, T_Saving));
    }
    
}
