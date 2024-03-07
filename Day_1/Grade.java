package Day_1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalStudents=sc.nextInt();
        int boys=sc.nextInt();
        double gradePerc=sc.nextDouble();
        int boysWithGradeA=sc.nextInt();

        int totalGradeStudent=(int)((gradePerc/100)*totalStudents);
        int girlsWithGradeA=totalGradeStudent-boysWithGradeA;

        System.out.println("Total number of girls getting grade 'A': "+totalGradeStudent);


    }
    
}
