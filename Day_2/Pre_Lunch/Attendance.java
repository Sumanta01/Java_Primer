package Day_2.Pre_Lunch;
/*3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 
4.  */

import java.util.Scanner;
public class Attendance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int classesHeld=sc.nextInt();
        int classesAttended=sc.nextInt();
        char medicalCause=sc.next().charAt(0);
    
        double attendance=(classesAttended*100)/classesHeld;
        
        System.out.println("Percentage of classes attended: " + attendance + "%");
        
        if(attendance>=75){
            System.out.println("You are allowed to sit in the exam");
        }
        else if(medicalCause=='Y' || medicalCause=='y'){
            System.out.println("You are allowed to sit in the exam due to medical cause");
        }
        else{
            System.out.println("You are not allowed to sit in the exam");
        }
    }
    
}
