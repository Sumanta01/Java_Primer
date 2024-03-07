package Day_3.String_Manipulations;
import java.util.*;

public class Compare_To {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
        
    
}
