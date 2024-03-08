import java.util.Scanner;

public class EmpSalaryProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeInfo emp=new EmployeeInfo();
        double salary=sc.nextDouble();
        int  hour=sc.nextInt();

        emp.getInfo(salary,hour);
        emp.addSal();
        emp.addWork();
        emp.printFinalSalary();
    }
}
