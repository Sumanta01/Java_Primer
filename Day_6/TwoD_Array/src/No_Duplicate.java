import java.util.HashSet;
import java.util.Scanner;

public class No_Duplicate {
    static boolean Duplicate(int [][]arr, int r ,int c,int key){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
           
            int r = sc.nextInt();
            
            int c = sc.nextInt();

            if (r > 0 && c > 0) {
                HashSet<Integer> set = new HashSet<>();

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        int inp = sc.nextInt();
                        set.add(inp);
                    }
                }
                System.out.println();
                 int flag=0;
                for (int value : set) {
                    System.out.print(value + " ");
                    flag++;
                    if(flag%c==0){
                        System.out.println();
                    
                    }
                }
                
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }
        
    }
}
    