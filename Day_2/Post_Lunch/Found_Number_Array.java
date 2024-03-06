package Day_2.Post_Lunch;
import java.util.*;

public class Found_Number_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int flag=0;

        for(int i=0;i<n;i++){
            if(arr[i]==num){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Number found in the array");
        }
        else{
            System.out.println("Number not found  in the array");
        }
    }
    
}
