import java.util.*;
public class Array_TwoD {
    
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(r>0 && c>0){
                int [][]arr=new int [r][c];
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        arr[i][j]=sc.nextInt();
                    }
                    System.out.println();
                }
                
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        if(!isPrime(arr[i][j])){
                            System.out.print(arr[i][j]+" ");

                        }else{
                            System.out.print("_ ");
                        }
                        
                    }
                    System.out.println();
                    
                }
                break;
            
            }else{
                System.out.println("Invalid Input!");
            }
        }



    }
}
