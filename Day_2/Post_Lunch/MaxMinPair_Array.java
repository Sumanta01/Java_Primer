package Day_2.Post_Lunch;
import java.util.Scanner;

public class MaxMinPair_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        if(n<2){
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxDiff=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        int maxElm1=0,maxElm2=0,minElm1=0,minElm2=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]>maxDiff){
                    maxDiff=arr[j]-arr[i];
                    maxElm1=arr[i];
                    maxElm2=arr[j];
                }
                if(arr[j]-arr[i]<minDiff){
                    minDiff=arr[j]-arr[i];
                    minElm1=arr[i];
                    minElm2=arr[j];
                }
            }
        }
        System.out.println("Maximum difference: "+maxDiff);
        System.out.println("Elements: "+maxElm1+" "+maxElm2);
        System.out.println("Minimum difference: "+minDiff);
        System.out.println("Elements: "+minElm1+" "+minElm2);

    }
    
}
