package Day_2.Pre_Lunch;
/* b.
1010101
10101 
  101  
   1 */
import java.util.Scanner;
public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<n-i;k++){
                System.out.print("1");
                if(k<n-i-1){
                    System.out.print("0");
                }
            }
            System.out.println();

        }
       




    }
    
}
