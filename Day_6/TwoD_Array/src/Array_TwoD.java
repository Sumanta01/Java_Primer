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
    static int [][]withoutPrime(int r,int c){
        int [][]arr=new int[r][c];
        int count=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                while(isPrime(count)){
                    count++;
                }
                arr[i][j]=count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=withoutPrime(r,c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
