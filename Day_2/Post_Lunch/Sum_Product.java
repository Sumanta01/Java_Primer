package Day_2.Post_Lunch;
import java.util.Scanner;

public class Sum_Product {
    static int sumArray(int []arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    static double productArray(int []arr){
        double product=1;
        for(int i:arr){
            product*=i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of the array: "+sumArray(arr));
        System.out.println("Product of the array: "+productArray(arr));
    }
    
}
