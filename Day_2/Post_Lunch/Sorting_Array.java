package Day_2.Post_Lunch;

import java.util.Scanner;
public class Sorting_Array {
    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
                int array[]=new int[n];
                for(int i=0;i<n;i++){
                    array[i]=sc.nextInt();
                } 
            
                
                System.out.println("Initial Array:");
                displayArray(array);
    
                Sorting(array);
        
                
                System.out.println("\nArray after Selection Sort:");
                displayArray(array);
            }
        
            
            static void Sorting(int[] arr) {
                int n = arr.length;
        
                for (int i = 0; i < n - 1; i++) {
                    System.out.println("\nIteration " + (i + 1) + ":");
        
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[i]) {
                            
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
        
                            System.out.println("Swapped: " + arr[i] + " and " + arr[j]);
                        }
                    }
        
                    System.out.print("Array after iteration " + (i + 1) + ": ");
                    displayArray(arr);
                }
            }
        
            
            static void displayArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
    
        

    
}
