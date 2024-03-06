package Day_2.Post_Lunch;

import java.util.Scanner;
public class Input_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
             System.out.print(arr[i]);

        }
    

    }
    
}
