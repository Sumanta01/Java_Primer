package Day_2.Post_Lunch;
import java.util.Scanner;

public class TypesNumberArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        for(int i=0;i<20;i++){
            arr[i]=sc.nextInt();
        }
        int positive=0;
        int negative=0;
        int odd=0;
        int even=0;
        int zero=0;
        for(int i=0;i<20;i++){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else{
                zero++;
            }
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("Zero numbers: "+zero);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
        

    }
    
}
