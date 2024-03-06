package Day_2.Post_Lunch;
import java.util.Scanner;
import java.util.Arrays;

public class Reverse_Array {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int[] reversedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = arr[9 - i];
        }

        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Reversed Array: "+ Arrays.toString(reversedArray));
        

    }
    
}
